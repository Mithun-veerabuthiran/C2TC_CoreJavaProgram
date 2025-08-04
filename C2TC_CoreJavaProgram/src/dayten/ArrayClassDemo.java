package dayten;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int intArr[]= {10, 20, 15, 22, 35, 18 , 14 };
     System.out.println("ArrayIs:"+Arrays.toString(intArr));
   //ArrayIs:[10, 20, 15, 22, 35, 18, 14] 
     Arrays.sort(intArr);
     System.out.println("-----------------After Sorting---------------");
	 System.out.println("Array is : "+Arrays.toString(intArr));
     //Array is : [10, 14, 15, 18, 20, 22, 35]
	 
	 
	 //binary Serach 
	 int intKey = 22;
	// Print the key and corresponding index
	// Array must be sorted in ascending order for the binary search
	System.out.println(intKey+"found at index"+Arrays.binarySearch(intArr, intKey));
	//22found at index5
	System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
 //22 found at index = -4
	
	System.out.println("First Array : " + Arrays.toString(intArr));
   //First Array : [10, 14, 15, 18, 20, 22, 35]
	//Get the second Array
			int intArr1[] = { 10, 15, 22 };
			System.out.println("Second Array : " + Arrays.toString(intArr1));
			//Second Array : [10, 15, 22]
			
			
	if(Arrays.equals(intArr, intArr1))
	      {System.out.println("Both arrays are equal");}
	  else {
		System.out.println("Arrays are not equal");}
	//Arrays are not equal
	
	//creates a new array with a specified length, 
			System.out.println("\nNew Arrays by copyOf:\n");
			int intArr2[]=Arrays.copyOf(intArr1, 10);
			System.out.println("Integer Array: " + Arrays.toString(intArr2));

//			New Arrays by copyOf:
//
//				Integer Array: [10, 15, 22, 0, 0, 0, 0, 0, 0, 0]
			
			
			System.out.println("\nNew Arrays by copyOfRange:");
			// To copy the array into an array of new length
			int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
			System.out.println("Integer Array: " + Arrays.toString(intArr3));
       // In this .copyofRange has the (arrayname , length)
			//or in this can we give the range of 1 to 3 and the 3-1 =2 only printed
			
//			New Arrays by copyOfRange:
//				Integer Array: [14, 15]
	}

}
