package day1.pra;


import java.util.Arrays;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
	     int array[] = new int[10];
	     System.out.println(array.length);
	     for(int i=0;i<=9;i++){
	       array[i]=si.nextInt();
	     }
	     Arrays.sort(array);;
	    System.out.println(Arrays.toString(array));
         System.out.println(array[array.length-2]);
	    }

	}


