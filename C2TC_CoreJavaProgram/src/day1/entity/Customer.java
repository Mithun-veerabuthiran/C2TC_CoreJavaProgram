package day1.entity;

public class Customer {
	private int customerid;
	private String customername;
	private String customercity;
	
public  int cid;
public String cname;
public 	String city;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomercity() {
	return customercity;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", customername=" + customername + ", customercity=" + customercity
			+ ", cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
}
	
//public void setcustomerid(int customerid) {
//	this.customerid=customerid;
//}
//public int getcustomerid() {
//	return this.customerid;
//}


}
