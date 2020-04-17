package HW9;

/**
 * An Employee is a special type of Person
 * 
 * McCauley
 */
public abstract class Employee extends Person {
    // instance variables - replace the example below with your own
    protected int employeeNumber;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, int number) {
        // initialise instance variables
        super(name);
        employeeNumber = number;
    }

    /**
     * Output the instance data for this Employee
     */
    public void writeOutput() {
        // put your code here
        super.writeOutput();
        System.out.println("Employee number: " + employeeNumber);
    }

    // equals - not the one inherited from Object
    // do two Employee objects contain the same data?
    public boolean equals(Employee otherEmployee) {
        return (this.hasSameName(otherEmployee)
                && (this.employeeNumber ==
                otherEmployee.employeeNumber));

    }

    public String toString() {
        return super.toString() + ", " + employeeNumber;
    }

    public int compareTo(Person o) {

        Employee temp = (Employee) o;
        if (this.employeeNumber < temp.employeeNumber) {
            return -1;
        } else if (this.employeeNumber > temp.employeeNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}

