## Constructor(생성자)

### 생성자 존재 이유

생성자는 객체가 생성될 때 호출되는 특별한 메서드이다. 왜 객체가 생성될 때, 생성자를 호출하는 것일까? 그것은 바로 객체의 속성(필드 변수)을 초기화하는 역할을 하기 때문이다.
값을 초기화하는 것 이외에도, 생성자 내부에서 객체가 생성될 때 필요한 다른 작업들을 수행할 수 있다. 예를 들어, 객체가 생성될 때 데이터베이스 연결을 설정하거나, 외부 API를
호출하여 초기 데이터를 가져오는 등의 작업을 할 수 있다. 간단하게 생성자 코드를 살펴보면 다음과 같다.

```java
class Practice {

  String name;
  String email;
  int age;

  Practice(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }
}
```

### this 키워드

`this` 키워드는 현재 객체를 참조하는 데 사용된다. 생성자 내부에서 `this` 키워드를 사용하여 객체(자신)의 필드 변수에 접근할 수 있다. 위의 예제에서
`this.name`, `this.email`, `this.age`는 현재 객체의 필드 변수에 접근하는 것을 의미한다. 생성자에서 매개변수와 필드 변수가 같은 이름을 가질 때,
`this` 키워드를 사용하여 필드 변수를 명확하게 구분할 수 있다.

만약 `this` 키워드를 사용하지 않으면, 매개변수와 필드 변수가 혼동되어 올바른 값을 할당하지 못할 수 있다. 실제로도 필드 변수와 매개변수의 이름이 같을 때, 매개변수가 코드
블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.

```java
// 진행 과정 
this.name =name; // 오른쪽 name은 매개변수 name을 의미한다.
this.name ="user";
x001.name ="user"; // "this."은 인스턴스 자신의 참조값을 뜻한다.
```

이러한 ```this 키워드```는 생략될 수 있다. 만약 매개변수와 필드 변수가 다른 이름을 가지고 있다면, `this` 키워드를 생략해도 된다. 예를 들어, 다음과 같이 작성할
수 있다.

```java
class Practice {

  String name;
  String email;
  int age;

  Practice(String memberName, String memberEmail, int memberAge) {
    name = memberName;
    email = memberEmail;
    age = memberAge;
  }
}
```

### 생성자 특징

생성자는 기본적으로 다음과 같은 특징을 가진다.

1. 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
2. 생성자는 반환 타입이 없다. 비워두어야 한다.
3. 생성자를 정의하지 않은 경우, 자바 컴파일러는 기본 생성자를 자동으로 생성하여 호출한다.
4. 직접 정의한 생성자가 하나라도 있다면, 자바 컴파일러는 기본 생성자를 자동으로 생성하지 않는다.

```java
class Practice {

  String name;
  String email;
  int age;

  Practice(String memberName, String memberEmail, int memberAge) {
    name = memberName;
    email = memberEmail;
    age = memberAge;
  }
}

class Main {

  public static void main(String[] args) {

    Practice practice = new Practice("John", "test@com", 25);
  }
}
```

생성자는 인스턴스가 생성되면서 자동으로 호출된다. ```new```키워드를 사용해서 객체를 생성할 때, 마지막에 괄호 "()"도 포함해야 하는 이유가 바로 생성자 때문이다. 즉,
인스턴스를 생성하면서 동시에 생성자를 호출한다는 의미를 가지는 것이다. 분명히 생성자 없이도 ```create()```메서드를 만들어서 사용해도 될텐데, 인스턴스를 생성하면서
생성자를 동시에 호출함으로써 얻는 이득은 무엇일까?

생성자 기능을 활용하지 않고, "create()"와 같은 메서드를 사용한다면 인스턴스를 생성한 후에 별도로 메서드를 호출해야 한다. 이 과정에서 만약 메서드 호출을
잊어버린다면, 인스턴스가 올바르게 초기화되지 않을 수 있다. 그러나, 생성자를 사용하면 인스턴스를 생성하면서 자동으로 초기화 작업을 수행할 수 있고, 실수를 한다고 해도
컴파일 단계에서 오류가 나기 때문에 반드시 수정할 수 밖에 없다. (컴파일 오류는 IDE에서 즉시 확인할 수 있는 좋은 오류이다 :>)

### 생성자 오버로딩

생성자 오버로딩이란, 같은 클래스 내에서 여러 개의 생성자를 정의하는 것을 의미한다. 생성자는 매개변수의 개수나 타입에 따라 구분되기 때문에, 서로 다른 매개변수를 가진 생성자를
가질 수 있다. 예를 들어, 다음과 같이 생성자를 오버로딩할 수 있다.

```java
public class Member {

  String name;
  String email;
  int age;

  public Member(String name, String email) {
    this.name = name;
    this.email = email;
    this.age = 0; // 기본값으로 나이를 0으로 설정
  }

  public Member(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }
}
```

이렇게 생성자를 오버로딩하면, 객체를 생성할 때 필요한 매개변수에 따라 적절한 생성자를 선택하여 사용할 수 있다. 예를 들어, 다음과 같이 객체를 생성할 수 있다.

```java
class Main {

  public static void main(String[] args) {
    Member member1 = new Member("Bob", "example@com");
    Member member2 = new Member("Alice", "test@com", 30);
  }
}
```

이렇게 생성자 오버로딩을 사용하면, 객체를 생성할 때 필요한 정보를 유연하게 제공할 수 있다. 또한, 기본값을 설정하거나, 매개변수의 개수에 따라 다른 초기화 작업을 수행할 수
있어서 유연한 객체 초기화 및 설정이 가능하다. 그런데, 위 Member 클래스를 보면 코드가 중복이 된다는 것을 확인할 수 있다. 생성자에서 중복 코드를 개선하기 위해서는
```this()``` 키워드를 사용하면 된다.

```this()``` 키워드는 생성자 내부에서 다른 생성자를 호출하는데 사용되며, 다음과 같은 규칙을 가진다.

1. `this()`는 생성자의 첫 줄에서만 사용할 수 있다.
2. `this()`를 사용하여 다른 생성자를 호출할 때, 매개변수의 개수와 타입이 일치해야 한다.

이 2가지 규칙을 활용하여 Member 클래스의 중복 코드를 개선해보자.

```java
public class Member {

  String name;
  String email;
  int age;

  public Member(String name, String email) {
    this(name, email, 0);
  }

  public Member(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }
}
```
