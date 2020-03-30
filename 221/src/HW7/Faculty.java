package HW7;

public class Faculty extends Employee {

    // 1- freshman, 2- sophomore, 3- junior, 4- senior
    protected int facultyNumber;
    protected String department;

    public Faculty() {

        super();
        department = "";
        facultyNumber = 0;
    }

    public Faculty(String name, int initialFacultyNumber) {

        super(name);
        facultyNumber = initialFacultyNumber;
    }

    public Faculty(String name, int initialFacultyNumber, String initialDepartment) {

        super(name);
        department = initialDepartment;
        facultyNumber = initialFacultyNumber;

    }

    public Faculty(String name, String initialDepartment) {

        super(name);
        department = initialDepartment;

    }

    public Faculty(int initialFacultyNumber, String initialDepartment) {

        facultyNumber = initialFacultyNumber;
        department = initialDepartment;
    }

    public void reset(String name, int newFacultyNumber, String newDepartment) {

        setName(name);
        facultyNumber = newFacultyNumber;
        department = newDepartment;
    }

    public int getFacultyNumber( ) {

        return facultyNumber;
    }

    public String getDepartment( ) {

        return department;
    }

    public void setFacultyNumber(int newFacultyNumber )
    {
        facultyNumber = newFacultyNumber;
    }

    public void setDepartment(String newDepartmentMember) {

        department = newDepartmentMember;
    }

    public void writeOutput( ) {

        super.writeOutput();
        System.out.println("Faculty Number: " + facultyNumber);
        System.out.println("Department: " + department);
    }

    // equals - not the one inherited from Object
    public boolean equals(Faculty otherFaculty) {

        return super.equals(otherFaculty); //&& (this.facultyNumber == (otherFaculty.facultyNumber));
    }
}
