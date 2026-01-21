package day_01_21;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);

        circle1.showInfo();
        circle2.showInfo();

        System.out.println("\n=== 반지름 변경 ===");
        circle1.setRadius(10);
        circle2.setRadius(30);
        circle1.showInfo();
        circle2.showInfo();
    }
}
