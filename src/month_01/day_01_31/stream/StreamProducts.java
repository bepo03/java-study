package month_01.day_01_31.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private int price;

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "(" + category + ", " + String.format("%,d", price) + "원)";
    }
}

public class StreamProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("노트북", "전자제품", 1_500_000),
                new Product("마우스", "전자제품", 35_000),
                new Product("키보드", "전자제품", 89_000),
                new Product("책상", "가구", 250_000),
                new Product("의자", "가구", 180_000),
                new Product("모니터", "전자제품", 350_000),
                new Product("램프", "가구", 45_000)
        );

        System.out.println("=== 전자제품 ===");
        products.stream()
                .filter(p -> p.getCategory().equals("전자제품"))
                .forEach(System.out::println);

        System.out.println("\n=== 가격순 정렬 ===");
        products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .forEach(System.out::println);

        System.out.println("\n=== 10만원 이하 ===");
        products.stream()
                .filter(p -> p.getPrice() <= 100_000)
                .forEach(System.out::println);

        System.out.println("\n=== 상품명 목록 ===");
        List<String> names = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        int totalPrice = products.stream()
                .filter(p -> p.getCategory().equals("전자제품"))
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println("\n전자제품 총액: " + String.format("%,d", totalPrice) + "원");

        double avgPrice = products.stream()
                .mapToInt(Product::getPrice)
                .average()
                .orElse(0);
        System.out.println("평균 가격: " + String.format("%,d", (int) avgPrice) + "원");

        System.out.println("\n=== 카테고리별 그룹 ===");
        Map<String, List<Product>> byCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        byCategory.forEach((cat, list) -> {
            System.out.println(cat + ": " + list.size() + "개");
        });

        Product mostExpensive = products.stream()
                .max(Comparator.comparingInt(Product::getPrice))
                .orElse(null);
        System.out.println("\n가장 비싼 상품: " + mostExpensive);
    }
}
