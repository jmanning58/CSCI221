package HW8;

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
