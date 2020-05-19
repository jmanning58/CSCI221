package practice;

import java.util.Scanner;

public class Experiments {

    public static void main(String [] args) {

        // Take in two numbers from the user
        Scanner request = new Scanner(System.in);
        System.out.println("Input your first number: ");
        String value1 = request.next();
        System.out.println("Input your second number: ");
        String value2 = request.next();
        request.close();

        // Check to see if both inputs are only numbers
        for (int i = 0; i <= value1.length() - 1; i++) {
            if (!Character.isDigit(value1.charAt(i))) {
                System.out.println("That is not a number.");
                return;
            }
        }
        for (int i = 0; i <= value2.length() - 1; i++) {
            if (!Character.isDigit(value2.charAt(i))) {
                System.out.println("That is not a number.");
                return;
            }
        }
        // Verifying both inputs are numbers
        System.out.println(value1 + " a ");
        System.out.println(value2 + " b ");

        int placeHolder = 1;
        int amount1 = 0;
        // Change first string to an integer
        for (int i = value1.length() - 1; i >= 0; i--) {
            // If you don't convert
            System.out.println(value1 + value2 + " c ");
            int numberPlaced = value1.charAt(i) -'0';
            numberPlaced *= placeHolder;
            placeHolder *= 10;
            amount1 += numberPlaced;
        }

        int amount2 = 0;
        placeHolder = 1;
        // Change second string to an integer
        for (int i = value2.length() - 1; i >= 0; i--) {
            int numberPlaced = value2.charAt(i) - '0';
            numberPlaced *= placeHolder;
            placeHolder *= 10;
            amount2 += numberPlaced;
        }
        // Verify that they are integers
        System.out.println(amount1 + amount2 + " d ");
        int total = amount1 + amount2;
        System.out.println(String.valueOf(total));
    }
}
