package goorm_deepdive.java_intermediate;

import java.util.Scanner;

/**
 * 예외 처리의 필요성을 이해하고 안정적인 프로그램 작성을 실습합니다.
 * 잘못된 사용자 입력이나 연산 오류를 처리합니다.
 *
 * \[해야 할 일\]
 *
 * - 두 수와 연산자를 입력받는 계산기 작성
 * - 0으로 나누는 경우와 잘못된 연산자 입력 시 예외 처리
 * - try-catch 문을 활용해 에러 메시지 출력
 *
 * \[산출물\]
 *
 * - Java 소스 코드(.java)
 * - 실행 결과 요약 (예: “0으로 나눌 경우 ‘나눌 수 없음’ 메시지 출력”)
 */
public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("계산식을 입력해주세요. 예: 10 + 3, 종료: q: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("계산기를 종료합니다.");
                    break;
                }
                String[] parts = input.split(" ");

                double a = Double.parseDouble(parts[0]);
                char operator = parts[1].charAt(0);
                double b = Double.parseDouble(parts[2]);

                Calculator calculator = new Calculator(a, b, operator);
                calculator.printInfo();
            } catch (NumberFormatException e) {
                System.out.println("숫자를 올바르게 입력해주세요. \n");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Calculator {
    private final double a;
    private final double b;
    private final char operator;

    public Calculator(double a, double b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public void printInfo() {
        switch (operator) {
            case '+' -> System.out.printf("[더하기] %.1f + %.1f = %.1f\n\n", a, b, add());
            case '-' -> System.out.printf("[빼기] %.1f - %.1f = %.1f\n\n", a, b, sub());
            case '*' -> System.out.printf("[곱하기] %.1f * %.1f = %.1f\n\n", a, b, mul());
            case '/' -> System.out.printf("[나누기] %.1f / %.1f = %.1f\n\n", a, b, div());
            default -> throw new IllegalArgumentException("알 수 없는 연산자 입니다. \n");
        }
    }

    private double add() {
        return a + b;
    }

    private double sub() {
        return a - b;
    }

    private double mul() {
        return a * b;
    }

    private double div() {
        if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다. \n");
        return a / b;
    }
}