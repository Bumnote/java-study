package lambda.concat;

public class TestStringConcat {

  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "world";

    StringConcatImpl concat1 = new StringConcatImpl();
    // 기본 방식
    concat1.makeString(s1, s2);

    // 람다식 활용
    StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
    concat2.makeString(s1, s2);
  }

}
