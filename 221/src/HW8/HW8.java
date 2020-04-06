package HW8;

import java.text.NumberFormat;
import java.util.*;

/**
 * I, Jacob Manning, certify that this is my individual work.
 */

public class HW8 {
    public static void main(String [] args) {
        double money = 111.119999;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.println("The discount is: " + formatter.format(money));
    }
}
