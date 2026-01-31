package month_01.day_01_31.lambda_expression;

class Product {
    private String id;
    private String name;
    private double price;
    private String category;
    private int stock;

    public Product(String id, String name, double price, String category, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %,.2f원 (재고: %d)", id, name, price, stock);
    }
}
