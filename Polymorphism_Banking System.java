class Account { 
String accountHolder; 
double balance; 
 
Account(String accountHolder, double balance) { 
this.accountHolder = accountHolder; 
this.balance = balance; 
} 

 
void deposit(double amount) { 
balance += amount; 
System.out.println(accountHolder + " deposited $" + amount); 
} 
 
 
void withdraw(double amount) { // Polymorphic method 
if (balance >= amount) { 
balance -= amount; 
System.out.println(accountHolder + " withdrew $" + amount); 
} else { 
System.out.println("Insufficient funds for " + accountHolder); 
} 
} 
 
 
void displayBalance() { 
System.out.println(accountHolder + "'s Balance: $" + balance); 
} 
} 
class SavingsAccount extends Account { 
double interestRate; 
 
SavingsAccount(String accountHolder, double balance, double 
interestRate) { 
super(accountHolder, balance); 
this.interestRate = interestRate; 
} 

 
@Override 
void withdraw(double amount) { 
if (balance - amount >= 100) { // Maintain minimum balance of $100 
super.withdraw(amount); 
} else { 
System.out.println("Cannot withdraw. Minimum balance must be 
$100 for " + accountHolder); 
} 
} 
} 
class CheckingAccount extends Account { 
double overdraftLimit; 
 
CheckingAccount(String accountHolder, double balance, double 
overdraftLimit) { 
super(accountHolder, balance); 
this.overdraftLimit = overdraftLimit; 
} 
 
 
@Override 
void withdraw(double amount) { 
if (balance + overdraftLimit >= amount) { 
balance -= amount; 
System.out.println(accountHolder + " withdrew $" + amount + " 
(Overdraft allowed)"); 
} else { 

System.out.println("Overdraft limit exceeded for " + 
accountHolder); 
} 
} 
} 
public class BankingSystem { 
public static void main(String[] args) { 
// Creating an array of Account objects (looping used) 
Account accounts[] = new Account[3]; 
 
accounts[0] = new SavingsAccount("Alice", 500, 2.5); 
accounts[1] = new CheckingAccount("Bob", 300, 200); 
accounts[2] = new SavingsAccount("Charlie", 150, 3.0); 
for (Account acc : accounts) { 
acc.deposit(100); 
acc.withdraw(400); 
acc.displayBalance(); 
System.out.println(); 
} 
} 
} 
