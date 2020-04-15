
/**
 * A Faculty member is a special type of Employee
 */
public class Faculty extends Employee
{
    // instance variables - replace the example below with your own
    private String department;

    /**
     * Constructor for objects of class Faculty
     */
    public Faculty(String name, int number, String dept)
    {
        super(name,number);
        department = dept;
    }
    /**
     * Output the instance data for this Faculty member
     */
    public void writeOutput()
    {
        // put your code here
        super.writeOutput();
        System.out.println("Department: " + department);
    }
    
    // equals - not the one inherited from Object
    // do two Faculty objects contain the same data?
    public boolean equals(Faculty other)
    {
         return (super.equals(other) 
             && (this.department.equals(
                                other.department)));

    }
}
