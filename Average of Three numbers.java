import java.util.Scanner; class 
average{ 
public static void main(String[] args) { Scanner scan = 
new Scanner(System.in); 
System.out.print("Enter the first number: "); int num1 = 
scan.nextInt(); System.out.print("Enter the second number: 
"); int num2 = scan.nextInt(); System.out.print("Enter the 
third number: "); int num3 = scan.nextInt(); 
double average = (num1 + num2 + num3) / 3; System.out.println("The 
average of the three numbers is: " + 
average); 
scan.close(); 
} 
} 
 
