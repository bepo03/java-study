package month_01.day_01_28;

import java.util.ArrayList;

class CartItem {
    private String name;
    private int price;
    private int quantity;

    public CartItem(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return this.name + " | " + String.format("%,d", this.price) + "원 x " + this.quantity + " = " + String.format("%,d", getTotalPrice()) + "원";
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(String name, int price, int quantity) {
        // 이미 있는 상품이면 수량 증가
        for (CartItem item : this.items) {
            if (item.getName().equals(name)) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.printf("%s 수량 추가됨\n", name);
                return;
            }
        }
        this.items.add(new CartItem(name, price, quantity));
        System.out.printf("%s 장바구니에 추가됨\n", name);
    }

    public void removeItem(String name) {
        this.items.removeIf(item -> item.getName().equals(name));
        System.out.printf("%s 삭제됨\n", name);
    }

    public int getTotalPrice() {
        int total = 0;
        for (CartItem item : this.items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printCart() {
        System.out.println("=== 장바구니 ===");
        for (CartItem item : this.items) {
            System.out.println(item);
        }
        System.out.println("---------------");
        System.out.printf("총액: %s원\n", String.format("%,d", getTotalPrice()));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("노트북", 1_500_000, 1);
        cart.addItem("마우스", 35_000, 2);
        cart.addItem("키보드", 89_000, 1);
        cart.addItem("마우스", 35_000, 1);  // 수량 추가

        cart.printCart();

        cart.removeItem("키보드");
        System.out.println();
        cart.printCart();
    }
}