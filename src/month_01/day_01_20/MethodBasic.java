package month_01.day_01_20;

public class MethodBasic {
    public static void main(String[] args) {
        greet();
        greet("홍길동");

        int sum = add(10, 20);
        System.out.println("합계: " + sum);

        System.out.printf("곱셈: %d\n", multiply(5, 6));
    }

    public static void greet() {
        System.out.println("안녕하세요!");
    }

    public static void greet(String name) {
        System.out.printf("안녕하세요, %s님!\n", name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
