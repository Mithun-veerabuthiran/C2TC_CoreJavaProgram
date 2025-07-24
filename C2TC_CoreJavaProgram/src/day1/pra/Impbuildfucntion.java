package day1.pra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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
      //Enter at least 10 characters: HelloWorld
      //Characters read: HelloWorld
      //If you enter more than 10 characters (e.g., HelloWorld123), 
      //only the first 10 characters (HelloWorld)
      //are read and shown.
      char buffer[]= new char[10];
      System.out.println("Enter the 10 character");
      reader.read(buffer,0,10);
      System.out.print("Characters read: ");
      System.out.println(buffer);
      reader.close();
      //readLine()
      System.out.print("Enter a line: ");
      String line = reader.readLine(); // reads the whole line
      System.out.println("You entered: " + line);
      reader.close();
     //ready()
      //In simple terms:
      //👉 It checks if the user has already typed something into the console before calling readLine()
      System.out.println("Type something and press Enter:");
      if (reader.ready()) {
          System.out.println("Reader is ready to read!");
      } else {
          System.out.println("Reader not ready.");
      }
      String input = reader.readLine();
      System.out.println("You entered: " + input);
      reader.close();
      //ready() usually returns false until Enter is pressed, because user input is line-buffered.
      //skip(long n)
      //Skips n characters from the input.
      System.out.print("Enter something (at least 10 characters): ");
      reader.skip(5); // skips first 5 characters
      String result = reader.readLine(); // reads the rest
      System.out.println("After skipping first 5 characters: " + result);
      reader.close();
      System.out.println("Type something and press Enter:");

      if (reader.markSupported()) { // Can we place a bookmark?
          reader.mark(100); // Bookmark the start (up to 100 chars ahead allowed)

          if (reader.ready()) { // Is user input available?
              System.out.println("Input is ready, let's read it!");
          }

          String firstRead = reader.readLine();
          System.out.println("You typed: " + firstRead);

          reader.reset(); // Go back to the bookmark (you can reread the same input)
          String secondRead = reader.readLine();
          System.out.println("Read again after reset: " + secondRead);
      } else {
          System.out.println("This reader does not support marking!");
      }

      reader.close();
      
     //Checks if the stream supports mark/reset.
      System.out.println("Does reader support mark()? " + reader.markSupported());
      reader.close();
      //StringBuilder
      StringBuilder sb = new StringBuilder("Hello");
      sb.append(" Java");
      sb.reverse();
      System.out.println(sb); 
      // output➝ avaJ olleH
      //Math Class
      System.out.println(Math.max(10, 20));     // ➝ 20
      System.out.println(Math.pow(2, 3));       // ➝ 8.0
      System.out.println(Math.sqrt(16));        // ➝ 4.0
      System.out.println(Math.abs(-10));        // ➝ 10
      //Arrays Class
      //Arrays.sort() =Sorts the array in ascending order
      int[] arr = {5, 2, 3};
      Arrays.sort(arr);  // [2, 3, 5]
      //Arrays.toString()	Converts array to readable string
      System.out.println(Arrays.toString(arr)); // ➝ [2, 3, 5]
      //Arrays.equals()	Compares two arrays (element by element)
      int[] a = {1, 2, 3};
      int[] b = {1, 2, 3};
      System.out.println(Arrays.equals(a, b)); // ➝ true
      //Arrays.copyOf()	Copies full or part of an array	int[] newArr = Arrays.copyOf(arr, 3);
      int[] original = {1, 2, 3, 4};
      int[] copy = Arrays.copyOf(original, 2); // ➝ [1, 2]
      //Arrays.copyOfRange()=Copies range from array=Arrays.copyOfRange(arr, 1, 4)
      int[] arre = {10, 20, 30, 40, 50};
      int[] subArr = Arrays.copyOfRange(arre, 1, 4); // ➝ [20, 30, 40]
      //Arrays.fill()=Fills all elements with a given value=Arrays.fill(arr, 0);
      int[] arred = new int[5];
      Arrays.fill(arred, 7); // ➝ [7, 7, 7, 7, 7]
      //Arrays.binarySearch()=Searches for an element (must be sorted)=Arrays.binarySearch(arr, 4)
      int[] ar = {1, 3, 5, 7};
      int index = Arrays.binarySearch(ar, 5); // ➝ 2
      //So Cool Elephants Fly Between Trees
      //S = sort()

    		 // C = copyOf(), copyOfRange()

    		 // E = equals()

    		//  F = fill()

    		//  B = binarySearch()

    		 // T = toString()
      
     }
     catch(Exception e) {
      System.out.println(e);    	 
     }
	}

}
