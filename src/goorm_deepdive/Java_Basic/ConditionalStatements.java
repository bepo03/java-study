package goorm_deepdive.Java_Basic;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("짝/홀수를 판별할 숫자를 입력해주세요: ");
        int number1 = scanner.nextInt();

        System.out.print("시험점수를 입력해주세요: ");
        int number2 = scanner.nextInt();

        System.out.println("=== 짝/홀수 판별 ===");
        if (number1 % 2 == 0) {
            System.out.printf("입력한 숫자 %d는 짝수 입니다.\n", number1);
        } else {
            System.out.printf("입력한 숫자 %d는 홀수 입니다.\n", number1);
        }

        System.out.println("=== 학점 출력 ===");
        char grade = switch (number2 / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        System.out.printf("%d점의 학점은 %c입니다.\n", number2, grade);
    }
}
