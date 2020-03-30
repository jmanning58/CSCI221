package HW7;

import java.util.*;

public class TestPerson {

    public static void main(String [] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Spade, Sam"));
        employees.add(new Faculty("van Delden, Sebastian", 11000,
                "Computer Science Department"));
        employees.add(new Faculty("van Delden, Sebastion", 23000,
                "Sociology Department"));
        employees.add(new Faculty("Lombardi, Vince", 90000,
                "Sociology Department"));
        employees.add(new Faculty("Lombardi, Vince", 90000,
                "Sociology Department"));
        employees.add(new Staff("Smith, Marilee", 11111, 4));

        System.out.println("The list of all the Employees: \n");

        for(Employee p: employees) {
            p.writeOutput();
            System.out.println();
        }

        for(int i = 1; i < 2; i++) {

        }
//        for(Employee p: employees) {

            if (employees.get(1).equals(employees.get(2)))
                System.out.println("They are equal");
            else {
                System.out.println("They are not equal");
            }

            if (employees.get(3).equals(employees.get(4)))
                System.out.println("They are equal");
            else {
                System.out.println("They are not equal");
            }
//        }
        System.out.println(employees.get(3).equals(employees.get(4)));
        System.out.println(employees.get(3));
    }

}
