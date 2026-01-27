package month_01.day_01_27.custom_exception;

public class CustomExceptionTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10_000);

        try {
            account.deposit(5_000);
            account.withdraw(20_000);
        } catch (InsufficientBalanceException e) {
            System.out.printf("오류: %s\n", e.getMessage());
            System.out.printf("부족 금액: %s원\n", String.format("%,d", e.getShortage()));
        } catch (IllegalArgumentException e) {
            System.out.printf("오류: %s\n", e.getMessage());
        }

        System.out.println("\n=== 나이 설정 ===");
        Member member = new Member();
        try {
            member.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.printf("오류: %s\n", e.getMessage());
        }
    }
}
