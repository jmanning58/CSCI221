/**
 * Jacob Manning
 *  CSCI 221, HW2 Part 1
 *  
 *   I, Jacob Manning, certify that this is my individual work.
 *   
 */

package HW2;

import java.util.Scanner;

public class HW2Syllables {
	
	public boolean charCheck(char letterInput) {
		
		if( (letterInput >= 'A' && letterInput <= 'z') && (letterInput <= 'Z' || letterInput >= 'a')) {  
				return true;
			}
		return false;
		}
	
	public boolean vowelCheck(char charInput) {
		
		if((charInput == 'a') || (charInput == 'e') || (charInput == 'i') || (charInput == 'o') || (charInput == 'u') || (charInput == 'y')) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner  requestWord = new Scanner(System.in);               // Scanner for requesting input
		System.out.print("Please input a single word, only include letters from A to z: ");  
		String userInput = requestWord.next();
		HW2Syllables testerObj = new HW2Syllables();
		int syllableAmount = 0;
		requestWord.close();
		
		for (int i = 0; i < userInput.length(); i++) {
			boolean valid = testerObj.charCheck(userInput.charAt(i));
			if (!valid) {
				System.out.println(" Sorry, you did not input all letters. Work on your spelling.");
				return;
				}
			}
		
		userInput = userInput.toLowerCase();
		boolean priorVowel = false;
		
		for (int i = 0; i < userInput.length(); i++) {
			boolean theVowels = testerObj.vowelCheck(userInput.charAt(i));
			if ((theVowels && !priorVowel) && !(i +1 == userInput.length() && (userInput.charAt(i) == 'e' ))) {
				syllableAmount++;
				priorVowel = true;
				}
			else if (!theVowels) {
				priorVowel = false;
			}
		}
		if (syllableAmount == 0) {
			syllableAmount = 1;
		}
		
		System.out.print("The word '" + userInput + "' has " + syllableAmount + " syllables."); 
		
	}
}