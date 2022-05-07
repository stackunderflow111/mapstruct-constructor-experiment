## Introduction

This repo shows how mapstruct mapper generation is affected by the presence of constructor parameter names. When the 
Java bytecode has constructor parameter names, the mappers can be generated properly. Otherwise, we will encounter issues.

## How to experiment

First, run the [Main class](app/src/main/java/io/github/stackunderflow111/Main.java) to make sure it works properly.

Then, let's try removing the constructor parameter names from the Java bytecode. Follow the steps below.

1. remove the line `add("-parameters")` in the [`build.gradle.kts` for sub-project `lib`](lib/build.gradle.kts), 
2. run `./gradlew clean` to clean the previously generated mapstruct mappers
3. run `./gradlew classes` to compile the whole project

You will get a warning from mapstruct which says:

```
Unmapped target properties: "arg0, arg1, arg2".
StudentEvent studentEventFrom(Student student);
             ^
```

and if you open the generated mapper you will find the following:

```java
public class StudentMapperImpl implements StudentMapper {

  @Override
  public StudentEvent studentEventFrom(Student student) {
    if ( student == null ) {
      return null;
    }

    String arg0 = null;
    String arg1 = null;
    String arg2 = null;

    StudentEvent studentEvent = new StudentEvent( arg0, arg1, arg2 );

    return studentEvent;
  }
}
```

Note that it constructs a `StudentEvent` with all the fields `null`.

The main reason of this problem is that without the `-parameters` argument, method parameters are not correctly persisted
into Java bytecode (in our case they are renamed to `arg0`, `arg1`, etc.), and mapstruct cannot generate the proper mapping
code using the constructor without correct parameter names.

Try to add the line `add("-parameters")` back, do a clean and re-compile the whole project, you will find that it works
again.
