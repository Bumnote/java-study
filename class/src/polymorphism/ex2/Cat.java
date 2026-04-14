package polymorphism.ex2;

public class Cat extends Animal {

  private String color;
  private boolean isIndoor;

  public Cat(String name, int age, String color, boolean isIndoor) {
    super(name, age, "고양이");
    this.color = color;
    this.isIndoor = isIndoor;
  }

  // 고양이만의 추가 메소드
  public void meow() {
    System.out.println(name + "이(가) 야옹 소리를 냅니다!");
  }

  public void climb() {
    System.out.println(name + "이(가) 나무를 올라갑니다.");
  }

  public void purr() {
    System.out.println(name + "이(가) 가르랑거립니다.");
  }

  // 부모 메소드 재정의 (오버라이딩)
  @Override
  public void makeSound() {
    System.out.println(name + "이(가) 야옹 소리를 냅니다!");
  }

  // 고양이만의 정보 출력
  public void showCatInfo() {
    introduce();
    System.out.println("털 색상: " + color);
    System.out.println("실내 고양이: " + (isIndoor ? "예" : "아니오"));
  }
}