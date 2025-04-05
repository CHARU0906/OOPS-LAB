class Person { 
    String name; 
    int age; 
  
    public Person(String name, int age) { 
        this.name = name; 
        this.age = age; 
    } 
  
    public void display() { 
        System.out.println("Name: " + name + ", Age: " + age); 
    } 
} 
  
CH.SC.U4C SE24142 A SANTH OSH 
6 2 
 
 
class Employee extends Person { 
    double salary; 
  
    public Employee(String name, int age, double salary) { 
        super(name, age); 
        this.salary = salary; 
    } 
  
    @Override 
    public void display() { 
        super.display(); 
        System.out.println("Salary: " + salary); 
    } 
} 
  
class Manager extends Employee { 
    String department; 
  
    public Manager(String name, int age, double salary, String 
department) { 
        super(name, age, salary); 
        this.department = department; 
    } 
  
CH.SC.U4C SE24142 A SANTH OSH 
6 3 
 
 
    public void displayManagedEmployees() { 
        System.out.println(name + " manages employees in the " + 
department + " department."); 
    } 
  
    @Override 
    public void display() { 
        super.display(); 
        System.out.println("Department: " + department); 
    } 
} 
  
public class pract{ 
    public static void main(String[] args) { 
        Manager manager = new Manager("John", 40, 85000, "IT"); 
        manager.display(); 
        manager.displayManagedEmployees(); 
    } 
} 
