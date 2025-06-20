package pack;

import pack.a.User;

public class PackageMain3 {

  public static void main(String[] args) {
    User userA = new User();
    pack.b.User userB = new pack.b.User(); // 패키지 명을 붙여서 사용
  }
}
