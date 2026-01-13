package day_01_12;

public class Constants {
    public static void main(String[] args) {
        final double PI = 3.141592;
        final int MAX_STUDENTS = 20;
        final String SCHOOL_NAME = "코딩 부트캠프";

        System.out.println("학교: " + SCHOOL_NAME);
        System.out.println("최대 학생 수: " + MAX_STUDENTS);

        double radius = 12.0;
        double area = PI * radius * radius;
        System.out.println("\n반지름 " + radius + "인 원의 넓이: " + area);

        // PI = 3.14;
    }
}
