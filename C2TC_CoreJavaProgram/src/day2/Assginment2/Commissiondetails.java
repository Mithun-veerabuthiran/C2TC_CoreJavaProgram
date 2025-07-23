package day2.Assginment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commissiondetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Commission cu = new Commission();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of sales employee ");
//        int s = (int)buffer.read();
//        System.out.println(s);
      // In this buffer.read only get the sinlge char and return the ascii char
        int s =Integer.parseInt(buffer.readLine());
        System.out.println(s);
        for(int i=1;i<=s;i++) {
        	System.out.println("Enter the details of sales employee");
        	System.out.println("Enter the Name of employee");
        	
        	String name=buffer.readLine();
        	cu.setName(name);
        	
        	System.out.println("Enter the Address of the employee");
        	String Addres = buffer.readLine();
        	cu.setAddress(Addres);
        	System.out.println("Enter the Phone of employee");
        	int phone = Integer.parseInt(buffer.readLine());
        	cu.setPhone(phone);
        	System.out.println();
        	System.out.println("Enter the Sales_amount of employee");
        	int pay = Integer.parseInt(buffer.readLine());
        	cu.setSales_amount(pay);
        }
       
        int commission;
        double pre;
        System.out.println(cu);
        if(cu.getSales_amount()>=100000) {
        	pre=cu.getSales_amount()*(0.1);
         commission=(int)pre;
         System.out.println("the commission for sales employee "+commission);
        }
        else if(cu.getSales_amount() >= 50000 && cu.getSales_amount()< 100000) {
        	pre =cu.getSales_amount()*(0.08);
        	commission =(int)pre;
        	System.out.println("the commission for sales employee "+commission);
        }
        else if(cu.getSales_amount()>=30000 && cu.getSales_amount()<50000) {
        	pre=cu.getSales_amount()*(0.03);
        	commission =(int)pre;
        	System.out.println("the commission for sales employee "+commission);
        }
        else if(cu.getSales_amount() < 30000) {
        	System.out.println("no commission");
        }
       
	}

}
