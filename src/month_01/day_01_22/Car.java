package month_01.day_01_22;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 자동차 ===");
        super.showInfo();
        System.out.printf("문 개수: %d\n", getNumDoors());
    }

    public void honk() {
        System.out.printf("%s: 빵빵!\n", getBrand());
    }
}
