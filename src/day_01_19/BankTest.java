package day_01_19;

public class BankTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("나123", "123-456-789");
        BankAccount yourAccount = new BankAccount("너456", "456-123-789");

        myAccount.showInfo();
        yourAccount.showInfo();

        myAccount.deposit(100_000);
        myAccount.withdraw(10_000);

        myAccount.transfer(yourAccount, 10_000);

        myAccount.showInfo();
        yourAccount.showInfo();
    }
}
