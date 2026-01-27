package month_01.day_01_13;

public class CompoundAssignment {
    public static void main(String[] args) {
        int x = 200;

        System.out.println("=== 복합 대입 연산자 ===");
        System.out.println("초기값: " + x);

        x += 50;
        System.out.println("x += 50: " + x);

        x -= 30;
        System.out.println("x -= 30: " + x);

        x *= 3;
        System.out.println("x *= 3: " + x);

        x /= 6;
        System.out.println("x /= 6: " + x);

        x %= 3;
        System.out.println("x %= 3: " + x);

        System.out.println("\n=== 문자열 연결 ===");
        String message = "Hello";
        message += " ";
        message += "World";
        message += "!";

        System.out.println(message);
    }
}
