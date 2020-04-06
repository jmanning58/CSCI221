package HW8;

/**
 * Jacob Manning
 * BuyNItemsGetOneFree class is made for when there is a set discount every nth item.
 *
 * BuyNItemsGerOneFree uses n to establish which items will be free within the purchase.
 *  A for loop is used for checking each item to evaluate if it is the nth value when
 *  i modulo n is zero plus n which would equal i if, and only if, the prior amount equals
 *  zero. When the loop can no longer be used it exits.
 */

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
