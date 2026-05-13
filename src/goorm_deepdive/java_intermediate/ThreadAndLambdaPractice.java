package goorm_deepdive.java_intermediate;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

/**
 * 병렬 처리와 함수형 프로그래밍의 기초를 학습합니다.
 * 스레드를 직접 작성하고 람다식을 이용해 간단한 연산을 구현합니다.
 *
 * \[해야 할 일\]
 *
 * - Runnable을 구현한 두 개의 스레드 작성
 * - 스레드를 실행하여 동시에 메시지 출력
 * - 람다 표현식을 사용한 사칙연산 계산기 작성
 *
 * \[산출물\]
 *
 * - Java 소스 코드(.java)
 * - 실행 결과 요약 (예: “스레드1=Hello, 스레드2=World 동시에 출력”, “람다식 계산기 정상 동작”)
 */
public class ThreadAndLambdaPractice {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드1=Hello");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드2=World");
            }
        });

        try {
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

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

                Operation operation = Operation.from(operator);
                double result = operation.apply(a, b);

                System.out.printf("%.1f %c %.1f = %.1f\n", a, operator, b, result);

            } catch (NumberFormatException e) {
                System.out.println("숫자를 올바르게 입력해주세요. \n");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public enum Operation {
        ADD("+", (a, b) -> a + b),
        SUB("-", (a, b) -> a - b),
        MUL("*", (a, b) -> a * b),
        DIV("/", (a, b) -> {
            if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다. \n");
            return a / b;
        });

        private final String operator;
        private final DoubleBinaryOperator function;

        Operation(String operator, DoubleBinaryOperator function) {
            this.operator = operator;
            this.function = function;
        }

        public static Operation from(char operator) {
            for (Operation operation: values()) {
                if (operation.operator.equals(String.valueOf(operator))) {
                    return operation;
                }
            }

            throw new IllegalArgumentException("알 수 없는 연산자 입니다. \n");
        }

        public double apply(double x, double y) {
            return function.applyAsDouble(x, y);
        }
    }
}
