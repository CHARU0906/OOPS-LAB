 import java.util.Scanner; class grade{ 
public static void main(String[] args) { Scanner scan = new 
Scanner(System.in); 
System.out.print("Enter the student's marks (out of 100): "); 
int marks = scan.nextInt(); char grade=' '; 
if (marks >= 90 && marks <= 100) { grade = 'A'; 
} else if (marks >= 80) { grade = 'B'; 
} else if (marks >= 70) { grade = 'C'; 
} else if (marks >= 60) { grade = 'D'; 
} else if (marks >= 50) { grade = 'E'; 
} else if (marks >= 0) { grade = 'F'; 
} 
 else { 
System.out.println("Invalid input"); 
} 
System.out.println("The student's grade is: " + grade); scan.close(); } 
 }
