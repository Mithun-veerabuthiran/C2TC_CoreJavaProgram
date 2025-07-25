package day1.pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//16 
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
        int s = Integer.parseInt(buffer.readLine());
        int sumEven=0;
        int sumodd=0;
       for(int i=1;i<=s;i++) {
    	   if(i%2==0) {
    		   sumEven=sumEven+i;
    		   //System.out.println(sumEven);
    	   }
    	   else if(i%2==1) {
    		   sumodd=sumodd+i;
    		   //System.out.println(sumodd);
    	   }
    	   
    	  
       }
       System.out.println(Math.abs(sumEven-sumodd));
	}
// 1234 
// 4-6=2
}
