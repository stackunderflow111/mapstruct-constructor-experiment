package io.github.stackunderflow111;

import java.time.Instant;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("4352387", "John", Instant.now());
    StudentMapper studentMapper = StudentMapper.INSTANCE;
    StudentEvent studentEvent = studentMapper.studentEventFrom(student);
    System.out.println(studentEvent);
  }
}
