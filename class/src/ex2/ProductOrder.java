package ex2;

import java.util.List;

public class ProductOrder {

  String productName;
  int price;
  int quantity;

  ProductOrder(String productName, int price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  void displayProductOrderInfo() {
    System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", this.productName, this.price,
        this.quantity);
  }
}
