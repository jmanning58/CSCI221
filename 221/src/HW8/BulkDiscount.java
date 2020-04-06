package HW8;

/**
 * Jacob Manning
 * BulkDiscount class is used for establishing a discount limit on amount of items
 *
 * BulkDiscount uses the minimum amount of items for the discount to apply itself to,
 * while percent is used for taking its value off of the total cost of computeDiscount.
 * If the quantity should happen to be lower than the minimum the discount would be zero.
 */

public class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private int percent;

    public void BulkDiscount(int minimum, int percent){
        this.minimum = minimum;
        this.percent = percent;
    }

     public double computeDiscount(int quantity, double itemCost) {
        if(quantity > minimum) {

            return (percent * (quantity * itemCost));
        }
        else {
            return 0;
        }
     }

}
