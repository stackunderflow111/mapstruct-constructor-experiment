package io.github.stackunderflow111;

import java.time.Instant;

public class Student {
  private final String id;
  private final String name;
  private final Instant birthday;

  public Student(String id, String name, Instant birthday) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Instant getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", birthday=" + birthday +
        '}';
  }
}
