import java.util.Scanner; 
public class Fibonacci { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number of terms: "); 
        int terms = sc.nextInt(); 
        int first = 0, second = 1, next; 
        System.out.print("Fibonacci Series: " + first + " " + second); 
        for (int i = 2; i < terms; i++) { 
            next = first + second; 
            System.out.print(" " + next); 
            first = second; 
            second = next; 
        } 
        sc.close(); 
    }
}
