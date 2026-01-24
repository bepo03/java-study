package day_01_24.pay;

public class CashPayment extends Payment {
    private int receivedAmount;

    public CashPayment(int amount, int receivedAmount) {
        super(amount);
        this.receivedAmount = receivedAmount;
    }

    @Override
    public boolean process() {
        System.out.println("현금 결제");

        if (receivedAmount < amount) {
            System.out.println("금액이 부족합니다.");
            System.out.printf("부족액: %s원\n", String.format("%,d", amount - receivedAmount));
        }

        System.out.printf("받은 금액: %s원\n", String.format("%,d", receivedAmount));
        System.out.printf("거스름돈: %s원\n", String.format("%,d", receivedAmount - amount));
        return true;
    }
}
