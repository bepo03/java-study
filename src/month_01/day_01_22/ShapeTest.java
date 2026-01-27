package month_01.day_01_22;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("흰색", 10.0, 20.0);
        CircleShape circleShape = new CircleShape("회색", 4.0);

        rectangle.showInfo();
        circleShape.showInfo();
    }
}
