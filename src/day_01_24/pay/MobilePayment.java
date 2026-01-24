package day_01_24.pay;

public class MobilePayment extends Payment {
    private String phoneNumber;

    public MobilePayment(int amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean process() {
        System.out.println("모바일 결제");
        System.out.printf("전화번호: %s\n", phoneNumber);
        System.out.printf("%s원 결제 완료!\n", String.format("%,d", amount));
        return true;
    }
}
