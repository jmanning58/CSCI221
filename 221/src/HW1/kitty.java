/** Jacob Manning
 *  CSCI 221, HW1
 *  
 *  I, Jacob Manning, certify that this is my individual work.
 *  
 */

package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kitty {
	
	/**
	 * @param args
	 * 
	 * TODO  
     * PART 4:    output statements and if statements to print final semester score and letter grade,
     * 
     * PART 5:    Test program with several different data sets and verify that results are correct
     * 
	 */
	
	public static void main(String[] args)  {

			Scanner requestGrade = new Scanner(System.in);		      // Giving this Scanner thing a shot
			
			// Initialized 2 types of Lists to store grades and each item being assessed
			List<Integer> grades = new ArrayList<Integer>();
			List<String> gradePrompts = Arrays.asList("zyBook Grade:  ", "Lab/Inclass Activities:  ", "Programming assignments:  ", "Quiz score:  ", "Test 1:  ", "Test 2:  ", "Test 3:  ", "Final Exam:  ");
			int numOfGrades = 8;  // Used for the for loop
			
			System.out.println("Input your grades, as integers between 0 - 100, alongside the prompts");          // Instructions since no one would just know 
			
			for (int i = 0; i < numOfGrades; i++)  {
				System.out.println(gradePrompts.get(i));
				int grade = requestGrade.nextInt();
				grades.add(grade);
			}
			requestGrade.close();            //  Closing the Scanner since you'll no longer be needing it
			
			// System.out.println(grades);             //  Checking my amazing work
			System.out.println();
			
			double assignments;
			double testsAndQuizzes;
			double finalExam;
			double finalSemesterScore;
			
			int replacingPosition = 4;              //  Variable to keep the position within the Array
			
		    for (int i = 5; i < numOfGrades - 1; i++) {
		         if (grades.get(replacingPosition) < grades.get(i)) {
	                 continue;	    	
		       }
		         else if (grades.get(replacingPosition) > grades.get(i) )  {
		            replacingPosition = i;
		       }
		    }
		    
		    // System.out.println(replacingPosition);                  //  Everything running like you think it should?  
		    
		    if (grades.get(replacingPosition) < grades.get(7))  {
		         grades.add(replacingPosition, grades.get(7));
		         grades.remove(replacingPosition + 1);
		    }
		    
		    // System.out.println(grades);
		    
		    //   Now we get to put these lazy variables to work
		    assignments = (grades.get(0) + grades.get(1) + grades.get(2)) / 3;
		    assignments *= .25;
		    testsAndQuizzes = (grades.get(3) + grades.get(4) + grades.get(5) + grades.get(6)) / 4;
		    testsAndQuizzes *= .50;
		    finalExam = grades.get(7) * .25;
		    finalSemesterScore = finalExam + testsAndQuizzes + assignments;
		    
		     //   So, how do you think you did?
		    System.out.println("This is how you did with your assignments:  " + assignments + "% out of 25%.");
		    System.out.println("So, you're tests and quizzes reflect on if you have any kind of memory:  " + testsAndQuizzes + "% out of 50%.");
		    System.out.println("Did you study enough?  " + finalExam + "% out of 25%.  Study more, it's not like you're done right?");
		    
		    //   Style points in the form of sassy comments
		    if (finalSemesterScore <= 64) {
		    	System.out.println( "How do I put this, you failed and I'm not sure where to start telling you how to fix yourself.");
		    	System.out.println("Final Grade:  " + finalSemesterScore + "%. Unsurprisingly comes to an F.");
		    }
		    else if (finalSemesterScore <= 69) {
		    	System.out.println("This a major class, right?  Well then, this grade didn't help you go to the next level.");
		    	System.out.println("Final Grade:  " + finalSemesterScore + "%. Hey don't feel bad, you got a D.");
		    	System.out.println("I mean, just look at the people below you. I'm not even sure if they'll recover.");
		    }
		    else if (finalSemesterScore <= 79) {
		    	System.out.println("So, you passed, that's pretty cool.");
		    	System.out.println("Final Grade:  " + finalSemesterScore + "%. You got a C, I mean, at least you passed?");
		    	System.out.println("Don't pat yourself on the back for your minimum effort, hope you make it through 230. Chump.");
		    }
		    else if (finalSemesterScore <= 89) {
		    	System.out.println("Wow, you're better than most of your peers. You worked for this one... I guess...");
		    	System.out.println("Final Grade:  " + finalSemesterScore + "%. You got a B! Cool, study up you're going to 230.");
		    	System.out.println("Don't go out and celebrate though, you still didn't make an A. Maybe if we're a little more interesting it might have worked out");
		    }
		    else {
		    	System.out.println("Final Grade:  " + finalSemesterScore + "%.  Really? An A? Did you even need to be in this class?");
		    	System.out.println("Go out and buy yourself something, but here's a new challenge, don't use your parents money. Good Luck kid.");
		    } 
    }
}