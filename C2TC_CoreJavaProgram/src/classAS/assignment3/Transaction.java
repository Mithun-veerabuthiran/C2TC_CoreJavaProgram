package classAS.assignment3;

public class Transaction {
 private final double Transactionfee =15;
 public final void performTransaction(Account account ,String type ,double amount) {
	 System.out.println("\nPerforming transaction "+ type +" on "+ amount);
	 if(type.equalsIgnoreCase("deposit")) {
	      account.deposit(amount);	 
	 }
	 else if (type.equalsIgnoreCase("withdraw")) {
		 
		 account.withdraw(amount+Transactionfee);
	 }
	 {
			System.out.println("invalid transaction");
		}
		System.out.println("->Transaction fee: "+Transactionfee);
		System.out.println("->Balance: "+ account.bal);
	 
	 }
	 
	 
 
}
