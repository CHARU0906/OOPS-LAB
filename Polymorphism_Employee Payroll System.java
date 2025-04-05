class Employee { 
String name; 

 
int id; 
double baseSalary; 
 
 
Employee(String name, int id, double baseSalary) { 
this.name = name; 
this.id = id; 
this.baseSalary = baseSalary; 
} 
 
 
double calculateSalary() { // Polymorphic method 
return baseSalary; 
} 
 
 
void displaySalary() { 
System.out.println("Employee ID: " + id + ", Name: " + name + ", 
Salary: $" + calculateSalary()); 
} 
} 
class FullTimeEmployee extends Employee { 
double bonus; 
 
FullTimeEmployee(String name, int id, double baseSalary, double 
bonus) { 
super(name, id, baseSalary); 
this.bonus = bonus; 
} 

 
@Override 
double calculateSalary() { 
return baseSalary + bonus; 
} 
} 
 
 
class PartTimeEmployee extends Employee { 
int hoursWorked; 
double hourlyRate; 
 
 
PartTimeEmployee(String name, int id, double hourlyRate, int 
hoursWorked) { 
super(name, id, 0); 
this.hourlyRate = hourlyRate; 
this.hoursWorked = hoursWorked; 
} 
 
 
@Override 
double calculateSalary() { 
return hourlyRate * hoursWorked; 
} 
} 
public class EmployeePayroll { 
public static void main(String[] args) { 
// Creating an array of Employee objects (looping used) 
Employee employees[] = new Employee[3]; 
CH.SC.U4C SE24142 A SANTH OSH 
4 1 
 
 
employees[0] = new FullTimeEmployee("Alice", 101, 5000, 1000); 
employees[1] = new PartTimeEmployee("Bob", 102, 20, 80); 
employees[2] = new FullTimeEmployee("Charlie", 103, 4500, 800); 
 
 
// Loop through and display employee salaries 
for (Employee emp : employees) { 
emp.displaySalary(); 
} 
} 
}
