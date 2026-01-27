package month_01.day_01_26.pay;

class CreditCardProcessor implements PaymentProcessor, PointEarnable {
    private String cardNumber;
    private int amount;
    private int points;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validate() {
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public boolean processPayment(int amount) {
        if (!validate()) {
            System.out.println("카드 검증 실패");
            return false;
        }
        this.amount = amount;
        this.points = calculatePoints(amount);
        System.out.printf("카드 결제 완료: %s원\n", String.format("%,d", amount));
        earnPoints();
        return true;
    }

    @Override
    public void printReceipt() {
        System.out.println("--- 카드 결제 영수증 ---");
        System.out.printf("카드: ****-****-****-%s\n", cardNumber.substring(12));
        System.out.printf("금액: %s원\n", String.format("%,d", amount));
        System.out.printf("적립: %dP\n", this.points);
    }

    @Override
    public int calculatePoints(int amount) {
        return (int) (amount * 0.01);
    }

    @Override
    public void earnPoints() {
        System.out.printf("%d포인트 적립!", this.points);
    }
}
