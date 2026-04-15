package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

  public static void main(String[] args) throws FileNotFoundException {

    FileInputStream fis = null;

    try {
      fis = new FileInputStream("a.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e);
      return;
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      System.out.println("항상 실행");
    }

    System.out.println("프로그램 종료");
  }

}
