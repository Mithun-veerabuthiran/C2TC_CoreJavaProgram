package day1.pra;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
    //Collections Class
	//"Sort Reverse Shuffle — Min Max Frequency — Binary Swap Fill — Unmodifiable"
	//List list = (List) Arrays.asList(3, 1, 4, 2);	
        List<Integer> list = Arrays.asList(3, 1, 4, 2);
  
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		//min(Collection)	Returns smallest element	Collections.min(list);
		//max(Collection)	Returns largest element	Collections.max(list);
		int min = Collections.min(list); // ➝ 1
		int max = Collections.max(list); // ➝ 5
		System.out.println(min+":min and max:"+max);
		
		
		//frequency(Collection, element)=Counts how many times an element appears=Collections.frequency(list, 2);
		// this help to count the number of element in list
		List<Integer> count = Arrays.asList(1, 2, 2, 3, 2);
		int count_number = Collections.frequency(count, 2);
		System.out.println(count_number);//output: ➝ 3
		
		
		//swap(List, i, j)=Swaps elements at two indexes=Collections.swap(list, 0, 2);
		 List<Integer> swap = Arrays.asList(9, 2, 7, 3, 2);
		    Collections.swap(swap,0,2);
		    //list of input
		    //0=start index to swap
		    //2 = end endex to swap 
		    System.out.println(list);
		   // Output:
		   //[7, 2, 9, 3, 2]
		    
		    //shuffle(List)	Randomly shuffles elements	Collections.shuffle(list);
		    //Collections.shuffle(list); // Random order like [2, 3, 1]
		    List<Integer> shuffle = Arrays.asList(9, 2, 7, 3, 2);
		     Collections.shuffle(shuffle);
		     System.out.print(shuffle);
		     //fill
		     //fill(List, value)	Replaces all elements with a value	Collections.fill(list, 9);
		     //Collections.fill(list, 9); // ➝ [9, 9, 9, 9]
		     List<Integer> allsame = Arrays.asList(9, 2, 7, 3, 2);
		     Collections.fill(allsame,9);
		     System.out.print(allsame);
		     //output=[9, 9, 9, 9, 9]
		     
		     //binarySearch(List, key)=Searches for key (requires sorted list)=Collections.binarySearch(list, 3);
		     //binarySearch() — (Only after sorting)
		     // the binarysearch will work what it sort
		     List<Integer> search = Arrays.asList(1, 2, 3, 4);
		     int idx = Collections.binarySearch(search, 3); // ➝ index 2
		     System.out.println(idx);
		     //unmodifiableList(list)
		     //Returns a read-only (immutable) version of the original list — modifications will throw an exception.
		     // Why is it useful?
		     //To protect your list from accidental or intentional modification (especially when passing to other classes or methods).
		    // Common in interview design questions, such as immutable data structures or secure APIs.
		     // Create a modifiable list
		        List<String> originalList = new ArrayList<>();
		        originalList.add("Java");
		        originalList.add("Python");
		        originalList.add("C++");

		        // Make it unmodifiable (read-only)
		        List<String> readOnlyList = Collections.unmodifiableList(originalList);

		        System.out.println("Original List: " + originalList);
		        System.out.println("Read-Only List: " + readOnlyList);

		        // Try modifying readOnlyList
		        try {
		            readOnlyList.add("JavaScript"); // This line will throw exception
		        } catch (UnsupportedOperationException e) {
		            System.out.println("❌ Cannot modify unmodifiable list!");
		        }

		        // Still, original list can be modified
		        originalList.add("Go");
		        System.out.println("Modified Original List: " + originalList);
		        System.out.println("Read-Only List Reflects Change: " + readOnlyList); // reflects because it's backed by original

		        
		        //output:
		        	//Original List: [Java, Python, C++]
		        	//Read-Only List: [Java, Python, C++]
		        	//❌ Cannot modify unmodifiable list!
		        	//Modified Original List: [Java, Python, C++, Go]
		        	//Read-Only List Reflects Change: [Java, Python, C++, Go]
	}
	//https://stackoverflow.com/questions/6991224/changing-color-of-comments-in-eclipse
	//change the color of the comment

}
