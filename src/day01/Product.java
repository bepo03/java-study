package day01;

public class Product {
    public static void main(String[] args) {
        final double TAX_RATE = 0.1;

        int productId = 1000;
        String productName = "제로 콜라 라임향(210ml) x 30개";
        int price = 11830;
        int quantity = 2;
        String category = "음료";
        boolean isAvailable = true;

        System.out.println("=== 상품 정보 ===");
        System.out.println("상품 번호: " + productId);
        System.out.println("상품명: " + productName);
        System.out.println("가격: " + price + "원");
        System.out.println("재고 수량: " + quantity);
        System.out.println("카테고리: " + category);
        System.out.println("판매 여부: " + isAvailable);

        int totalPrice = price * quantity;
        double tax = totalPrice * TAX_RATE;
        double finalPrice = totalPrice + tax;
        
        System.out.println("\n=== 결제 정보 ===");
        System.out.println("상품 금액: " + totalPrice + "원");
        System.out.println("세금 (10%): " + (int)tax + "원");
        System.out.println("최종 금액: " + (int)finalPrice + "원");
    }
}
