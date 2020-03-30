package HW7;

public class Staff extends Employee {

    private int years; //"Masters" for masters, "PhD" for doctorate
    private int staffNumber;

    public Staff( ) {

        super( ); // this call not necessary, happens automatically
        staffNumber = 0;
        years = 0;  // not registered yet
    }

    public Staff(String name, int newStaffNumber, int years) {

        super(name);
        setStaffNumber(newStaffNumber);
        setYears(years);
    }

    public void reset(String newName, int newStaffNumber, int years) {

        setName(newName);
        setStaffNumber(newStaffNumber);
        setYears(years);
    }

    public int getStaffNumber( ) {

        return staffNumber;
    }

    public int getyears( )
    {
        return years;
    }

    public void setStaffNumber(int newStaffNumber) {

        staffNumber = newStaffNumber;
    }

    // verifies valid entry for degree
    public void setYears(int moreYears) {

        if (moreYears >= years)
            years = moreYears;

        else {

            System.out.println("Haven't worked enough to change amount of time worked.");
            System.exit(0);
        }
    }

    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Staff number: " + staffNumber);
        System.out.println("Years worked: " + years);
    }


    public boolean equals(Staff other)
    {
        return super.equals(other);//super.equals(other) && (this.years == other.years);
    }
}
