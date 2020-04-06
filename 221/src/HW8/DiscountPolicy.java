package HW8;

/**
 *
 * Jacob Manning
 * Base abstract class made for subclasses to reference
 *
 * This class is the base of all discounts
 */

public abstract class DiscountPolicy {
    public abstract double computeDiscount(int quantity, double itemCost);
}
