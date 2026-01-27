package month_01.day_01_15;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력을 윈하는 단을 입력해주세요: ");
        if (scanner.hasNextInt()) {
            int dan = scanner.nextInt();

            System.out.println("╔══════════════╗");
            System.out.println("║     " + dan + "단      ║");
            System.out.println("╠══════════════╣");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("║  %d × %d = %2d  ║\n", dan, i, dan * i);
            }
            System.out.println("╚══════════════╝");
        } else {
            String notNum = scanner.next();
            System.out.println("숫자가 아닙니다. 입력값: " + notNum);
        }

        System.out.println("\n\n=== 전체 구구단 ===");
        for (int i = 2; i <= 9; i++) {
            System.out.println("[ " + i + "단 ]");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
