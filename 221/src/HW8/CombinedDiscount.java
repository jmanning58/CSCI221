package HW8;

/**
 * Jacob Manning
 * CombinedDiscount class takes two discounts and adds them together
 *
 * CombinedDiscount calls computeDiscount on two separate DiscountPolicy
 * objects, retrieving both of their max discounts. Then adds them together
 * to find the total maximum combined discount.
 */

public class CombinedDiscount extends DiscountPolicy {
    private DiscountPolicy dis1;
    private DiscountPolicy dis2;

    public void CombinedDiscount(DiscountPolicy first, DiscountPolicy second) {
        this.dis1 = first;
        this.dis2 = second;
    }

    public double computeDiscount(int quantity, double itemCost) {
        return dis1.computeDiscount(quantity, itemCost) +
                dis2.computeDiscount(quantity, itemCost);
    }
}
