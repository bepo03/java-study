package month_01.day_01_27.custom_exception;

class InsufficientBalanceException extends Exception {
    private int currentBalance;
    private int requestAmount;

    public InsufficientBalanceException(int balance, int amount) {
        super("잔액 부족: 현재 " + String.format("%,d", balance) + "원, 요청 " + String.format("%,d", amount) + "원");
        this.currentBalance = balance;
        this.requestAmount = amount;
    }

    public int getShortage() {
        return this.requestAmount - currentBalance;
    }
}