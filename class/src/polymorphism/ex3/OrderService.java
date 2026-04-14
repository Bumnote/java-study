package polymorphism.ex3;

public class OrderService {

  private final PaymentService paymentService;

  public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public void order() {
    paymentService.pay(1000);
  }
}
