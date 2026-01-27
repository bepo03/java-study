package month_01.day_01_20;

public class UtilityMethods {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 69, 14, 5, 100, 56};

        System.out.println("=== 배열 유틸리티 ===");
        System.out.print("배열: ");
        printArray(numbers);

        System.out.printf("합계: %d\n", sum(numbers));
        System.out.printf("평균: %f\n", average(numbers));
        System.out.printf("최대값: %d\n", max(numbers));
        System.out.printf("최소값: %d\n", min(numbers));

        System.out.println("\n=== 숫자 판별 ===");
        System.out.printf("11은 짝수? %b\n", isEven(11));
        System.out.printf("1009은 소수? %b\n", isPrime(1009));
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int max(int[] arr) {
        int maxVal = arr[0];
        for (int num : arr) {
            if (num > maxVal) maxVal = num;
        }
        return maxVal;
    }

    public static int min(int[] arr) {
        int minVal = arr[0];
        for (int num : arr) {
            if (num < minVal) minVal = num;
        }
        return minVal;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            System.out.printf("n: %d, i: %d\n", n, i);
            if (n % i == 0) return false;
        }
        return true;
    }
}
