import java.util.Scanner; 
class Triangle{ 
public static void main(String[] args) { Scanner scan = new 
Scanner(System.in); 
System.out.print("Enter the base of the triangle: "); double base = 
scan.nextDouble(); System.out.print("Enter the height of the triangle: "); 
double height = scan.nextDouble(); 
double area = 0.5 * base * height; System.out.println("The area of the 
triangle is: " + 
area); 
scan.close(); 
} 
} 
