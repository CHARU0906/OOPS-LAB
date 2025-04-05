import java.util.Scanner; 
class bill{ 
public static void main(String[] args) { Scanner scan = new 
Scanner(System.in); 
System.out.print("Enter the number of units consumed: "); 
double units = scan.nextDouble(); double billAmount; 
if (units <= 100) { billAmount = units * 
1.50; 
} else if (units <= 300) { 
billAmount = (100 * 1.50) + ((units - 100) * 2.00); 
} else { 
billAmount = (100 * 1.50) + (200 * 2.00) + ((units - 
300) * 3.00); 
} 
double serviceCharge = 50.00; billAmount += 
serviceCharge; 
System.out.println("Total Bill Amount: Rs. " + billAmount); 

 
 
 
scan.close(); 
} 
} 
