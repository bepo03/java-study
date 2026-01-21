package day_01_21;

import java.text.DecimalFormat;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0 이상이어야 합니다.");
            return;
        }

        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("재고는 0 이상이어야 합니다.");
            return;
        }

        this.stock = stock;
    }

    public boolean sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("판매 수량은 1 이상이어야 합니다.");
            return false;
        }

        if (quantity > stock) {
            System.out.printf("재고 부족! 현재 재고: %d개\n", this.stock);
            return false;
        }

        this.stock -= quantity;
        System.out.printf("%s %d개 판매. 남은 재고: %d개\n", this.name, quantity, this.stock);
        return true;
    }

    public void restock(int quantity) {
        if (quantity <= 0) {
            System.out.println("입고 수량은 1 이상이어야 합니다.");
            return;
        }

        this.stock += quantity;
        System.out.printf("%s %d개 입고. 현재 재고: %d개\n", this.name, quantity, this.stock);
    }

    public void showInfo() {
        DecimalFormat df = new DecimalFormat("#,##0");
        String formattedPrice = df.format(this.price);
        System.out.printf("[%s] 가격: %s원, 재고: %d개\n", this.name, formattedPrice, this.stock);
    }
}
