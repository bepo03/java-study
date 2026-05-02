package goorm_deepdive.java_intermediate;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 인터페이스와 다형성을 학습하여 객체지향 설계의 유연성을 이해합니다.
 * 도형 인터페이스를 구현하고 다양한 도형 객체를 다형적으로 처리합니다.
 *
 * \[해야 할 일\]
 *
 * - 도형 인터페이스 작성 (넓이 계산 메서드)
 * - 원, 사각형, 삼각형 클래스 작성 및 구현
 * - 도형 배열에 객체 저장 후 반복문으로 면적 계산
 *
 * \[산출물\]
 *
 * - Java 소스 코드(.java)
 * - 실행 결과 요약 (예: “원=78.5, 사각형=20, 삼각형=15”)
 */
public class InterfaceAndPolymorphismPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수에 입력값 넣기
        System.out.print("원의 반지름을 입력해주세요: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("사각형의 가로, 세로를 입력해주세요: ");
        double rectangleWidth = scanner.nextDouble();
        double rectangleHeight = scanner.nextDouble();

        System.out.print("삼각형의 세 변을 입력해주세요: ");
        double triangleA = scanner.nextDouble();
        double triangleB = scanner.nextDouble();
        double triangleC = scanner.nextDouble();

        Shape[] shapes = {
                new Circle(circleRadius), // 5
                new Rectangle(rectangleWidth, rectangleHeight), // 4 5
                new Triangle(triangleA, triangleB, triangleC) // 5 6 7
        };

        System.out.println(Arrays.stream(shapes)
                .map(Shape::printInfo)
                .collect(Collectors.joining(", "))
        );
    }
}

interface Shape {
    double getArea();

    String printInfo();
}

class Circle implements Shape {
    private final String name;
    private final double radius;

    public Circle(double radius) {
        this.name = "원";
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String printInfo() {
        return String.format("%s=%.1f", name, getArea());
    }
}

class Rectangle implements Shape {
    private final String name;
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.name = "직사각형";
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String printInfo() {
        return String.format("%s=%.1f", name, getArea());
    }
}

class Triangle implements Shape {
    private final String name;
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.name = "삼각형";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String printInfo() {
        return String.format("%s=%.1f", name, getArea());
    }
}
