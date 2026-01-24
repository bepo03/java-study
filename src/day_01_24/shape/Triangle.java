package day_01_24.shape;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        super("삼각형");
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
    public double getPerimeter() {
        return a + b + c;
    }
}
