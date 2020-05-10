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
        int odds = 0;
        int targetTimes = 0;
        int max = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your target number? ");
        int target = input.nextInt();
        System.out.print("Enter an integer value (0 to quit): ");
        value = input.nextInt();

        while (value != 0) {
            sum += value;
            System.out.print("Enter next value (0 to quit): ");
            if(value % 2 != 0)
                odds += 1;

            if(value == target)
                targetTimes += 1;

            if(value >= max)
                max = value;

            value = input.nextInt();
        }
        System.out.println("The sum of the entered values is " + sum);
        System.out.println("The number of values input is " + odds);
        System.out.println("The value " + target + " was input " + targetTimes + " times");
        System.out.println("The maximum value entered was " + max);

    }

}