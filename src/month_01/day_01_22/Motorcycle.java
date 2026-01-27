package month_01.day_01_22;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 오토바이 ===");
        super.showInfo();
        System.out.printf("사이드카: %s\n", (isHasSidecar() ? "있음" : "없음"));
    }

    public void wheelie() {
        if (getSpeed() > 30) {
            System.out.printf("%s: 윌리! 🏍️\n", getBrand());
        } else {
            System.out.println("속도가 너무 낮습니다.");
        }
    }
}
