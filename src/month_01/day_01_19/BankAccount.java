package month_01.day_01_19;

import java.text.DecimalFormat;

public class BankAccount {
    String owner;
    String accountNumber;
    int balance;


    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            DecimalFormat df = new DecimalFormat("#,##0");
            String formattedAmount = df.format(amount);
            String formattedBalance = df.format(this.balance);
            System.out.printf("%s원 입금. 잔액: %s원\n", formattedAmount, formattedBalance);
        }
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            DecimalFormat df = new DecimalFormat("#,##0");
            String formattedBalance = df.format(this.balance);
            System.out.printf("잔액 부족! 현재 잔액: %s원\n", formattedBalance);
        } else {
            this.balance -= amount;
            DecimalFormat df = new DecimalFormat("#,##0");
            String formattedAmount = df.format(amount);
            String formattedBalance = df.format(this.balance);
            System.out.printf("%s원 출금. 잔액: %s원\n", formattedAmount, formattedBalance);
        }
    }

    public void transfer(BankAccount target, int amount) {
        if (amount > this.balance) {
            System.out.println("잔액 부족으로 이체 실패");
        } else {
            this.balance -= amount;
            target.balance += amount;
            DecimalFormat df = new DecimalFormat("#,##0");
            String formattedAmount = df.format(amount);
            System.out.printf("%s에게 %s원 이체 완료\n", target.owner, formattedAmount);
        }
    }

    public void showInfo() {
        DecimalFormat df = new DecimalFormat("#,##0");
        String formattedBalance = df.format(this.balance);
        System.out.printf("계좌: %s | 소유자: %s | 잔액: %s원\n", this.accountNumber, this.owner, formattedBalance);
    }
}
