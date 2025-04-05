import java.util.Scanner; class category{ 
public static void main(String[] args) { Scanner scan = new 
Scanner(System.in); 
System.out.print("Enter the person's age: "); int age = scan.nextInt(); 
String category; if (age < 0) { 
               category = "Invalid age entered."; 
} else if (age <= 12) { category = "Child"; 
} else if (age <= 19) { category = "Teenager"; 
} else if (age <= 59) { category = "Adult"; 
} else { 
category = "Senior Citizen"; 
} 
System.out.println("The person belongs to the category: " + category); 
scan.close(); 
} 
} 
