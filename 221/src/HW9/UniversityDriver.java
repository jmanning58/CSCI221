package HW9;



import java.util.ArrayList;

/**
 * Write a description of class UniversityDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityDriver {
    public static void main(String[] args) {
        UniversityPersonnel a = new UniversityPersonnel();

        // Test your classes by adding good data and attempting to
        // add bad data (Employees and Students whose numbers are duplicates
        // of some already in the lists
        // This driver should catch and handle those Exceptions(by printing the Exception message)
        // and continuing to process data.

        // This program should not expect any user input.
        // If you want to read input from a file, that is fine, be sure to upload your
        // data file with your code submission.

        // Print the lists

        //  System.out.println(a);
        //ArrayList<Person> employees = new ArrayList<>();
        try {
            a.addEmployee(new Staff("Spade, Sam", 456, 1002));
            a.addEmployee(new Faculty("van Delden, Sebastian", 11000,
                    "Computer Science Department"));
            a.addEmployee(new Faculty("van Delden, Sebastion", 23000,
                    "Sociology Department"));
            a.addEmployee(new Faculty("Lombardi, Vince", 90000,
                    "Sociology Department"));
//            a.addEmployee(new Faculty("Lombardi, Vince", 90000,
//                    "Sociology Department"));
            a.addEmployee(new Staff("Smith, Marilee", 11111, 4));
        }

        catch (Exception caught) {
            System.out.println(caught.getMessage());
        }

        try {
            a.addStudent(new Undergraduate("Spade, Sam", 456, 2));
            a.addStudent(new Undergraduate("van Delden, Sebastian", 11000,
                    3));
            a.addStudent(new Undergraduate("van Delden, Sebastion", 123000,
                    4));
            a.addStudent(new Graduate("Lombardi, Vince", 90000,
                   "PhD"));
        }

        catch (Exception caughtAgain) {
            System.out.println(caughtAgain.getMessage());
        }

        System.out.println("The list of all people: \n");
        a.printAll();

//        for (Employee p : a) {
//            p.writeOutput();
//            System.out.println();

            // Sort the lists
       // a.
            // Print the lists


        }

    }


