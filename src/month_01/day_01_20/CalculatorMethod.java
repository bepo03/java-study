package month_01.day_01_20;

public class CalculatorMethod {
    public static void main(String[] args) {
        int a = 20, b = 7;

        System.out.println("=== 계산기 ===");
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, subtract(a, b));
        System.out.printf("%d * %d = %d\n", a, b, multiply(a, b));
        System.out.printf("%d / %d = %f\n", a, b, divide(a, b));

        System.out.println("\n=== 오버로딩 ===");
        System.out.printf("int 2개: %d\n", add(1, 2));
        System.out.printf("double 2개: %f\n", add(1.5, 2.5));
        System.out.printf("int 3개: %d\n", add(1, 2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}