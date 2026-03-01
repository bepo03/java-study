package goorm_deepdive.java_intermediate;

import java.util.Scanner;

/**
 * 객체지향 프로그래밍의 기본 개념인 클래스와 객체를 이해합니다.
 * 직사각형을 예시로 클래스 정의, 객체 생성, 메서드 호출 과정을 학습합니다.
 *
 * \[해야 할 일\]
 *
 * - 직사각형 클래스 작성 (가로, 세로 필드)
 * - 넓이와 둘레를 계산하는 메서드 작성
 * - 객체를 생성하고 메서드를 호출하여 결과를 출력
 *
 * \[산출물\]
 *
 * - Java 소스 코드(.java)
 * - 실행 결과 요약 (예: “가로=5, 세로=3 입력 시 넓이=15, 둘레=16”)
 */
public class ClassAndObjectPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수에 입력값 넣기
        System.out.print("밑변 길이를 입력해주세요: ");
        long width = scanner.nextLong();

        System.out.print("높이 길이를 입력해주세요: ");
        long height = scanner.nextLong();
        scanner.nextLine(); // 버퍼 제거

        System.out.println("입력된 밑변 길이 = " + width);
        System.out.println("입력된 높이 길이 = " + height);

        Rectangle rectangle = new Rectangle(width, height);
        rectangle.printArea();
        rectangle.printCircumference();
    }

    private static class Rectangle {
        private final long width;
        private final long height;

        public Rectangle(long width, long height) {
            this.width = width;
            this.height = height;
        }

        public void printArea() {
            long result = width * height;
            System.out.println("넓이 = " + result);
        }

        public void printCircumference() {
            long result = (width + height) * 2;
            System.out.println("둘레 = " + result);
        }
    }
}
