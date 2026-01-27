package month_01.day_01_24.pay;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean process() {
        System.out.println("카드 결제");
        System.out.printf("카드번호: %s\n", maskCardNumber());
        System.out.printf("%s원 결제 완료!\n", String.format("%,d", amount));
        return true;
    }

    private String maskCardNumber() {
        return cardNumber.substring(0, 4) + "-****-****-" +
                cardNumber.substring(cardNumber.length() - 4);
    }
}
