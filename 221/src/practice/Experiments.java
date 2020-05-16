package practice;

import java.util.Scanner;

public class Experiments {

    // Method used for adding each individual number together
    public int addingUp(int topNum, int botNum) {
        int value1 = topNum - '0';
        int value2 = botNum - '0';
        int addedSum = value1 + value2;
        return addedSum;
    }

    public static void main(String[] args) {

        String ending = "";
        int carryOver = 0;
        int placeHolder = 1;
        int total = 0;

        Experiments columnTotal = new Experiments();
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
        System.out.println(firstInput + " a " + secondInput); // Reads correctly---

        // convert back to String and append to 'ending' to stack numbers instead of using placeholder
        if (strOneLength == strTwoLength) {
             for(int i = 0; i < strOneLength; i++) {
                 int value1 = firstInput.charAt(i) - '0';
                 int value2 = secondInput.charAt(i) - '0';
                 total = value1 + value2;

                 if (carryOver == 1) {
                     total += 1;
                 }
                 if (total == 10) {
                     carryOver = 1;
                     total = 0;
                     ending += total;
                     System.out.println(value1 + " b " + value2 + " = " + total);
                     System.out.println(ending);
                 }
                 if (total > 10) {
                     carryOver = 1;
                     total -= 10;
                     ending += total;
                     System.out.println(value1 + " c " + value2 + " = " + total);
                     System.out.println(ending);
                 }
                 if (total < 10) {
                     carryOver = 0;
                     ending += total;
                     System.out.println(value1 + " d " + value2 + " = " + total);
                     System.out.println(ending);
                 }
             }
        }
    }
}
