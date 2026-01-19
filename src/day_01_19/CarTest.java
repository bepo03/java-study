package day_01_19;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("현대", "소나타");
        Car yourCar = new Car("기아", "K5");

        myCar.info();
        myCar.accelerate(50);
        myCar.accelerate(30);
        myCar.brake(20);

        System.out.println();

        yourCar.accelerate(100);
        yourCar.info();
    }
}
