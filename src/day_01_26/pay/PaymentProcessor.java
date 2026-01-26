package day_01_26.pay;

public interface PaymentProcessor {
    boolean validate();

    boolean processPayment(int amount);

    void printReceipt();

    default void refund(int amount) {
        System.out.printf("%s원 환불 처리됨\n", String.format("%,d", amount));
    }
}
