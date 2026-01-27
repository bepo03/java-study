package month_01.day_01_24.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(10, 5),
                new Circle(7),
                new Triangle(3, 4, 5)
        };

        System.out.println("=== 도형 정보 출력 ===\n");

        double totalArea = 0;

        for (Shape shape : shapes) {
            shape.printInfo();
            totalArea += shape.getArea();
            System.out.println();
        }

        System.out.printf("총 면적 합계: %.2f\n", totalArea);
    }
}