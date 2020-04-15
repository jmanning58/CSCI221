package practice;

import java.util.ArrayList;

/**
 * All of your lab code should be in this file
 * Name of team members:
 */
public class April10Lab
{
    // The methods you are asked to write go here
    /**
     * Problem 1 - sum
     */
    public static int sum( int x ) {


        if (x == 1) {return 1;}
        else{ return x + sum(x - 1); }
    /**
     * Problem 2 - fibonacci
     */
   // public static int fib( int n ) {

      //  System.out.println();
      //  if( n == 1){ return 1 ;}
       // if( n == 0){ return 0 ;}
      //  else{
           // return fib(n - 1) + fib(n - 2);
        }
   // }
    /**
     * Problem 3 - printReversed
     */
    //public static printReversed(int [] theArray, int startIndex, int endIndex) {



    // To test your methods, add code to the main method
    public static void main(String [] args)
    {
        System.out.println("The sum of 1 to 10 is: " + sum(10));
        System.out.println("The sum of 1 to 100 is: " + sum(100));
        System.out.println("----------------------------");
        //System.out.println(fib(5));
       // System.out.println(fib(15));
      //  System.out.println(fib(25));
      //  System.out.println("-----------------------------");
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        }
    }
//}
