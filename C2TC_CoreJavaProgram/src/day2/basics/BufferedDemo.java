package day2.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter the name");
		name = br.readLine();
		int age ;
		System.out.println("Enter the age");
		age=Integer.parseInt(br.readLine());
	
		float avg;
		// why the (int)br.readLine() is not working
		// in this char only can change to int with above (int) , string cannot be change
		System.out.println("Enter the Average:");
		avg=Float.parseFloat(br.readLine());
		
		System.out.println("name"+name+"Age"+age+"avg"+avg);
		
	}

}
