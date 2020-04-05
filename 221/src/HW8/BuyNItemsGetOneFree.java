package HW8;

public class BuyNItemsGetOneFree extends DiscountPolicy {
    private int n;

    public void BuyNItemsGetOneFree(int n) { this.n = n; }
    public double computeDiscount(int quantity, double itemCost) {
        double amount = quantity;
        for(int i = 0; i <= quantity; i++) {
            if(i == (i % n) + n) {
                amount -= 1;
            }
            else{
                continue;
            }
        }
        return amount * itemCost;
    }
}
