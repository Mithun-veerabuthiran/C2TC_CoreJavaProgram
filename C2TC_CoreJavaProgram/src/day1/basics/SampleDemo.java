package day1.basics;

public class SampleDemo {
	// in this which static block will run first and give the output of it :
	//block 2 , block1 ,main block this way it will work
    // declare of the static block 
	static {
		System.out.println("Welcome from static"+"static block 2");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to JFS...");
		System.out.println("next Line");
		}
	static {
		System.out.println("Welcome from static"+"static block 1");
	}
	

}
