package month_01.day_01_31.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductManagementSystem {
    private List<Product> products = new ArrayList<>();

    private ProductManagementSystem() {
        initializeProducts();
    }

    private void initializeProducts() {
        products.add(new Product("P001", "노트북", 1_500_000, "전자제품", 10));
        products.add(new Product("P002", "마우스", 30_000, "전자제품", 50));
        products.add(new Product("P003", "키보드", 80_000, "전자제품", 30));
        products.add(new Product("P004", "책상", 200_000, "가구", 15));
        products.add(new Product("P005", "의자", 150_000, "가구", 20));
        products.add(new Product("P006", "모니터", 400_000, "전자제품", 25));
    }

    public void sortByPrice() {
        System.out.println("\n=== 가격순 정렬 ===");
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);
    }

    public void sortByName() {
        System.out.println("\n=== 이름순 정렬 ===");
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        products.forEach(System.out::println);
    }

    public void filterProducts(Predicate<Product> condition, String description) {
        System.out.printf("\n=== %s ===\n", description);
        for (Product product : products) {
            if (condition.test(product)) {
                System.out.println(product);
            }
        }
    }

    public void applyToAll(Consumer<Product> action, String description) {
        System.out.printf("\n=== %s ===\n", description);
        products.forEach(action);
    }

    public void displayTransformed(Function<Product, String> transformer) {
        System.out.println("\n=== 변환된 정보 출력 ===");
        for (Product product : products) {
            System.out.println(transformer.apply(product));
        }
    }

    public Product createProduct(Supplier<Product> supplier) {
        Product newProduct = supplier.get();
        products.add(newProduct);
        return newProduct;
    }

    public static void main(String[] args) {
        ProductManagementSystem pms = new ProductManagementSystem();

        pms.sortByPrice();
        pms.sortByName();

        pms.filterProducts(
                p -> p.getPrice() > 100_000,
                "10만원 이상 제품"
        );

        pms.filterProducts(
                p -> p.getCategory().equals("전자제품") && p.getStock() > 20,
                "재고 20개 이상인 전자제품"
        );

        pms.filterProducts(
                p -> p.getName().contains("모"),
                "'모'가 포함된 제품"
        );

        pms.applyToAll(
                p -> p.setPrice(p.getPrice() * 1.1),
                "10% 가격 인상 적용"
        );

        pms.products.forEach(System.out::println);

        pms.applyToAll(
                p -> {
                    if (p.getStock() < 20) {
                        p.setStock(p.getStock() + 10);
                        System.out.printf("%s 재고 추가됨\n", p.getName());
                    }
                },
                "재고 부족 제품 보충"
        );

        pms.displayTransformed(
                p -> String.format("제품명: %s, 할인가: %,.0f원",
                        p.getName(), p.getPrice() * 0.9)
        );

        Product newProduct = pms.createProduct(
                () -> new Product("P007", "태블릿", 800_000, "전자제품", 15)
        );
        System.out.printf("\n새 제품 추가: %s\n", newProduct);
    }
}
