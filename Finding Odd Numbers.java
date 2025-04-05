import java.util.*; 
  
public class OddNumbersInRange { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the lower limit: "); 
        int lower = scanner.nextInt(); 
        System.out.print("Enter the upper limit: "); 
        int upper = scanner.nextInt(); 
  
        for (int i = lower; i <= upper; i++) { 
            if (i % 2 != 0) { 
                System.out.println(i); 

 
 
            } 
        } 
        scanner.close(); 
    } 
} 
