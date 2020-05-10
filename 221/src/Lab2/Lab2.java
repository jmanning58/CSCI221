package Lab2;
import java.util.*;

/**The code below allows the user to input an initial value and 
 * if it is not 0, we enter the loop body. (This is an example of 
 * a sentinel-loop). The value is added to sum and then we ask 
 * the user for the next value. If that value is not 0, this repeats.
 * Once the user enters 0, the loop terminates and we reach the next
 * instruction after the loop, the output statement which outputs the sum.*/

public class Lab2 {

    public static void main(String[] args) {

        int sum = 0, value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value (0 to quit): ");
        value = input.nextInt();
        while (value != 0) {
            sum += value;
            System.out.print("Enter next value (0 to quit): ");
            value = input.nextInt(); 
        }
        System.out.println("The sum of the entered values is " + sum);
        System.out.println(-11%2);
    }

}