package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

  public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(filename);
    Class c = Class.forName(className);
    return c;
  }

  public static void main(String[] args) {
    ThrowsException test = new ThrowsException();
    try {
      test.loadClass("a.txt", "java.lang.String");
    } catch (FileNotFoundException e) {
      System.out.println("파일이 존재하지 않습니다.");
    } catch (ClassNotFoundException e) {
      System.out.println("클래스가 존재하지 않습니다.");
    } catch (Exception e) {
      System.out.println("알 수 없는 예외가 발생했습니다.");
    }
  }

}
