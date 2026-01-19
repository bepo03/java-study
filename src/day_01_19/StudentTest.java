package day_01_19;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("조영근", 30501);
        Student student2 = new Student("윤호재", 30502);
        Student student3 = new Student("안용성", 30503);

        student1.setScores(100,70, 85);
        student2.setScores(20,100, 45);
        student3.setScores(90,95, 100);

        student1.printReport();
        student2.printReport();
        student3.printReport();
    }
}
