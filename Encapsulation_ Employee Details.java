class Employee { 
    private String name; 
    private int age; 
    private int id; 
    private String designation; 
    private String dob; 
    private String doj; 
    // Setter methods 
    void setName(String n) { 
        name = n; 
    } 
    void setAge(int a) { 
        age = a; 
    } 
    void setId(int i) { 
        id = i; 
    } 
    void setDesignation(String d) { 
        designation = d; 
    } 
  
 
    void setDob(String d) { 
        dob = d; 
    } 
  
    void setDoj(String d) { 
        doj = d; 
    } 
    String getName() { 

 
        return name; 
    } 
    int getAge() { 
        return age; 
    } 
    int getId() { 
        return id; 
    } 
    String getDesignation() { 
        return designation; 
    } 
    String getDob() { 
        return dob; 
    } 
    String getDoj() { 
        return doj; 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        Employee emp = new Employee(); 
  
        // Setting values without using 'this' or constructor 
        emp.setName("Harsh"); 
        emp.setAge(19); 
        emp.setId(51); 
        emp.setDesignation("Fitter"); 
        emp.setDob("12.09.1977"); 
        emp.setDoj("12.06.1999"); 
        System.out.println("Employer's name: " + emp.getName()); 
        System.out.println("Employer's age: " + emp.getAge()); 
        System.out.println("Employer's id: " + emp.getId()); 
        System.out.println("Employer's Designation: " + emp.getDesignation()); 
        System.out.println("DOB: " + emp.getDob()); 
        System.out.println("DOJ: " + emp.getDoj()); 
    } 
} 
