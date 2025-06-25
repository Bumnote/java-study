package ex2;

import com.sun.tools.javac.Main;
import java.util.Arrays;

public class MathArrayUtils {

  private MathArrayUtils() {
  }

  public static int sum(int[] values) {
    return Arrays.stream(values).sum();
  }

  public static double average(int[] values) {
    if (values.length == 0) {
      return 0.0;
    }
    return (double) sum(values) / values.length;
  }

  public static int min(int[] values) {
    return Arrays.stream(values).min()
        .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
  }

  public static int max(int[] values) {
    return Arrays.stream(values).max()
        .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
  }
}
