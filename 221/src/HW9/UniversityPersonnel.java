package HW9;

/**
 * Process Persons of all types
 */
import java.util.*;
public class UniversityPersonnel
{
    // These lists store the vital information for each member of the 
    // university community
    private ArrayList<Student> ourStudents;
    private ArrayList<Employee> ourEmployees;
    
    public UniversityPersonnel(){
       ourStudents = new ArrayList<>();
       ourEmployees = new ArrayList<>();
    }
    
    /**
     * This method, addEmployee, adds a new Faculty or Staff member
     * as long as we do not get two employees with the same employee number
     * 
     * If this method is called with an employee number that is already stored, 
     * it throws an Exception on the employee number.
     * 
     */
    public void addEmployee(Employee newHire) throws Exception{

        try {
            for(int i = 0; i < ourEmployees.size(); i++) {


                if (this.ourEmployees.get(i).equals(newHire)) {
                    throw new Exception("Duplicate number, " + newHire.getName() + "cannot be added.");
                }
            }
        }
        catch (Exception excpt) {
            System.out.println(excpt.getMessage());
        }
        
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


        for(int i = 0; i < ourStudents.size(); i++) {


            if (this.ourStudents.get(i).compareTo(newAdmit) == 0) {
                throw new Exception("Duplicate number, " + newAdmit.getName() + "cannot be added.");
                }
            }
        ourStudents.add(newAdmit);

//        catch (Exception excpt) {
//            System.out.println(excpt.getMessage());
        }


    
    public void printStudents(){

        for(int i = 0; i < ourStudents.size(); i++) {
            System.out.println(ourStudents.get(i));
        }
        
    }
    
    public void printEmployees(){
           
        for(int i = 0; i < ourEmployees.size(); i++) {
            System.out.println(ourEmployees.get(i));
        }
    }
    
    public void printAll( ){

        // System.out.println("Students:");

        for(int i = 0; i < ourStudents.size(); i++) {
            System.out.println(ourStudents.get(i));
        }

        System.out.println("Employees:");

        for(int i = 0; i < ourEmployees.size(); i++) {
            System.out.println("i + 1" + ourEmployees.get(i));
        }
    }
    
    public void sortStudents(){
        Collections.sort(ourStudents);
    }
    
    public void sortEmployees(){
        Collections.sort(ourEmployees);
    }
}
