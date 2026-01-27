package month_01.day_01_22;

public class CircleShape extends Shape {
    private double radius;

    public CircleShape(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 원 ===");
        System.out.printf("반지름: %f\n", getRadius());
        super.showInfo();
    }
}
