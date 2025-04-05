class Account { 
    String accountNumber; 
    double balance; 
  
    public Account(String accountNumber, double balance) { 

 
        this.accountNumber = accountNumber; 
        this.balance = balance; 
    } 
  
    public void deposit(double amount) { 
 
        balance += amount; 
    } 
  
    public void withdraw(double amount) { 
        if (balance >= amount) { 
            balance -= amount; 
        } else { 
            System.out.println("Insufficient funds"); 
        } 
    } 
  
    public double getBalance() { 
        return balance; 
    } 
} 
  
class CheckingAccount extends Account { 
    double transactionFee; 
  

 
    public CheckingAccount(String accountNumber, double balance, 
double transactionFee) { 
        super(accountNumber, balance); 
        this.transactionFee = transactionFee; 
    } 
  
    @Override 
    public void withdraw(double amount) { 
        super.withdraw(amount); 
        balance -= transactionFee; 
    } 
} 
  
class SavingsAccount extends Account { 
    double interestRate; 
  
    public SavingsAccount(String accountNumber, double balance, 
double interestRate) { 
        super(accountNumber, balance); 
        this.interestRate = interestRate; 
    } 
  
    public void applyInterest() { 
        balance += balance * interestRate; 
    } 

} 
  
public class Main { 
    public static void main(String[] args) { 
        CheckingAccount checking = new CheckingAccount("CA123", 
1000, 2); 
        SavingsAccount savings = new SavingsAccount("SA123", 1000,  
0.05); 
  
        checking.deposit(500); 
        checking.withdraw(200); 
        System.out.println("Checking Account Balance: " + 
checking.getBalance()); 
  
        savings.applyInterest(); 
        System.out.println("Savings Account Balance: " + 
savings.getBalance()); 
    } 
} 
