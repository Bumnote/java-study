public class BankAccountMain {

  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    account.deposit(10_000);
    account.withdraw(3_000);
    System.out.println("잔액: " + account.getBalance() + "원");
  }
}
