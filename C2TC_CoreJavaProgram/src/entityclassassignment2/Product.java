package entityclassassignment2;

import java.time.LocalTime;

public class Product {
 private int pid;
 private String pname;
 private LocalTime expir;
 private int price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public LocalTime getExpir() {
	return expir;
}
public void setExpir(LocalTime currentTime) {
	this.expir = currentTime;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", expir=" + expir + ", price=" + price + "]";
}
}
