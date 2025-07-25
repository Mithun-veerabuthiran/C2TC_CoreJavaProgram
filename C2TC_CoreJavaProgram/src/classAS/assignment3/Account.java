package classAS.assignment3;

public abstract class Account {
 private long AccountNumber;
 protected double bal;
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getbalance();
public Account(long accountNumber, double bal) {
	this.AccountNumber = accountNumber;
	this.bal = bal;
	Bank.totaladdedaccount();
	
}
public void getAccountDetails()//concrete method (implementing functionality)
{
	System.out.println("Account number: "+AccountNumber);
	System.out.println("Balance amount: "+bal);
}
 
}
