package ex;

public class MemberMain {

  public static void main(String[] args) {
    Member member = new Member("myId", "kim");
    member.print();
    member.changeData("myId2", "lee"); // id는 변경 불가, name은 변경 가능
    member.print();
  }
}
