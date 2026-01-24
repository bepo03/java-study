package day_01_24.delivery;

public abstract class Delivery {
    protected String item;
    protected String address;

    public Delivery(String item, String address) {
        this.item = item;
        this.address = address;
    }

    public abstract int calculateFee();

    public abstract int estimateDays();

    public void printInfo() {
        System.out.println("=== 배송 정보 ===");
        System.out.printf("상품: %s\n", this.item);
        System.out.printf("주소: %s\n", this.address);
        System.out.printf("배송비: %s원\n", String.format("%,d", calculateFee()));
        System.out.printf("예상 소요일: %s일\n", estimateDays());
    }
}
