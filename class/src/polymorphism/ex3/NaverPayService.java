package polymorphism.ex3;

public class NaverPayService implements PaymentService {

  @Override
  public void pay(int amount) {
    System.out.println("네이버페이 결제");
  }

}
