package month_01.day_01_24.delivery;

public class ExpressDelivery extends Delivery {
    public ExpressDelivery(String item, String address) {
        super(item, address);
    }

    @Override
    public int calculateFee() {
        return 5_000;
    }

    @Override
    public int estimateDays() {
        return 1;
    }
}
