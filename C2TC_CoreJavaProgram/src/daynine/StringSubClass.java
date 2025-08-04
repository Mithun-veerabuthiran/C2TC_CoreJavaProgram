package daynine;


//public class StringSubClass extends String {
//
//	public static void main(String[] args) {
//		
//
//	}
//}

//
//Reason of above error :
//	This code will not compile in Java. Here’s why, and an explanation:
//
//		### The Code
//
//		```java
//		package com.tnsif.daynine;
//
//		public class StringSubClass extends String {
//
//			public static void main(String[] args) {
//				
//
//			}
//		}
//		```
//
//		### Explanation
//
//		1. **What does it try to do?**
//		   - It tries to create a new class called `StringSubClass` that extends (inherits from) the built-in Java `String` class.
//
//		2. **Why is this a problem?**
//		   - In Java, the `String` class is a special, built-in class that is marked as **final**.
//		   - **final** means you cannot extend or inherit from it. You cannot write `class MyClass extends String`. The Java compiler will give an error: `Cannot inherit from final 'java.lang.String'`.
//
//		3. **What will happen?**
//		   - If you try to compile this code, you will get a compilation error because of the line:
//		     ```java
//		     public class StringSubClass extends String {
//		     ```
//		     This is not allowed.
//
//		4. **What should you do?**
//		   - If you want to use functionality similar to `String`, you can use composition (having a `String` as a field inside your class) rather than inheritance.
//
//		### Summary
//
//		- You cannot extend the Java `String` class.
//		- The code is incorrect and will not work in Java.
//		- To achieve similar behavior, use a field:  
//		  ```java
//		  public class StringSubClass {
//		      private String value;
//		      // your methods
//		  }
//		  ```
//
//		Let me know if you want to see an example of how to use composition with String!