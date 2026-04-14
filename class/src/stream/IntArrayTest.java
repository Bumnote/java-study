package stream;

import java.util.Arrays;
import java.util.List;

public class IntArrayTest {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};

    int sumVal = Arrays.stream(arr).sum();
    long count = Arrays.stream(arr).count();

    System.out.println("합계: " + sumVal);
    System.out.println("개수: " + count);

    List<String> sList = List.of("Tomas", "Edward", "Jack");
    sList.stream()
        .forEach(System.out::println);
  }
}
