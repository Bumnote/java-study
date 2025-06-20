package ex2;

public class AccountMain {

  public static void main(String[] args) {
    Account account = new Account();

    account.deposit(10_000);
    account.withdraw(9_000);
    account.withdraw(2_000);

    System.out.println("잔고: " + account.balance);
  }
}
