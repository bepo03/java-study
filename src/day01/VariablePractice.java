package day01;

public class VariablePractice {
    public static void main(String[] args) {
        String name = "전윤현";
        int age = 27;
        double height = 165;
        boolean isStudent = true;
        char grade = 'A';

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);

        age = 28;
        grade = 'B';

        System.out.println("\n=== 1년 후 ===");
        System.out.println("나이: " + age + "살");
        System.out.println("학점: " + grade);
    }
}
