
/**
 * A Graduate is a special type of Student
 * 
 */
public class Graduate extends Student
{
    private String degree; //"Masters" for masters, "PhD" for doctorate
    
    public Graduate( )
    {
        super( ); // this call not necessary, happens automatically
        degree = "";  // not registered yet
      
    }
    
    public Graduate(String name, int initialStudentNumber, 
                          String degree)
    {
        super(name, initialStudentNumber);
        setDegree(degree);
    }
    
    public void reset(String newName, int newStudentNumber, 
	                  String degree)
    {
        setName(newName);
        studentNumber = newStudentNumber; 
        setDegree(degree); 
    }
    
    public String getDegree( )
    {
        return degree;
    }
    
    // verifies valid entry for degree
    public void setDegree(String newDegree)
    {
        if (newDegree.equals("Masters") || newDegree.equals("PhD"))
            degree = newDegree;
        else
        {
            System.out.println("Illegal degree!");
            System.exit(0);
        }
    }
 
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Graduate Program: " + degree);
    }

 
    public boolean equals(Graduate other)
    {
        return super.equals(other) &&
               (this.degree.equals(other.degree));
    }	
}