package day_01_24.pay;

public abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public abstract boolean process();

    public void printReceipt() {
        System.out.printf("결제 금액: %s원\n", String.format("%,d", amount));
    }
}
