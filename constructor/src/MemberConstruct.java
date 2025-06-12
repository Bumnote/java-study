public class MemberConstruct {

  String name;
  int age;
  int grade;

  MemberConstruct(String name, int age) {
    this(name, age, 50);
//    this.name = name;
//    this.age = age;
//    this.grade = 50;
  }

  MemberConstruct(String name, int age, int grade) {
    System.out.println("MemberConstruct 생성자 호출");
    System.out.println("이름: " + name + ", 나이: " + age + ", 성적: " + grade);
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
