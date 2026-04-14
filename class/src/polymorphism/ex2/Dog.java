package polymorphism.ex2;

public class Dog extends Animal {

  private String breed;
  private boolean isTrained;

  public Dog(String name, int age, String breed, boolean isTrained) {
    super(name, age, "개");
    this.breed = breed;
    this.isTrained = isTrained;
  }

  // 개만의 추가 메소드
  public void bark() {
    System.out.println(name + "이(가) 멍멍 짖습니다!");
  }

  public void fetch() {
    System.out.println(name + "이(가) 공을 가져옵니다.");
  }

  public void sit() {
    if (isTrained) {
      System.out.println(name + "이(가) 앉습니다.");
    } else {
      System.out.println(name + "은(는) 훈련되지 않았습니다.");
    }
  }

  @Override
  public void makeSound() {
    System.out.println(name + "이(가) 멍멍 짖습니다!");
  }

  public void showDogInfo() {
    introduce();
    System.out.println("품종: " + breed);
    System.out.println("훈련 여부: " + (isTrained ? "훈련됨" : "훈련 안됨"));
  }
}
