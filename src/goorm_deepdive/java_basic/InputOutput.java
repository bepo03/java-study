package goorm_deepdive.java_basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("이름을 입력해주세요: ");
        String name = scanner.next();

        System.out.print("나이를 입력해주세요: ");
        int age = scanner.nextInt();

        System.out.printf("이름: %s, 나이: %d\n", name, age);

    }
}
