package day_01_26.pay;

public class SimplePayProcessor implements PaymentProcessor {
    private String userId;
    private int balance;
    private int amount;

    public SimplePayProcessor(String userId, int balance) {
        this.userId = userId;
        this.balance = balance;
    }

    @Override
    public boolean validate() {
        return userId != null && !userId.isEmpty();
    }

    @Override
    public boolean processPayment(int amount) {
        if (!validate()) {
            System.out.println("사용자 검증 실패");
            return false;
        }
        if (this.balance < amount) {
            System.out.printf("잔액 부족 (잔액: %s원)\n", String.format("%,d", this.balance));
            return false;
        }
        this.amount = amount;
        balance -= amount;
        System.out.printf("간편결제 완료: %s원\n", String.format("%,d", amount));
        return true;
    }

    @Override
    public void printReceipt() {
        System.out.println("--- 간편결제 영수증 ---");
        System.out.printf("사용자: %s\n", this.userId);
        System.out.printf("금액: %s원\n", String.format("%,d", this.amount));
        System.out.printf("잔액: %s원\n", String.format("%,d", this.balance));
    }
}
