package HW9;

/**
 * A Student is a special type of Person
 */
public abstract class Student extends Person
{
    // 1- freshman, 2- sophomore, 3- junior, 4- senior
    protected int studentNumber; 

    public Student()
    {
        super();
        studentNumber = 0;
    }
     
    public Student(String name, int initialStudentNumber)
    {
        super(name);      
        studentNumber = initialStudentNumber;
    }

    public void reset(String name, int newStudentNumber)
    {
        setName(name);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber( )
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    public void writeOutput( )
    {
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

    // equals - not the one inherited from Object
    public boolean equals(Student otherStudent)
    {
         return (this.hasSameName(otherStudent)
             && (this.studentNumber ==
                                otherStudent.studentNumber));

    }
    public String toString() {
        return super.toString() + ", " + studentNumber;
    }

    public int compareTo(Person o) {
        Student temp = (Student) o;
        if (this.studentNumber < temp.studentNumber) {
            return -1;
        } else if (this.studentNumber > temp.studentNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}