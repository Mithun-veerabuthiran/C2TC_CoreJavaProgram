package day1.basics;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		// Addition of number with Scanner 
		// system is the common class 
		// out is the reference of output 
		// print() is the method in this why we are using the system class 
		// for call the static method we need to use the class name also ex: the system.out.println
		// in this println() is the static method so we call as "system.out.println()"
		// In this out is the output reference 
		// In this in is the input reference
		int a,b,c;
		Scanner si = new Scanner(System.in);
		System.out.println("Enter the value");
		a=si.nextInt();	
		b=si.nextInt();
		c=a+b;
		System.out.println("c = a +b"+c);
		si.close();
		

	}

}
