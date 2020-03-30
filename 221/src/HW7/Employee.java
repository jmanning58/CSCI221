package HW7;

public class Employee {

    private String name; // since private, will need
    // getter and setter methods for
    // subclasses to access

    // zero argument constructor - make up names
    public Employee( ) {
        name = "unknown";
    }

    // fully parameterized constructor provides values for instance
    // variables
    public Employee(String name)
    {
        this.name = name;
    }

    // set/reset a students names
    public void setName(String newName)
    {
        name = newName;
    }

    // return name in lastName, firstName format
    public String getName( )
    {
        return name;
    }

    // Print name, with label first last format
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }

    // compare two students for duplicate names
    public boolean hasSameName(Employee otherEmployee)
    {
        return this.name.equalsIgnoreCase(otherEmployee.name);
    }
}
