
/**
 * A staff member is a special type of Employee
 */
public class Staff extends Employee
{
    // instance variables - replace the example below with your own
    private int numberOfYearsWorked;

    /**
     * Constructor for objects of class Staff
     */
    public Staff(String name, int number, int years)
    {
        // initialise instance variables
        super(name, number);
        numberOfYearsWorked = years;
    }
    /**
     * Output the instance data for this Staff member
     */
    public void writeOutput()
    {
        // put your code here
        super.writeOutput();
        System.out.println("Years worked: " + numberOfYearsWorked);
    }
    
    // equals - not the one inherited from Object
    // do two Staff objects contain the same data?
    public boolean equals(Staff other)
    {
         return (super.equals(other) 
             && (this.numberOfYearsWorked ==
                                other.numberOfYearsWorked));

    }
}
