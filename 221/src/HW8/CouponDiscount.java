package HW8;

public class CouponDiscount extends DiscountPolicy {
    private double couponValue;
    private int maxUses;

    public void CouponDiscount( double couponValue, int maxUses) {
        this.couponValue = couponValue;
        this.maxUses = maxUses;
    }

    public double computeDiscount(int quantity, double itemCost) {

        return (quantity * itemCost) - (maxUses * couponValue);
    }
}
