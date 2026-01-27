package month_01.day_01_19;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " " + model + ": 가속! 현재 속도 " + speed + "km/h");
    }

    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0;
        System.out.println(brand + " " + model + ": 감속! 현재 속도 " + speed + "km/h");
    }

    public void info() {
        System.out.println("차량: " + brand + " " + model + ", 속도: " + speed + "km/h");
    }
}
