package ex2;

import static ex2.MathArrayUtils.*;

public class MathArrayUtilsMain {

  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5};

    System.out.println("Sum: " + sum(values));
    System.out.println("Average: " + average(values));
    System.out.println("Min: " + min(values));
    System.out.println("Max: " + max(values));
  }
}
