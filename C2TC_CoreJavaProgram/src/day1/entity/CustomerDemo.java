package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
//		int m,n;
//		m=100;
//		n=50;
	//customer 1	
	 Customer c1 = new Customer();
	 c1.cid=101;
	 c1.cname="Mithun";
	 c1.city="Puducherry";
	 System.out.println("Customer id:"+c1.cid);
	 System.out.println("Customer name:"+c1.cname);
	 System.out.println("Customer city:"+c1.city);
	 //customer 2
	 Customer c2 = new Customer();
	 c2.cid=102;
	 c2.cname="subi";
	 c2.city="Puducherry";
	 System.out.println("Customer id:"+c2.cid);
	 System.out.println("Customer name:"+c2.cname);
	 System.out.println("Customer city:"+c2.city);
	 // getter and setter method
	 Customer c3 = new Customer();
	 c3.setCustomerid(103);
	 c3.setCustomername("ha");
	 c3.setCustomercity("puducherry");
	 System.out.println("Customer id:"+c3.getCustomerid());
	 System.out.println("Customer name:"+c3.getCustomername());
	 System.out.println("Customer city:"+c3.getCustomercity());
	 //usage of tostring
	 System.out.println(c3);
	 
	}

}
