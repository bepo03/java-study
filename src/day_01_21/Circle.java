package day_01_21;

public class Circle {
    private double radius;
    private static final double PI = 3.141592;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("반지금은 0보다 커야 합니다.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    public double getCircumference() {
        return 2 * PI * getRadius();
    }

    public void showInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.printf("반지름: %f\n", radius);
        System.out.printf("넓이: %s\n", String.format("%.2f", getArea()));
        System.out.printf("둘레: %s\n", String.format("%.2f", getCircumference()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
