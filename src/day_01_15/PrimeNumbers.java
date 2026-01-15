package day_01_15;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          1 ~ 1000 소수 찾기          ║");
        System.out.println("╚══════════════════════════════════════╝");

        int count = 0;

        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%4d", num);
                count++;

                if (count % 9 == 0) System.out.println();
            }
        }
        System.out.printf("\n\n총 %d개의 소수가 있습니다.\n", count);
    }
}
