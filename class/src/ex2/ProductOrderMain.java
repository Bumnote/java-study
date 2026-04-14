package ex2;

import java.util.List;

public class ProductOrderMain {

  public static void main(String[] args) {

    ProductOrder order1 = new ProductOrder("두부", 2000, 2);
    ProductOrder order2 = new ProductOrder("김치", 5000, 1);
    ProductOrder order3 = new ProductOrder("콜라", 1500, 2);

    List<ProductOrder> productOrders = List.of(order1, order2, order3);

    int totalPrice = 0;
    for (ProductOrder order : productOrders) {
      order.displayProductOrderInfo();
      totalPrice += order.price * order.quantity;
    }

    System.out.println("총 결제 금액: " + totalPrice);
  }
}
