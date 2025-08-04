package DayEight.interfaces.implementinginterfaces;

public class Account {
 private int accNO;
 private String name;
 private double balance;
 private Bank bank;
public Account(int accNO, String name, double balance, Bank bank) {

	this.accNO = accNO;
	this.name = name;
	this.balance = balance;
	this.bank = bank;
}
public int getAccNO() {
	return accNO;
}
@Override
public String toString() {
	return "Account [accNO=" + accNO + ", name=" + name + ", bank=" + bank + ", balance=" + balance+ "]";
}
public void setAccNO(int accNO) {
	this.accNO = accNO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void deposit(double amount) {
    bank.deposit(this, amount);
}

public void withdraw(double amount) {
    bank.withdraw(this, amount);
}

 
}
