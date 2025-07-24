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
      
      
      
     }
     catch(Exception e) {
      System.out.println(e);    	 
     }
	}

}
