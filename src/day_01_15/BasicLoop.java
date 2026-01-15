package day_01_15;

public class BasicLoop {
    public static void main(String[] args) {
        System.out.println("=== for문 (1~10) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n== while문 (10~1) ===");
        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println("\n\n=== 1~100 합계 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("합계: " + sum);

        System.out.println("\n\n=== 1~100 짝수 합 ===");
        int evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
        }
        System.out.println("짝수 합: " + evenSum);
    }
}
