package day_01_24.pay;

public class PaymentTest {
    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment(50_000, "1234-5678-9012-3456"),
                new CashPayment(30_000, 50_000),
                new MobilePayment(15_000, "010-1234-5678")
        };

        System.out.println("=== 결제 처리 시스템 ===\n");

        for (Payment payment : payments) {
            System.out.println("--- 결제 처리 ---");
            if (payment.process()) {
                payment.printReceipt();
            }
            System.out.println();
        }
    }
}
