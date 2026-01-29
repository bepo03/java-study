package month_01.day_01_29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inventory {
    private Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String name, int quantity) {
        this.stock.put(name, stock.getOrDefault(name, 0) + quantity);
        System.out.printf("%s %d개 입고 (재고: %d)\n", name, quantity, this.stock.get(name));
    }

    public boolean sellProduct(String name, int quantity) {
        int current = this.stock.getOrDefault(name, 0);

        if (current < quantity) {
            System.out.printf("재고 부족: %s\n", name);
            return false;
        }

        this.stock.put(name, current - quantity);
        System.out.printf("%s %d개 판매 (재고: %d)\n", name, quantity, this.stock.get(name));
        return true;
    }

    public Set<String> getLowStockProducts(int threshold) {
        Set<String> lowStock = new HashSet<>();

        for (Map.Entry<String, Integer> entry : this.stock.entrySet()) {
            if (entry.getValue() < threshold) {
                lowStock.add(entry.getKey());
            }
        }

        return lowStock;
    }

    public void printInventory() {
        System.out.println("=== 재고 현황 ===");
        this.stock.forEach((name, qty) ->
                System.out.printf("%s: %d개\n", name, qty));
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct("노트북", 10);
        inv.addProduct("마우스", 50);
        inv.addProduct("키보드", 30);

        inv.sellProduct("노트북", 8);
        inv.sellProduct("마우스", 45);

        inv.sellProduct("마우스", 10);
        inv.printInventory();

        System.out.printf("\n재고 부족 상품 (10개 미만): %s\n", inv.getLowStockProducts(10));
    }
}
