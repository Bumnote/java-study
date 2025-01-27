package classpart.ex2;

public class Student {

    // 클래스 "속성" = 특성 = 멤버 변수 = 인스턴스 변수
    private final int studentId = 1;
    private String studentName;
    private final int grade = 1;
    private final String address = "경기도";
    private Subject korean;
    private Subject math;

    public void setKorean(String subjectName, int scorePoint) {
        this.korean.setSubjectName(subjectName);
        this.korean.setScorePoint(scorePoint);
    }

    public Subject getKorean() {
        return this.korean;
    }

    public void setMath(String subjectName, int scorePoint) {
        this.math.setSubjectName(subjectName);
        this.math.setScorePoint(scorePoint);
    }

    private Subject getMath() {
        return this.math;
    }

    public Student() {
        this.korean = new Subject();
        this.math = new Subject();
    }

    // 클래스 "기능" = 멤버 함수 = 메서드
    public void showStudentInfo() {
        System.out.println(this.studentName + " " + this.address);
        System.out.println(this.korean.getSubjectName() + " " + this.korean.getScorePoint());
        System.out.println(this.math.getSubjectName() + " " + this.math.getScorePoint());
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
