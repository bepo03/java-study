package java_basic_problems.part2;

import java.util.Scanner;

public class GradeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][3];

        // 입력
        System.out.println("데이터를 입력해주세요: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 총점, 평균
        int[] sumValues = new int[matrix.length];
        double[] avgValues = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumValues[i] += matrix[i][j];
            }
            avgValues[i] = (double) sumValues[i] / matrix[i].length;
        }

        // 등급
        char[] grades = new char[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            grades[i] = ((int)avgValues[i] >= 90) ? 'A' :
                        ((int)avgValues[i] >= 80) ? 'B' :
                        ((int)avgValues[i] >= 70) ? 'C' :
                        ((int)avgValues[i] >= 60) ? 'D' :
                                                    'F';
        }

        // 최고 평균, 최저 평균
        double maxAvg = Double.MIN_VALUE, minAvg = Double.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (maxAvg < avgValues[i]) maxAvg = avgValues[i];
            if (minAvg > avgValues[i]) minAvg = avgValues[i];
        }

        // 출력
        System.out.println("===== 성적 관리 시스템 =====");
        System.out.println("\n[학생별 성적]");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%d번 학생: 총점 = %d, 평균 = %.2f, 등급 = %c\n"
                    , (i + 1), sumValues[i], avgValues[i], grades[i]);
        }
        System.out.println("\n[전체 통계]");
        System.out.printf("최고 평균: %.2f\n", maxAvg);
        System.out.printf("최저 평균: %.2f\n", minAvg);
    }
}
/*
입력 값:
85 90 78
92 88 95
76 65 70
88 82 90
55 60 58
 */
