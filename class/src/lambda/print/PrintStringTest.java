package lambda.print;

public class PrintStringTest {

  public static void main(String[] args) {
    PrintString lambdaStr = (str) -> System.out.println(str);
    lambdaStr.showString("Hello Lambda1");
    showMyString(lambdaStr);
  }

  private static void showMyString(PrintString p) {
    p.showString("Hello Lambda2");
  }

}
