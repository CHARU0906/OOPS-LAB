 abstract class BankAccount { 
 protected double balance; 
 
public BankAccount(double initialBalance) { 
    this.balance = initialBalance; 
} 
 
public abstract void deposit(double amount);  
public abstract void withdraw(double amount); 
public abstract void displayBalance(); 
  
} 
class SavingAccount extends BankAccount { 
public SavingAccount(double initialBalance) { 
    super(initialBalance); 
} 
 
@Override 
public void deposit(double amount) { 
    if (amount > 0) { 

 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Saving 
Account."); 
    } else { 
        System.out.println("Deposit amount should be greater than 
zero."); 
    } 
} 
 
@Override 
public void withdraw(double amount) { 
    if (amount > 0 && amount <= balance) { 
        balance -= amount; 
        System.out.println("Withdrew $" + amount + " from Saving 
Account."); 
    } else { 
        System.out.println("Insufficient balance or invalid amount."); 
    } 
} 
 
 
@Override 
public void displayBalance() { 
    System.out.println("Saving Account Balance: $" + balance); 
} 
  
} 
 class CurrentAccount extends BankAccount {  
private double overdraftLimit = 1000; 
public CurrentAccount(double initialBalance) { 
    super(initialBalance); 
} 
 
@Override 
public void deposit(double amount) { 
    if (amount > 0) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Current 
Account."); 
    } else { 
        System.out.println("Deposit amount should be greater than 
zero."); 
    } 
} 
 
@Override 

    public void withdraw(double amount) { 
if (amount > 0 && balance - amount >= -overdraftLimit) { 

        balance -= amount; 
        System.out.println("Withdrew $" + amount + " from Current 
Account."); 
    } else { 
        System.out.println("Insufficient balance or exceeds overdraft 
limit."); 
    } 
} 
 
@Override 
public void displayBalance() { 
    System.out.println("Current Account Balance: $" + balance); 
} 
  
} 
 public class pract { public static void main(String[] args) { 
 savingAccount = new SavingAccount(500); 
 BankAccount currentAccount = new CurrentAccount(1000); 
    savingAccount.deposit(300); 
    savingAccount.withdraw(100); 
    savingAccount.displayBalance(); 
 
    currentAccount.deposit(500); 
    currentAccount.withdraw(1500); 
    currentAccount.displayBalance(); 
} 
  
} 
