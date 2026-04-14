package polymorphism.ex2;

public class AnimalTest {

  public static void main(String[] args) {
    System.out.println("=== 동물 테스트 ===\n");

    Dog myDog = new Dog("멍멍이", 3, "골든 리트리버", true);
    Cat myCat = new Cat("야옹이", 2, "주황색", true);

    System.out.println("--- 개 테스트 ---");
    myDog.showDogInfo();
    myDog.eat();        // 부모 클래스의 메소드
    myDog.sleep();      // 부모 클래스의 메소드
    myDog.makeSound();  // 오버라이딩된 메소드
    myDog.bark();       // 개만의 메소드
    myDog.fetch();      // 개만의 메소드
    myDog.sit();        // 개만의 메소드
    System.out.println();

    // 고양이의 기능 테스트
    System.out.println("--- 고양이 테스트 ---");
    myCat.showCatInfo();
    myCat.eat();        // 부모 클래스의 메소드
    myCat.sleep();      // 부모 클래스의 메소드
    myCat.makeSound();  // 오버라이딩된 메소드
    myCat.meow();       // 고양이만의 메소드
    myCat.climb();      // 고양이만의 메소드
    myCat.purr();       // 고양이만의 메소드

    System.out.println();

    // 다형성 테스트
    System.out.println("--- 다형성 테스트 ---");
    Animal[] animals = new Animal[2];
    animals[0] = myDog;  // Dog 객체를 Animal 타입으로 저장
    animals[1] = myCat;  // Cat 객체를 Animal 타입으로 저장

    for (Animal animal : animals) {
      animal.makeSound();  // 각각 다른 소리를 냄 (다형성)
    }
  }
}
