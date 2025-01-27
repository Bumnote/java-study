package classpart.ex1;

public class FunctionTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2); // 인자를 add 함수로 넘겨준다.
        System.out.printf("%d + %d = %d\n", num1, num2, sum);

    }

    // 접근 제어자 + (정적 키워드) + 반환형 함수명(매개변수)
    // 넘겨받은 인자를 함수의 매개변수로 받아 함수 내부에서 사용한다.
    private static int add(int num1, int num2) {
        return num1 + num2; // 반환값
    }
}
