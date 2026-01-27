package month_01.day_01_26.pay;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor[] processors = {
                new CreditCardProcessor("1234567890123456"),
                new SimplePayProcessor("user123", 100_000)
        };

        int[] amounts = {50_000, 30_000};

        System.out.println("=== 결제 시스템 테스트 ===\n");

        for (int i = 0; i < processors.length; i++) {
            System.out.printf("--- 결제 %d ---", (i + 1));
            if (processors[i].processPayment(amounts[i])) {
                processors[i].printReceipt();
            }
            System.out.println();
        }
    }
}
