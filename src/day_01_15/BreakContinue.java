package day_01_15;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== break: 값 찾기 ===");
        int target = 5;

        for (int i = 1; i <= 10; i++) {
            if (i == target) {
                System.out.println("🎯 " + target + " 찾음! 종료");
                break;
            }
            System.out.println("검색 중: " + i);
        }

        System.out.println("\n\n=== continue: 짝수만 ===");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }

        System.out.println("\n\n=== continue: 3의 배수 제외 ===");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
