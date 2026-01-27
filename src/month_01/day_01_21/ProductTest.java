package month_01.day_01_21;

public class ProductTest {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 1_500_000, 10);
        Product mouse = new Product("마우스", 35_000, 50);

        laptop.showInfo();
        mouse.showInfo();

        System.out.println("=== 판매 ===");
        laptop.sell(5);
        mouse.sell(25);

        System.out.println("\n=== 입고 ===");
        laptop.restock(10);

        System.out.println("\n=== 유효성 검사 ===");
        laptop.setPrice(-1_000);
        laptop.sell(100);
    }
}
