class Person { 
String name; 
int id; 
 
public Person(String name, int id) { 
this.name = name; 
this.id = id; 
} 
 
 
public void displayDetails() { 
System.out.println("ID: " + id + ", Name: " + name); 
} 
} 
class Doctor extends Person { 
String specialty; 
 
public Doctor(String name, int id, String specialty) { 

 
super(name, id); 
this.specialty = specialty; 
} 
 
 
@Override 
public void displayDetails() { 
System.out.println("Doctor - ID: " + id + ", Name: " + name + ", 
Specialty: " + specialty); 
} 
} 
class Patient extends Person { 
String disease; 
 
public Patient(String name, int id, String disease) { 
super(name, id); 
this.disease = disease; 
} 
 
 
@Override 
public void displayDetails() { 
System.out.println("Patient - ID: " + id + ", Name: " + name + ", 
Disease: " + disease); 
} 

 
} 
class Staff extends Person { 
String role; 
 
public Staff(String name, int id, String role) { 
super(name, id); 
this.role = role; 
} 
 
 
@Override 
public void displayDetails() { 
System.out.println("Staff - ID: " + id + ", Name: " + name + ", Role: " 
+ role); 
} 
} 
 
 
public class HospitalManagement { 
public static void main(String[] args) { 
Person[] people = { 
new Doctor("Dr. Smith", 101, "Cardiology"), 
new Patient("Alice", 201, "Flu"), 
new Staff("John", 301, "Nurse"), 
new Doctor("Dr. Brown", 102, "Neurology"), 

 
new Patient("Bob", 202, "Fracture") 
}; 
 
 
for (Person p : people) { 
p.displayDetails(); 
} 
} 
} 
