package month_01.day_01_24.shape;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void printInfo() {
        System.out.printf("도형: \n", this.name);
        System.out.printf("면적: %.2f\n", getArea());
        System.out.printf("둘레: %.2f\n", getPerimeter());
    }
}
