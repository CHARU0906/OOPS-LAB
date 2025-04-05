public class BankingApp { 
    public static void main(String[] args) { 
        double totalBalance = 5000; 
        int months = 0; // This will cause a division by zero 
 
  
        try { 
            double avgBalance = totalBalance / months; 

 
            System.out.println("Average Monthly Balance: " + avgBalance); 
        } catch (ArithmeticException e) { 
            System.out.println("Error: Cannot divide by zero. Please enter a valid number of 
months."); 
        } 
        System.out.println("Banking system continues..."); 
    } 
} 
