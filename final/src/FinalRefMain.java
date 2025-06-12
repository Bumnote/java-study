public class FinalRefMain {

  public static void main(String[] args) {
    final Data data = new Data();
    // data = new Data(); // 컴파일 에러 발생, final 참조 변수는 참조값 재할당 불가

    // 참조 대상의 객체 값은 변경 가능
    data.value = 10;
    System.out.println(data.value);
    data.value = 20;
    System.out.println(data.value);
  }
}
