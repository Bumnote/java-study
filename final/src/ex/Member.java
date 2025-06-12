package ex;

public class Member {

  private final String id;
  private String name;

  public Member(String id, String name) {
    this.id = id; // final 필드는 생성자에서 초기화 가능
    this.name = name;
  }

  public void changeData(String id, String name) {
    // this.id = id; // 컴파일 에러 발생, final 필드는 재할당 불가
    this.name = name; // 일반 필드는 재할당 가능
  }

  public void print() {
    System.out.println("ID: " + id + ", Name: " + name);
  }
}
