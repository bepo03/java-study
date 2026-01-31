package month_01.day_01_31;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private String product;
    private int quantity;
    private int price;

    public Order(String customer, String product, int quantity, int price) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - %s (%d개, 단가: %,d원, 합계: %,d원)",
                customer, product, quantity, price, getTotal()
        );
    }
}

public class OrderAnalysis {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("홍길동", "노트북", 1, 1_500_000),
                new Order("김영희", "마우스", 2, 35_000),
                new Order("홍길동", "키보드", 1, 89_000),
                new Order("이철수", "모니터", 1, 350_000),
                new Order("김영희", "노트북", 1, 1_500_000)
        );

        int totalSales = orders.stream()
                .mapToInt(Order::getTotal)
                .sum();
        System.out.println("총 매출: " + String.format("%,d", totalSales) + "원");

        Map<String, Integer> salesByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingInt(Order::getTotal)
                ));
        List<String> formatSalesByCustomer = salesByCustomer.entrySet().stream()
                .map(e -> e.getKey() + ": " + String.format("%,d", e.getValue()) + "원")
                .toList();
        System.out.println("\n고객별 구매금액: " + formatSalesByCustomer);

        Map<String, Integer> qtyByProduct = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getProduct,
                        Collectors.summingInt(Order::getQuantity)
                ));
        List<String> formatQtyByProduct = qtyByProduct.entrySet().stream()
                .map(e -> e.getKey() + ": " + String.format("%,d", e.getValue()) + "개")
                .toList();
        System.out.println("\n상품별 판매수량: " + formatQtyByProduct);
    }
}
