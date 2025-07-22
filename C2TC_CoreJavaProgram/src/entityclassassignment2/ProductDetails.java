package entityclassassignment2;

import java.time.LocalTime;
import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		Product s = new Product();
		LocalTime currentTime = LocalTime.now();
		
	 
	 System.out.println("Enter the number of the users");
	 int i = si.nextInt();
	 for(int k=1;k<=i;k++) {
		 System.out.println("Enter the id of the Product");
			int pid= si.nextInt();
			s.setPid(pid);
			System.out.println("Enter the name of the Product");
			String pname = si.next();
			s.setPname(pname);
			System.out.println("Enter the mark of the Manufacture date: "+currentTime);
			s.setExpir(currentTime);
			System.out.println("Enter the mark of the price");
			int price= si.nextInt();
			s.setPrice(price);
			 
		
	 } 
	
	 System.out.println(s);
	 

	}

}
