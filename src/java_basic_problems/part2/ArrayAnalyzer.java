package java_basic_problems.part2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[9];
        int target;

        // 입력
        System.out.println("데이터를 입력해주세요: ");
        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }
        System.out.println("검색 값을 입력해주세요: ");
        target = scanner.nextInt();

        // 깊은 복사 (값 복사)
        int[] sortData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            sortData[i] = data[i];
        }

        // 버블 정렬
        for (int i = 0; i < sortData.length; i++) {
            for (int j = 0; j < sortData.length - 1; j++) {
                if (sortData[j] > sortData[j + 1]) {
                    int temp = sortData[j + 1];
                    sortData[j + 1] = sortData[j];
                    sortData[j] = temp;
                }
            }
        }

        // 합계, 짝수, 홀수, 특정 값 찾기
        int sum = 0, even = 0, odd = 0, index = -1;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (data[i] % 2 == 0) even += 1;
            else odd += 1;
            if (data[i] == target) index = i;
        }

        // 정렬을 기반으로 min, max, avg 값
        int min = sortData[0];
        int max = sortData[sortData.length - 1];
        double avg = sum / sortData.length;

        // 출력
        System.out.println("===== 배열 분석기 =====");
        System.out.println("\n[배열 출력]");
        System.out.println("원본 배열: " + Arrays.toString(data));
        System.out.println("정렬 배열: " + Arrays.toString(sortData));

        System.out.println("\n[기본 통계]");
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("합계: " + sum);
        System.out.printf("평균: %.2f\n", avg);

        System.out.println("\n[짝수/홀수 분석]");
        System.out.println("짝수 개수: '" + even);
        System.out.println("홀수 개수: " + odd);

        System.out.println("\n[검색 결과]");
        System.out.printf("%d 검색 결과: 인덱스 %d에서 발견\n", target, index);
    }
}
/*
입력 값:
3 7 1 9 4 6 8 2 5
7
 */