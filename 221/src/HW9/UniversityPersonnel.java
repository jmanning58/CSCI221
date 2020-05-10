package HW9;

/**
 * Process Persons of all types
 */
import java.util.*;

public class UniversityPersonnel
{
    // These lists store the vital information for each member of the 
    // university community
    private Person[] ourStudents;
    private Person[] ourEmployees;
    
    public UniversityPersonnel(){
       ourStudents = new Person[21];
       ourEmployees = new Person[21];

    }
    int iEmployees = 0;
    int iStudents = 0;
    /**
     * This method, addEmployee, adds a new Faculty or Staff member
     * as long as we do not get two employees with the same employee number
     * 
     * If this method is called with an employee number that is already stored, 
     * it throws an Exception on the employee number.
     * 
     */
    public void addEmployee(Employee newHire) throws Exception{

        for(int i = 0; i < ourEmployees.length; i++) {

           if (this.ourEmployees[i].compareTo(newHire) == 0) {
               throw new Exception("Duplicate number, " + newHire.getName() + "cannot be added.");
           }

            }
        ourEmployees[iEmployees] = newHire;
        ++iEmployees;
        }
      
    /**
     * This method, addStudent, adds a new Faculty or Staff member
     * as long as we do not get two employees with the same employee number
     * 
     * If this method is called with an employee number that is already stored, 
     * it throws an Exception on the employee number.
     * 
     */
    public void addStudent(Student newAdmit) throws Exception{


        for(int i = 0; i < ourStudents.length; i++) {


            if (this.ourStudents[i].compareTo(newAdmit) == 0) {
                throw new Exception("Duplicate number, " + newAdmit.getName() + "cannot be added.");
                }
            }
        ourStudents[iStudents] = newAdmit;
        ++iStudents;
    }
    
    public void printStudents(){

        System.out.println("\tStudents List\n");
        for(int i = 0; i < ourStudents.length; i++) {

            System.out.println(ourStudents[i]);
        }
        
    }
    
    public void printEmployees(){

        System.out.println("\tEmployees List\n");
        for(int i = 0; i < ourEmployees.length; i++) {

            System.out.println(ourEmployees[i]);
        }
    }
    
    public void printAll( ){

    printStudents();
    System.out.println();
    printEmployees();
    }
    
    public void sortStudents(){Arrays.sort(this.ourStudents); }
    
    public void sortEmployees(){Arrays.sort(this.ourEmployees);
    }
}
