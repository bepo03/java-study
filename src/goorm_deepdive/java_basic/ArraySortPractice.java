package goorm_deepdive.java_basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받은 값 넣기
        String line = scanner.nextLine();
        String[] split = line.split(" ");

        int[] numbers = new int[split.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        System.out.println("입력 값: " + Arrays.toString(numbers));

        // 버블 정렬
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j ++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("정렬 후: " + Arrays.toString(numbers));
    }
}
