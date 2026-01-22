package day_01_22;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate(int amount) {
        this.speed += amount;
        System.out.printf("%s 속도 증가: %dkm/h\n", getBrand(), getSpeed());
    }

    public void brake(int amount) {
        this.speed = Math.max(0, this.speed - amount);
        System.out.printf("%s 속도 갑소: %dkm/h\n", getBrand(), getSpeed());
    }

    public void stop() {
        this.speed = 0;
        System.out.printf("%s 정지\n", getBrand());
    }

    public void showInfo() {
        System.out.printf("브랜드: %s\n", getBrand());
        System.out.printf("현재 속도: %dkm/h\n", getSpeed());
    }
}
