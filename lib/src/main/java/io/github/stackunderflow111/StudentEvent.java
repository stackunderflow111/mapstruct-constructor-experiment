package io.github.stackunderflow111;

public class StudentEvent {
  private String id;
  private String name;
  private String birthday;

  public StudentEvent(String id, String name, String birthday) {
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

  public String getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "StudentEvent{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", birthday='" + birthday + '\'' +
        '}';
  }
}
