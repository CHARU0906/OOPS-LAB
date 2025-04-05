import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 
public class MedianFinder { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
ArrayList<Integer> numbers = new ArrayList<>(); 
Collections.sort(numbers); 
double median; 
System.out.print("Enter number of elements: "); 
int n = scanner.nextInt(); 
System.out.println("Enter numbers:"); 
for (int i = 0; i < n; i++) { 
numbers.add(scanner.nextInt()); 
} 

        if (n % 2 == 0) { 
            median = (numbers.get(n / 2 - 1) + numbers.get(n / 2)) / 2.0; 
        } else { 
            median = numbers.get(n / 2); 
        } 
        System.out.println("Sorted List: " + numbers); 
        System.out.println("Median: " + median); 
        scanner.close(); 
    } 
} 
