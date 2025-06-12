## final 키워드

final 키워드는 Java에서 변수, 메소드, 클래스에 적용할 수 있는 키워드입니다. 이 키워드를 사용하면 해당 요소가 변경될 수 없음을 나타냅니다. 즉, 더 이상 값이 변경되면
안되는 요소에 **final**이라는 키워드를 붙여 제약을 둬 보다 안전한 코드를 작성할 수 있고, 해당 코드를 작성하지 않은 다른 개발자들에게도 이 요소가 변경되지 않는다는 것을
명확히 알릴 수 있습니다.

### final 변수 - final 키워드가 변수에 적용되는 경우

```java
class Practice {

  final int x = 10; // final 변수 선언
  final int y;

  Practice(int value) {
    this.y = value; // 생성자에서 final 변수 초기화
  }
}
```

필드 변수에 final 변수를 선언하는 경우, 초기화 하는 방법은 다음과 같다.

1. final 선언과 동시에 초기화
2. 생성자에서 초기화

1번의 방법이 매우 직관적일 수 있지만, 초기화와 동시에 생성된 값이 변경되지 않는다는 점에서 유연성이 떨어지고, 코드 중복을 유발할 수 있다. 따라서, 각 인스턴스마다 다른 값을
가져야 하는 상황이라면 생성자 초기화 방법을 통해서 final 변수를 초기화 하는 것이 좋다.

### final 변수 - static final 키워드가 변수에 적용되는 경우

```java
class Practice {

  static final int x = 10; // static final 변수 선언
}
```

만약, 각 인스턴스마다 같은 값을 가져야 하는 상황이라면 ```final int x = 10;```과 같이 선언하는 것보다 ```static final int x = 10;```과
같이 선언하는 것이 좋다. static final 변수는 클래스가 로드될 때, 메모리에 한 번만 할당되며, 모든 인스턴스가 동일한 값을 공유합니다. 이는 메모리 사용을 최적화하고,
코드의 가독성을 높이는 데 도움이 됩니다. 또한, ```static final```변수는 컴파일 시점에 값이 결정되는 상수이므로, 런타임에 값을 참조하는 데 드는 비용이 적어 성능
향상에도 기여할 수 있으므로 상황에 맞게 잘 활용하는 것이 좋다.

```static final```과 같은 상수는 변수와 구분하기 위해서 대문자와 언더스코어(_)를 사용하여 작성하는 것이 일반적이며, 관례이다. 예를 들어,
```static final int MAX_VALUE = 100;```와 같이 작성합니다.

### 매직 넘버(Magic Number) - 상수 사용의 중요성

매직 넘버는 **의미 있는 이름의 상수로 대체될 수 있는 숫자**를 의미한다. 즉, 의미를 가지고 있지만, 그저 숫자로만 적혀있어 코드의 가독성을 떨어뜨리는 숫자를 의미한다.

```java
class Practice {

  public static void main(String[] args) {
    int currentUserCount = 999;
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
  }

  private static void process(int currentUserCount) {
    if (currentUserCount > 1000) {
      System.out.println("대기자로 등록합니다.");
    } else {
      System.out.println("게임에 참가합니다.");
    }
  }
}
```

위와 같은 코드가 있다고 했을 때, 1000 이라는 숫자는 **"매직 넘버"** 라고 할 수 있다. 작성한 사람은 이 숫자가 어떤 의미를 가지고 있는지 알 수 있지만, 다른 팀원이
이 코드를 보게 되면 1000이라는 숫자의 의미를 찾는데 어려움을 겪을 수 있다. 따라서, 이런 매직 넘버들이 존재한다면 의미에 맞는 이름의 상수로 바꿔주도록 하자.

```java
class Constant {

  public static final int MAX_USER_COUNT = 1000; // 의미 있는 이름의 상수로 대체
}

class Practice {

  public static void main(String[] args) {
    int currentUserCount = 999;
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
  }

  private static void process(int currentUserCount) {
    if (currentUserCount > Constant.MAX_USER_COUNT) {
      System.out.println("대기자로 등록합니다.");
    } else {
      System.out.println("게임에 참가합니다.");
    }
  }
}
```

그 뿐만 아니라, 이렇게 매직 넘버를 상수로 대체하는 행동은 코드의 유지보수성을 높이는 데에도 큰 도움이 된다. 만약, 1000이라는 숫자가 변경되어야 한다면, 상수로 대체한
경우에는 상수의 값만 변경하면 되지만, 매직 넘버를 사용한 경우에는 코드 전반에 걸쳐서 전부 수정을 해야 하기 때문이다.

### final 객체 및 참조 - final 키워드가 객체 및 참조에 적용되는 경우

변수에는 크게 ```기본형 변수```와 ```참조형 변수```가 있다. 기본형 변수는 int, float, char 등과 같은 단순한 데이터 타입을 의미하며, 참조형 변수는 객체를
참조하는 변수이다. 기본형 변수는 10, 20과 같은 값을 보관하고, 참조형 변수는 객체의 참조값(메모리 주솟값)을 보관한다. 이러한 변수들에 final 키워드를 적용하면 기본형
변수는 값울 변경할 수 없게 되고, 참조형 변수는 참조값을 변경할 수 없게 된다.

```java
class FinalReference {

  String name;
  int age;
}

class Practice {

  public static void main(String[] args) {
    final FinalReference ref = new FinalReference();
    // ref = new FinalReference(); // 컴파일 에러: final 참조 변수는 재할당할 수 없음
  }
}
```

위의 코드에서 ```final FinalReference ref = new FinalReference();```와 같이 선언된 ```ref``` 변수는 더 이상 다른 객체를 참조할
수 없다. 즉, ```ref = new FinalReference();```와 같이 새로운 객체를 할당하려고 하면 컴파일 에러가 발생한다. 하지만, ```ref```가 참조하는
객체의 내부 상태는 변경할 수 있다. 즉, ```ref.name = "John";```과 같이 객체의 필드 값을 변경하는 것은 가능하다. 이는 ```final``` 키워드가 참조
변수에 적용될 때, 참조 자체는 변경할 수 없지만, 참조하는 객체의 상태는 변경할 수 있음을 의미한다.

```final``` 키워드는 아주 유용한 제약이다. 만약 특정 변수의 값 또는 참조값을 할당한 이후에 변경하지 않아야 한다면 ```final``` 키워드를 사용하도록 하자.