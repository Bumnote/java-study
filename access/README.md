# 접근 제어자 (Access Modifier)

접근 제어자를 사용하면 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다. 이 기능은 왜 필요한 것일까? 예를 들어, 회원의 정보를 가지는 클래스가
있다고 하자. 이때 필드 멤버들의 접근 제어자를 `public`으로 설정하면 어느 곳에서나 회원 정보 데이터에 접근할 수 있게 된다. 실수로 해당 정보를 변경해버린다면 큰 문제가
발생할 것이다.

이렇듯, 접근 제어자의 핵심은 `속성(필드 멤버)`, `기능(메소드)`을 외부로부터 숨기는 것이다.

## 접근 제어자 분류

접근 제어자는 크게 `public`, `protected`, `default`, `private`로 나뉜다.

### public

모든 외부 호출을 허용한다. 즉, 기능을 숨기지 않고, 어디서든 호출할 수 있게 공개한다.

### protected

같은 패키지 안에서 호출은 허용한다. 또한, 패키지가 달라도 상속 관계의 호출은 허용한다. 즉, 상속 관계로 속성과 기능을 숨길 때 사용하며, 상속 관계가 아닌 곳에서 해당 기능을
호출할 수 없다.

### default (Package-Private)

같은 패키지 안에서 호출은 허용한다. 접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 `default` 접근 제어자가 적용된다. 실제로 `default` 보다는
`package-private` 표현이 더 정확한 표현이라고 할 수 있다. 즉, 나의 패키지 안으로 속성과 기능을 숨길 때 사용하며 외부 패키지에서 해당 기능을 호출할 수 없다.

### private

모든 외부 호출을 막고, 같은 클래스 내부에서만 호출을 허용한다. 즉, 나의 클래스 안으로 속성과 기능을 숨길 때 사용하며 외부 클래스에서 해당 기능을 호출할 수 없다.

### 접근 제어자 비교표

| 접근 제어자    | 클래스 내부 | 같은 패키지 | 다른 패키지의 자식 클래스 | 다른 패키지의 일반 클래스 |
|-----------|--------|--------|----------------|----------------|
| public    | O      | O      | O              | O              |
| protected | O      | O      | O              | X              |
| default   | O      | O      | X              | X              |
| private   | O      | X      | X              | X              |

## 접근 제어자 사용 위치

접근 제어자는 필드와 메서드, 생성자에 사용된다. 클래스 레벨에서도 제한적으로 접근 제어자를 사용할 수 있다.

### 클래스 레벨 접근 제어자

- 클래스 레벨의 접근 제어자는 `public`과 `default`만 사용할 수 있다.
- `public` 클래스는 반드시 파일명과 이름이 같아야 한다.
    - 즉, 하나의 자바 파일에는 파일명과 이름이 같은 `public` 클래스가 존재하고, `default` 접근 제어자를 사용하는 클래스를 무한정 만들 수 있다.

```java
package access.a;

// 파일명: PublicClass.java
public class PublicClass {

  public static void main(String[] args) {
    System.out.println("This is a public class.");
  }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
```

# 캡슐화 (Encapsulation)

캡슐화는 객체 지향 프로그래밍의 핵심 개념 중 하나로, 객체의 속성과 기능을 하나로 묶고, 외부에서 직접 접근하지 못하도록 제한하는 것을 의미한다. 즉, 캡슐화를 통해서 데이터의
직접적인 변경을 방지하거나 제한할 수 있다. 객체에서는 숨겨야 할 대상으로 `데이터`와 `기능`이 있다.

## 데이터를 숨겨라

데이터를 숨기지 않는다면 무슨 일이 발생할까? 은행 관련 데이터가 있다고 하자. 데이터의 접근 제어자가 `public`이라면 모든 로직을 무시하고도 내 통장 잔고에 접근하여 값을
변경시킬 수 있을 것이다. 결국 모든 안전망을 빠져나가게 된다. 이렇게 된다면 캡슐화가 깨지는 것이다.

즉, 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다. ex) `getBalance()`, `setBalance()`와 같은 메서드를 통해서 접근해야 한다.
이렇게 함으로써 데이터의 무결성을 보장할 수 있다.

```java
class BankAccount {

  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    }
  }
}
```

## 기능을 숨겨라

객체의 기능 중에서 외부에서 사용하지 않고, 내부에서만 사용하는 기능들이 있다. 이런 기능도 감추는 것이 훨씬 좋다. 우리가 운전할 때, 복잡한 엔진 조절 기능, 배기 기능까지
구체적으로 내부에서 어떻게 동작하는지 굳이 알 필요가 없다. 그냥 페달을 밟고, 버튼을 눌러서 특정 기능을 사용하듯이 주어진 기능들을 가져다 쓰면 되는 것이다.

즉, 객체의 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하고, 내부에서 동작해야만 하는 기능들은 모두 내부로 숨기자.

```java
public class BankAccount {

  private int balance;

  public BankAccount() {
    balance = 0;
  }

  // public 메서드: deposit
  public void deposit(int amount) {
    if (isAmountValid(amount)) {
      balance += amount;
    } else {
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  public void withdraw(int amount) {
    if (isAmountValid(amount) && balance - amount >= 0) {
      balance -= amount;
    } else {
      System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }
  }

  public int getBalance() {
    return balance;
  }

  private boolean isAmountValid(int amount) {
    // 금액이 0보다 커야함
    return amount > 0;
  }
}
```