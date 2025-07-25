package day5.Assignment.association.hasa;

public class Address {
     private String street;
     private String city;
  // Constructor
 	public Address() {
 		super();

 	}
     public Address(String street, String city, String state, String postalcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}
	private String state;
     private String postalcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
}
