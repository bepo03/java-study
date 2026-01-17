package day_01_17;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();

        int count = 0;

        while (count < 6) {
            int num = random.nextInt(45) + 1;

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lotto[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lotto[count] = num;
                count++;
            }
        }

        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = 0; j < lotto.length - 1 - i; j++) {
                if (lotto[j] > lotto[j + 1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                }
            }
        }

        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║     🎱 로또 번호 생성기      ║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.print("║      ");

        for (int num : lotto) {
            System.out.printf("%2d ", num);
        }

        System.out.println("       ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println("\n(Arrays.toString 사용)");
        System.out.println("번호: " + Arrays.toString(lotto));
    }

}
