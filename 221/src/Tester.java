/** Jacob Manning
 * CSCI 221, HW2
 *
 * I, Jacob Manning, certify that this is my individual work.
 *
 */

//package HW2;

import java.util.Scanner;

public class Tester {

    // Method used for adding each individual number together
    public int addingUp(int topNum, int botNum) {
        int value1 = topNum - '0';
        int value2 = botNum - '0';
        int addedSum = value1 + value2;
        return addedSum;
    }

    public static void main(String[] args) {

        String total = "";
        int carryOver = 0;
        int placeHolder = 1;

        Tester columnTotal = new Tester();
        Scanner request = new Scanner(System.in);

        // Requesting input, of two string as numbers, from the user
        System.out.println("Type your first number: ");
        String firstInput = request.next();
        System.out.println("Type your second number: ");
        String secondInput = request.next();

        request.close();

        int strOneLength = firstInput.length();
        int strTwoLength = secondInput.length();

        // 2 for loops checking for letters
        for (int i = 0; i < strOneLength; i++) {
            if (!Character.isDigit(firstInput.charAt(i)))  {
                System.out.println("That is not a number.");
                return;
            }
        }
        for (int i = 0; i < strTwoLength; i++) {
            if (!Character.isDigit(secondInput.charAt(i)))  {
                System.out.println("That is not a number.");
                return;
            }
        }
        // 2 if statements checking for the length of the string from the user
        if (strOneLength > strTwoLength) {
            // For loops used to append a '0' at the front of the string
            // if one string is longer than the other
            for (int k = strTwoLength; strOneLength > k; k++) {
                secondInput = "0" + secondInput;
                strTwoLength = secondInput.length();
            }
        }
        if (strTwoLength > strOneLength) {
            for (int j = strOneLength; strTwoLength > j; j++) {
                firstInput = "0" + firstInput;
                strOneLength = firstInput.length();
            }
        }
        // Reads correctly---
        System.out.println(firstInput + "  a " + secondInput);

        // convert back to string and append to 'total' to stack numbers instead of using placeholder
        while (strOneLength == strTwoLength) {
            for (int j = strOneLength-1; j >= 0 ; j--) {
                int doubleDigits = columnTotal.addingUp(firstInput.charAt(j), secondInput.charAt(j));
                System.out.println(firstInput.charAt(j) + " b  " + secondInput.charAt(j));
                if (carryOver == 1) {
                    doubleDigits += 1;
                    carryOver = 0;
                    System.out.println(carryOver + " c  " + total);
                }
                // But what if it equals 10
                // -- 10 doesn't register, spits out 0 because you subtract 10
                else if (doubleDigits > 9) {
                    carryOver++;
                    doubleDigits -= 10;
                    System.out.println(carryOver + " d  " + total);
                }
                total = doubleDigits + total;
                placeHolder *= 10;
            }
            System.out.println(total);
            break;
        }
    }
}
