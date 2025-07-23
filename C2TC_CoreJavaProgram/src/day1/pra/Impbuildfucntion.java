package day1.pra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Impbuildfucntion {

	public static void main(String[] args) {
	// Java Built-in Functions
		//String Class Functions
	 String j = "JavaInterview";
     System.out.println(j.length());
     System.out.println(j.charAt(0));
     System.out.println(j.substring(4,5));
     System.out.println(j.contains("view"));
     System.out.println(j.toLowerCase());
     System.out.println(j.toUpperCase());
     //StringBuilder
     //BufferedReader
     try {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int ch =reader.read();
      System.out.println(ch);
      //int c = Integer.parseInt(ch);
      System.out.println((char)ch);
      
     }
     catch(Exception e) {
      System.out.println(e);    	 
     }
	}

}
