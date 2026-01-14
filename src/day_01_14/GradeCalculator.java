package day_01_14;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해주세요: ");
        int score = scanner.nextInt();
        char grade;
        String message;

        if (score >= 90) {
            grade = 'A';
            message = "우수합니다.";
        } else if (score >= 80) {
            grade = 'B';
            message = "좋습니다.";
        } else if (score >= 70) {
            grade = 'C';
            message = "보통입니다.";
        } else if (score >= 60) {
            grade = 'D';
            message = "노력이 필요합니다.";
        } else {
            grade = 'F';
            message = "재수강이 필요합니다.";
        }

        System.out.println("╔════════════════════════════╗");
        System.out.println("║       성적 결과표          ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ 점수: " + score + "점");
        System.out.println("║ 학점: " + grade);
        System.out.println("║ 평가: " + message);
        System.out.println("╚════════════════════════════╝");
    }
}
