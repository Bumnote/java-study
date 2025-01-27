package classpart.ex1;

public class Person {

    private String name;
    private int height;
    private double weight;
    private char gender;
    private boolean married;

    // 기본 생성자를 지정하지 않으면, 자바 컴파일러에 의해 자동으로 생성된다. => 디폴트 생성자
    // 단, 생성자가 하나도 없는 경우에만 자동으로 디폴트 생성자를 제공해준다.
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}
