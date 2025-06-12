public class FinalLocalMain {

  public static void main(String[] args) {
    // final 지역 변수 1
    final int data1;
    data1 = 10;
    // data2 = 20; // 컴파일 에러 발생, final 변수는 재할당 불가

    // final 지역 변수 2
    final int data2 = 10;
    // data2 = 20; // 컴파일 에러 발생, final 변수는 재할당 불가

  }

  static void method(final int parameter) {
    // parameter = 10; // 컴파일 에러 발생, final 매개변수는 재할당 불가
  }
}
