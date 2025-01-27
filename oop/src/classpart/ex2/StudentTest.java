package classpart.ex2;

public class StudentTest {

    public static void main(String[] args) {

        // class명 변수 = new 생성자();
        Student studentKim = new Student(); // Student 클래스의 인스턴스 생성
        studentKim.setStudentName("김용범");

        Student studentJvm = new Student(); // Student 클래스의 인스턴스 생성
        studentJvm.setStudentName("김자바");

        System.out.println(studentKim.getStudentName());
        System.out.println(studentJvm.getStudentName());

        System.out.println(studentKim);
        System.out.println(studentJvm);

        Student studentJdk = new Student(); // Subject 객체 초기화
        studentJdk.setStudentName("제이디케이");
        studentJdk.setKorean("국어", 100);
        studentJdk.setMath("수학", 70);

        studentJdk.showStudentInfo();
    }
}
