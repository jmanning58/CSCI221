package HW8;

/**
 * Jacob Manning
 * CouponDiscount class uses the amount of maxUses to
 * apply couponValue the itemCost
 *
 * CouponDiscount has two param: couponValue and maxUses.
 * They are used in computeDiscount for taking away the finally amount.
 */

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
