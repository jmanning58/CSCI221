package HW9;

public class Undergraduate extends Student
{
    private int level; //1 for freshman, 2 for sophomore,
                       //3 for junior, or 4 for senior.
    public Undergraduate( )
    {
        //super( ); // java makes this call implicitly - can't help itself
        level = 1;
      
    }
    
    public Undergraduate(String name, int initialStudentNumber, 
                         int initialLevel)
    {
        super(name, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
    }
    
    public void reset(String newName, int newStudentNumber, 
                      int newLevel)
    {
        setName(newName);
        studentNumber = newStudentNumber;
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
    }
    
    public int getLevel( )
    {
        return level;
    }
    
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
 
    public void writeOutput( )
    {
        super.writeOutput( ); // use Student's writeOutput
        System.out.println("Student Level: " + level);
    }

    // equals method for Undergraduates - does not override Object equals
    public boolean equals(Undergraduate other)
    {
        return super.equals(other) &&
               (this.level == other.level);
    }

    public String toString() {
        return super.toString() + ", " + level;
    }

    public int compareTo(Object o) {
        return 0;
    }
}