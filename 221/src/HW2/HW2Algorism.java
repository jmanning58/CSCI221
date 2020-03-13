/** Jacob Manning
 * CSCI 221, HW2
 * 
 * I, Jacob Manning, certify that this is my individual work.
 * 
 */

package HW2;

import java.util.Scanner;

public class HW2Algorism {
	
	public int addingUp(int topNum, int botNum) {
		int value1 = topNum - '0';
		int value2 = botNum - '0';
		int addedSum = value1 + value2;
		return addedSum;
	}

	public static void main(String[] args) {
		
		String total = "";
		int carryOver = 0;
		
		HW2Algorism columnTotal = new HW2Algorism();
		Scanner request = new Scanner(System.in);
		System.out.println("Type your first number: ");
		String firstInput = request.next();
		
		System.out.println("Type your second number: ");
		String secondInput = request.next();
		
		int strOneLength = firstInput.length();
		int strTwoLength = secondInput.length();
		
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
		 if (strOneLength > strTwoLength) {
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
		while (strOneLength == strTwoLength) {
			for (int j = strOneLength-1; j >= 0 ; j--) {
				int doubleDigits = columnTotal.addingUp(firstInput.charAt(j), secondInput.charAt(j));
				if (carryOver == 1) {
					doubleDigits += 1;
					carryOver = 0;
				}
				else if (doubleDigits > 9) {
					carryOver++;
					doubleDigits -= 10;
				}
				total = doubleDigits + total;
			}
			System.out.println(total);
			break;
		}
	}
}
