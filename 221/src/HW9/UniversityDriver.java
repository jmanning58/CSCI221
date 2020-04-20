package HW9;

import java.util.ArrayList;

/**
 * UniversityDriver is the main method class for the user to print and sort their lists
 *
 * @author Irving Purata and Jacob Manning
 *
 *
 */
public class UniversityDriver {
    public static void main(String[] args) {

        //
        UniversityPersonnel everyone = new UniversityPersonnel();

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
            everyone.addEmployee(new Staff("Spade, Sam", 456, 1002));
            everyone.addEmployee(new Faculty("van Delden, Sebastian", 11000,
                    "Computer Science Department"));
            everyone.addEmployee(new Faculty("van Delden, Sebastion", 23000,
                    "Sociology Department"));
            everyone.addEmployee(new Faculty("Lombardi, Vince", 90000,
                    "Sociology Department"));
//            a.addEmployee(new Faculty("Lombardi, Vince", 90000,
//                    "Sociology Department"));
            everyone.addEmployee(new Staff("Smith, Marilee", 11111, 4));
        }

        catch (Exception caught) {
            System.out.println(caught.getMessage());
        }

        try {
            everyone.addStudent(new Undergraduate("Spade, Sam", 456, 2));
            everyone.addStudent(new Undergraduate("van Delden, Sebastian", 11000,
                    3));
            everyone.addStudent(new Undergraduate("van Delden, Sebastion", 123000,
                    4));
            everyone.addStudent(new Graduate("Lombardi, Vince", 90000,
                   "PhD"));
        }

        catch (Exception caughtAgain) {
            System.out.println(caughtAgain.getMessage());
        }

        everyone.printEmployees();
        everyone.sortEmployees();
        System.out.println();
        everyone.printEmployees();
        System.out.println("\n** ----------------------------- **\n");

        everyone.printStudents();
        everyone.sortStudents();
        System.out.println();
        everyone.printStudents();

        System.out.println("\n** ------PRINT ALL METHOD------- **\n");
        everyone.printAll();

        }

    }


