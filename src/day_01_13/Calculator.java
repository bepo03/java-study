package day_01_13;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;

        System.out.println("=== 기본 계산기 ===");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.println("\n=== 실수 나눗셈 ===");
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));

        System.out.println("\n=== 증감 연산자 ===");
        int x = 16;
        System.out.println("초기값: " + x);
        System.out.println("x++: " + x++);
        System.out.println("현재 x: " + x);
        System.out.println("++x: " + ++x);
    }
}
