package month_01.day_01_13;

public class ShoppingCalculator {
    public static void main(String[] args) {
        int price = 42_000;
        int quantity = 10;
        double discountRate = 0.1;

        int totalPrice = price * quantity;
        double discount = totalPrice * discountRate;
        double finalPrice = totalPrice - discount;

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║         쇼핑 계산서            ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 단가:     " + price + "원");
        System.out.println("║ 수량:     " + quantity + "개");
        System.out.println("║ 합계:     " + totalPrice + "원");
        System.out.println("║ 할인:     -" + (int) discount + "원");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 최종금액: " + (int) finalPrice + "원");
        System.out.println("╚════════════════════════════════╝");

        String shipping = (finalPrice >= 30_000) ? "무료배송" : "배송비 3,000원";
        System.out.println("\n배송: " + shipping);

        boolean canExtraDiscount = (quantity >= 5) || (totalPrice >= 50_000);
        System.out.println("추가 할인 가능: " + canExtraDiscount);
    }
}
