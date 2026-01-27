package month_01.day_01_22;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 직사각형 ===");
        System.out.printf("가로: %f, 세로: %f\n", getWidth(), getHeight());
        super.showInfo();
    }
}
