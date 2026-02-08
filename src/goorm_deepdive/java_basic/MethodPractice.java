package goorm_deepdive.java_basic;

import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수에 입력값 넣기
        System.out.print("첫번째 정수를 입력해주세요: ");
        int firstNumber = scanner.nextInt();

        System.out.print("두번째 정수를 입력해주세요: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine(); // 버퍼 제거

        System.out.print("정수 배열을 입력해주세요: ");
        String line = scanner.nextLine();
        String[] split = line.split(" ");

        int[] numbers = new int[split.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        // 계산 후 출력
        System.out.println("합 = " + add(firstNumber, secondNumber));
        System.out.println("차 = " + sub(firstNumber, secondNumber));
        System.out.println("평균 = " + calculateAverage(numbers));
    }

    // 두 수의 합
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // 두 수의 차
    public static int sub(int firstNumber, int secondNumber) {
        return Math.abs(firstNumber - secondNumber);
    }

    // 배열 평균
    public static double calculateAverage(int[] numbers) {
        int totalSum = 0;
        for (int number: numbers) {
            totalSum += number;
        }
        return (double) totalSum / numbers.length;
    }
}
