package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;
    return id == student.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

public class DistinctTest {

  public static void main(String[] args) {
    Student studentLee = new Student(100, "이윤선");
    Student studentMoon = new Student(200, "문찬욱");
    Student studentLee2 = new Student(100, "이윤선");

    List<Student> studentList = new ArrayList<>();
    studentList.add(studentLee);
    studentList.add(studentMoon);
    studentList.add(studentLee2);

    System.out.println("학생 이름 목록 (중복 제거):");
    studentList.stream()
        .map(Student::getName)
        .distinct()
        .forEach(s -> System.out.println(s));

    System.out.println("\n학생 객체 목록 (중복 제거):");
    studentList.stream()
        .distinct()
        .forEach(s -> System.out.println(s.getName()));
  }
}
