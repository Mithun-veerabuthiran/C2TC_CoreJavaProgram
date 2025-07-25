package classAS.assignment3;

public class SavingsAccount extends Account {

	public SavingsAccount(long accountNumber, double bal) {
		super(accountNumber, bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		
		bal += amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(bal >0 && amount > bal) {
			bal -= amount;
		}
		
		
		
		
	}

	@Override
	public double getbalance() {
		
		return bal;
	}

}
