package month_01.day_01_27.student_grade;

public class GradeManagement {
    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("홍길동");

        try {
            student.setScore(0, 85);
            student.setScore(1, 90);
            student.setScore(2, 150);
        } catch (InvalidScoreException e) {
            System.out.printf("성적 입력 오류: %s\n", e.getMessage());
        }
        
        student.printReport();
    }
}
