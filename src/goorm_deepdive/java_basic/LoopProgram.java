package goorm_deepdive.java_basic;

public class LoopProgram {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int i = 1; i <= 100; i++) {
            totalSum += i;
        }

        System.out.println("=== 1 ~ 100까지 합계 출력 ===");
        System.out.println("합계 = " + totalSum);

        System.out.println("\n=== 2 ~ 9단 출력 ===");

        for (int j = 2; j <= 9; j++) {
            System.out.printf("%-15s", String.format("[ %d단 ]", j));
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%-16s", String.format("%d x %d = %2d", j, i, (j * i)));
            }
            System.out.println();
        }
    }
}
