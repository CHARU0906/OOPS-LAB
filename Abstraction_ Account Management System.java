abstract class Account { 
    protected double balance; 

 
  
    public Account(double balance) { 
        this.balance = balance; 
    } 
  
    public abstract void deposit(double amount); 
    public abstract void withdraw(double amount); 
    public abstract void transactionHistory(); 
} 
  
class SavingsAccount extends Account { 
    private int transactionCount = 0; 
  
    public SavingsAccount(double balance) { 
        super(balance); 
    } 
  
    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        transactionCount++; 
        System.out.println("Deposited $" + amount + " to Savings Account"); 
    } 
  
    @Override 
    public void withdraw(double amount) { 
        if (amount <= balance) { 
            balance -= amount; 
            transactionCount++; 
CH.SC.U4C SE24142 A SANTH OSH 
9 1 
 
 
            System.out.println("Withdrew $" + amount + " from Savings Account"); 
        } else { 
            System.out.println("Insufficient funds in Savings Account."); 
        } 
    } 
  
    @Override 
    public void transactionHistory() { 
        System.out.println("Savings Account has made " + transactionCount + " 
transactions."); 
    } 
} 
  
class CreditAccount extends Account { 
    private double creditLimit = 1000; 
  
    public CreditAccount(double balance) { 
        super(balance); 
    } 
  
    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Credit Account."); 
    } 
  
    @Override 
    public void withdraw(double amount) { 
        if (balance + creditLimit >= amount) { 
CH.SC.U4C SE24142 A SANTH OSH 
9 2 
 
 
            balance -= amount; 
            System.out.println("Withdrew $" + amount + " from Credit Account."); 
        } else { 
            System.out.println("Exceeds credit limit."); 
        } 
    } 
  
    @Override 
    public void transactionHistory() { 
        System.out.println("Credit Account has balance of $" + balance + " and a credit 
limit of $" + creditLimit); 
    } 
} 
  
public class AccountManagementSystem { 
    public static void main(String[] args) { 
        Account savings = new SavingsAccount(500); 
        Account credit = new CreditAccount(200); 
  
        savings.deposit(100); 
        savings.withdraw(50); 
        savings.transactionHistory(); 
  
        credit.deposit(500); 
        credit.withdraw(600); 
        credit.transactionHistory(); 
    } 
} 
