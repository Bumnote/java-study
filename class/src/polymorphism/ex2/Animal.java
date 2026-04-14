package polymorphism.ex2;

public class Animal {

  protected String name;
  protected int age;
  protected String species;

  public Animal(String name, int age, String species) {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  public void eat() {
    System.out.println(name + "이(가) 먹이를 먹습니다.");
  }

  public void sleep() {
    System.out.println(name + "이(가) 잠을 잡니다.");
  }

  public void makeSound() {
    System.out.println(name + "이(가) 소리를 냅니다.");
  }

  public void introduce() {
    System.out.println("안녕하세요! 저는 " + name + "이고, " + age + "살 " + species + "입니다.");
  }
}
