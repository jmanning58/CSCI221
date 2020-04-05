package HW8;

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
