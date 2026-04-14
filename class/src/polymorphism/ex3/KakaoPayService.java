package polymorphism.ex3;

public class KakaoPayService implements PaymentService {

  @Override
  public void pay(int amount) {
    System.out.println("카카오페이 결제");
  }
}
