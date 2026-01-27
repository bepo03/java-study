package month_01.day_01_13;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자: ");
        double num1 = scanner.nextDouble();

        System.out.println("연산자 (+, -, *, /): ");
        String operator = scanner.next();

        System.out.println("두 번째 숫자: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}
