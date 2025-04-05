abstract class Employee { 
    protected String name; 
    protected int hoursWorked; 
  
    public Employee(String name, int hoursWorked) { 
        this.name = name; 
        this.hoursWorked = hoursWorked; 
    }    public abstract void calculateSalary(); 
} 
  
class FullTimeEmployee extends Employee { 
    private double hourlyRate = 20; 
  
    public FullTimeEmployee(String name, int hoursWorked) { 
        super(name, hoursWorked); 
    } 
  
    @Override 
    public void calculateSalary() { 
        double salary = hourlyRate * hoursWorked; 
        System.out.println("Full-Time Employee " + name + " Salary: $" + salary); 
    } 
} 
  
class PartTimeEmployee extends Employee { 

 
    private double hourlyRate = 15; 
  
    public PartTimeEmployee(String name, int hoursWorked) { 
        super(name, hoursWorked); 
    } 
  
    @Override 
    public void calculateSalary() { 
        double salary = hourlyRate * hoursWorked; 
        System.out.println("Part-Time Employee " + name + " Salary: $" + salary); 
    } 
} 
 
  
public class EmployeeManagement { 
    public static void main(String[] args) { 
        Employee fullTimeEmp = new FullTimeEmployee("John", 40); 
        Employee partTimeEmp = new PartTimeEmployee("Jane", 25); 
  
        fullTimeEmp.calculateSalary(); 
        partTimeEmp.calculateSalary(); 
    } 
} 
