package b;

import a.AccessData;

public class AccessOuterMain {

  public static void main(String[] args) {
    AccessData data = new AccessData();
    // public 호출 가능
    data.publicField = 1;
    data.publicMethod();

    // 다른 패키지 default 호출 불가
    // data.defaultField = 2;
    // data.defaultMethod();

    // private 호출 불가
    // data.privateField = 3; // 컴파일 에러 발생, 접근 불가
    // data.privateMethod(); // 컴파일 에러 발생, 접근 불가

    data.innerAccess(); // 내부 메서드 호출, private 필드 접근 가능

  }
}
