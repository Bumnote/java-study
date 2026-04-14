package polymorphism.ex4;

public class Kim extends Student {

  int age = 15;

  @Override
  public void study() {
    System.out.println("kim age = " + age);
  }

}
