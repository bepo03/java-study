package month_01.day_01_27.custom_exception;

class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        }
        this.balance += amount;
        System.out.printf("%s원 입금. 잔액: %s원\n", String.format("%,d", amount), String.format("%,d", this.balance));
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException(this.balance, amount);
        }
        this.balance -= amount;
        System.out.printf("%s원 출금. 잔액: %s원\n", String.format("%,d", amount), String.format("%,d", this.balance));
    }

    public int getBalance() {
        return this.balance;
    }
}
