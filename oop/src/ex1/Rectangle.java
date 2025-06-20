package ex1;

public class Rectangle {

  int width;
  int height;

  int caclulateArea() {
    return width * height;
  }

  int calculatePerimeter() {
    return 2 * (width + height);
  }

  boolean isSquare() {
    return width == height;
  }
}
