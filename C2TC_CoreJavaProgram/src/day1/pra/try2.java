package day1.pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class try2 {
	 
 static void  ProductSmallestPair(int sum, ArrayList<Integer> array) {
	 Collections.sort(array);
//	 System.out.println(array);
	 for(int i=0;i<array.size();i++) {
		 for(int j=i+1;j<array.size();j++) {
			     int firt = array.get(i);
			     int second = array.get(j);
			     if(firt!=second&&(firt+second)<=sum) {
			    	 System.out.println(firt*second);
			    	return;
			     }
			     
			 }					
		 }
	 }
	  
	 
 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
// function p =(sum,arr) syn , array[] 
//The function def ProductSmallestPair(sum, arr) accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pai	
		
		ArrayList<Integer> array = new ArrayList<>();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sum numbr");
		int sum = Integer.parseInt(buffer.readLine()); 
		System.out.println("Enter the size of the array ");
		int size = Integer.parseInt(buffer.readLine());
		System.out.println("Enter the array number");
		for(int i=0;i<size;i++) {
		int add = Integer.parseInt(buffer.readLine());	
		array.add(add);	
		}
		//System.out.println(array);
		
	   ProductSmallestPair(sum, array);
		
		//5 2 4 3 9 7 1

		
		 
	}

}
