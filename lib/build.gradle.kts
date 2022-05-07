plugins {
    `java-library`
}

group = "io.github.stackunderflow111"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.compilerArgs.apply {
        // turn off debug information generation. Without it method parameter names will
        // always be generated regardless of whether the "-parameters" argument is passed or not.
        add("-g:none")
        // if you comment it out, mapstruct will throw a warning, and the generated mapper produces
        // a SetEvent with all the fields null. This is because the parameters of SetEvent
        // get renamed to arg0, arg1 and arg2
        add("-parameters")
    }
}