
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
        
        
    }
    
    public void printStudents(){
           
        
    }
    
    public void printEmployees(){
           
        
    }
    
    public void printAll( ){
        
    }
    
    public void sortStudents(){
        
    }
    
    public void sortEmployees(){
        
    }
   
}
