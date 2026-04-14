package stream;

import java.util.ArrayList;
import java.util.List;

class Book {

  private String name;
  private int price;

  public Book(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}

public class LibraryTest {

  public static void main(String[] args) {

    List<Book> bookList = new ArrayList<>();

    bookList.add(new Book("자바", 25000));
    bookList.add(new Book("파이썬", 15000));
    bookList.add(new Book("안드로이드", 30000));

    int total = bookList.stream()
        .mapToInt(Book::getPrice)
        .sum();

    System.out.println("총 금액: " + total);

    bookList.stream()
        .filter(x -> x.getPrice() >= 20000)
        // 책의 이름을 정렬
        .sorted((x1, x2) -> x2.getName().compareTo(x1.getName()))
        .forEach(x -> System.out.println(x.getName()));
  }

}
