package month_01.day_01_22;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public String getColor() {
        return this.color;
    }

    public void showInfo() {
        System.out.printf("생상: %s, 넓이: %.2f\n", getColor(), getArea());
    }
}
