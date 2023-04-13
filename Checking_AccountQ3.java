package perform;

//Define the BankAccount interface
interface BankAccount {
void deposit(double amount);
void withdraw(double amount);
}

//Implement the BankAccount interface with CheckingAccount class
class CheckingAccount implements BankAccount {
private double balance;

public void deposit(double amount) {
balance += amount;
System.out.println(amount + " deposited. Current balance is " + balance);
}

public void withdraw(double amount) {
if (balance >= amount) {
 balance -= amount;
 System.out.println(amount + " withdrawn. Current balance is " + balance);
} else {
 System.out.println("Insufficient balance. Withdrawal failed.");
}
}
}

//Create an object of the CheckingAccount class and call the methods
class Checking_AccountQ3 {
public static void main(String[] args) {
CheckingAccount account = new CheckingAccount();
account.deposit(50000.00);
account.withdraw(35000.00);
}
}
