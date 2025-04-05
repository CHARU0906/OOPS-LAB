class InsufficientBalanceException extends Exception { 

    public InsufficientBalanceException(String message) { 
        super(message); 
    } 
} 
 
class InvalidAmountException extends Exception { 
    public InvalidAmountException(String message) { 
        super(message); 
    } 
} 
class ATM { 
    private double balance; 
 
    public ATM(double balance) { 
        this.balance = balance; 
    } 
 
    public void withdraw(double amount) throws InsufficientBalanceException, 
InvalidAmountException { 
        if (amount <= 0) { 
            throw new InvalidAmountException("Invalid amount! Please enter a positive 
value."); 
        } 
        if (amount > balance) { 
            throw new InsufficientBalanceException("Insufficient balance! You only have $" 
+ balance); 
 
        } 
        balance -= amount; 
        System.out.println("Withdrawal successful! Remaining balance: $" + balance); 
CH.SC.U4C SE24142 A SANTH OSH 
1 1 7 
 
 
    } 
} 
public class ATMSystem { 
    public static void main(String[] args) { 
        ATM atm = new ATM(5000); // Initial balance = $5000 
 
        try { 
            atm.withdraw(6000);  // Exceeds balance → InsufficientBalanceException 
        } catch (InsufficientBalanceException | InvalidAmountException e) { 
            System.out.println("Exception: " + e.getMessage()); 
        } 
 
        try { 
            atm.withdraw(-100); // Negative amount → InvalidAmountException 
        } catch (InsufficientBalanceException | InvalidAmountException e) { 
            System.out.println("Exception: " + e.getMessage()); 
        } 
 
        try { 
            atm.withdraw(3000); // Valid withdrawal → Success 
        } catch (InsufficientBalanceException | InvalidAmountException e) { 
            System.out.println("Exception: " + e.getMessage()); 
        } 
    } 
} 
