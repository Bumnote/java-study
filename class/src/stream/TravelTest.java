package stream;

import java.util.List;

public class TravelTest {

  public static void main(String[] args) {
    TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
    TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
    TravelCustomer customerPark = new TravelCustomer("박영희", 13, 50);

    List<TravelCustomer> customerList = List.of(customerLee, customerKim, customerPark);

    System.out.println("여행 고객 명단:");
    int total = customerList.stream()
        .mapToInt(TravelCustomer::getPrice)
        .sum();

    customerList.stream()
        .map(TravelCustomer::getPrice);

    System.out.println("총 금액: " + total);

  }

}
