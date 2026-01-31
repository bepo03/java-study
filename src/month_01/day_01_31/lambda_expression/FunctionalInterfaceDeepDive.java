package month_01.day_01_31.lambda_expression;

import java.util.function.BiFunction;

public class FunctionalInterfaceDeepDive {

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    @FunctionalInterface
    interface ProductValidator {
        boolean validate(Product product);

        default ProductValidator and(ProductValidator other) {
            return p -> this.validate(p) && other.validate(p);
        }

        default ProductValidator or(ProductValidator other) {
            return p -> this.validate(p) || other.validate(p);
        }
    }

    public static void main(String[] args) {
        BiFunction<Double, Integer, Double> calculateTotal = (price, quantity) -> price * quantity;

        System.out.printf("총 가격: %,f\n", calculateTotal.apply(50_000.0, 3));

        TriFunction<String, Double, Integer, Product> createProduct = (name, price, stock) -> new Product(
                "P" + System.currentTimeMillis(), name, price, "미분류", stock
        );

        Product tablet = createProduct.apply("태블릿", 600_000.0, 20);
        System.out.printf("생성된 제품: %s\n", tablet);

        ProductValidator priceValidator = p -> p.getPrice() > 0;
        ProductValidator stockValidator = p -> p.getStock() >= 0;
        ProductValidator nameValidator = p -> p.getName() != null && !p.getName().isEmpty();

        ProductValidator fullValidator = priceValidator.and(stockValidator).and(nameValidator);

        Product testProduct = new Product("P008", "테스트", 1_000, "테스트", 10);
        System.out.printf("제품 유효성: %s\n", fullValidator.validate(testProduct));
    }
}
