class Student { 
String name; 
int id; 
 
Student(String name, int id) { 
this.name = name; 
this.id = id; 
} 
 
 
void displayDetails() { 
System.out.println("Student ID: " + id + ", Name: " + name); 
}

 
} 
 
 
// Derived class for Undergraduate students 
class Undergraduate extends Student { 
String major; 
 
 
Undergraduate(String name, int id, String major) { 
super(name, id); 
this.major = major; 
} 
 
 
@Override 
void displayDetails() { 
System.out.println("Undergraduate Student - ID: " + id + ", Name: " 
+ name + ", Major: " + major); 
} 
} 
class Graduate extends Student { 
String researchTopic; 
 
Graduate(String name, int id, String researchTopic) { 
super(name, id); 
this.researchTopic = researchTopic; 
} 
 
 
@Override 

void displayDetails() { 
System.out.println("Graduate Student - ID: " + id + ", Name: " + 
name + ", Research Topic: " + researchTopic); 
} 
} 
 
 
public class StudentManagement { 
public static void main(String[] args) { 
Student students[] = new Student[3]; 
 
 
students[0] = new Undergraduate("Alice", 101, "Computer 
Science"); 
students[1] = new Graduate("Bob", 102, "Quantum Computing"); 
students[2] = new Undergraduate("Charlie", 103, "Mechanical 
Engineering"); 
for (Student s : students) { 
s.displayDetails(); 
} 
} 
}
