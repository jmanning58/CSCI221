/**
 * Sample Person class - superclass example
 */
public class Person 
{
    // Names assumed to be stored in Last, First Name order
    private String name; // since private, will need 
                         // getter and setter methods for
                         // subclasses to access
    
    // zero argument constructor - make up names
    public Person( )
    {
        name = "unknown";
    }
    
    // fully parameterized constructor provides values for instance
    // variables
    public Person(String name)
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
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    } 
}