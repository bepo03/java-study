package day_01_17;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};

        System.out.println("╔════════════════════════════╗");
        System.out.println("║          성 적 표          ║");
        System.out.println("╠════════════════════════════╣");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("║       " + (i + 1) + "번 학생: " + scores[i] + "점       ║" );
        }

        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        double avg = (double) sum / scores.length;

        System.out.println("╠════════════════════════════╣");
        System.out.println("║       합계: " + sum + "점          ║");
        System.out.printf("║       평균: %.1f점         ║\n", avg);

        int max = scores[0];
        int min = scores[0];

        for (int score: scores) {
            if (score > max) max = score;
            if (score < min) min = score;
        }

        System.out.println("║       최고점: " + max + "점         ║");
        System.out.println("║       최저점: " + min + "점         ║");
        System.out.println("╚════════════════════════════╝");
    }
}
