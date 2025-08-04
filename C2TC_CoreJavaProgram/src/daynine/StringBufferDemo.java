package daynine;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StringBuffer length vs. capacity.
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println("buffer = " + buffer);
		System.out.println("length = " + buffer.length());
		System.out.println("capacity = " + buffer.capacity());

		// appending and inserting into StringBuffer.
		String s;
		int a = 42;
		buffer = new StringBuffer(40);
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);

		buffer = new StringBuffer("I Java!");
		buffer.insert(2, "like    ");
		System.out.println(buffer);
		
		buffer.delete(7,10);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}

}



/*
 * The statement: ```java System.out.println("capacity = " + buffer.capacity());
 * ``` prints the current capacity of the `StringBuffer` object referred to by
 * `buffer`.
 * 
 * ### How does it work?
 * 
 * - `buffer` is an instance of `StringBuffer`. - The `capacity()` method of
 * `StringBuffer` returns the current capacity (the amount of storage available
 * for new characters before the buffer needs to expand). - The output will look
 * like: ``` capacity = X ``` Where `X` is the current capacity as an integer.
 * 
 * ### How is the capacity determined?
 * 
 * 1. **Default Constructor:** If the `StringBuffer` is created like this:
 * ```java StringBuffer buffer = new StringBuffer(); ``` The default capacity is
 * **16**.
 * 
 * 2. **With Initial String:** If created like this: ```java StringBuffer buffer
 * = new StringBuffer("Hello"); ``` The capacity will be **16 + length of the
 * initial string** (here, "Hello" has 5 characters, so capacity = 16 + 5 = 21).
 * 
 * 3. **With Specific Capacity:** If you specify the capacity: ```java
 * StringBuffer buffer = new StringBuffer(30); ``` The capacity will be **30**.
 * 
 * ### Example outputs
 * 
 * - For `new StringBuffer()`: ``` capacity = 16 ``` - For `new
 * StringBuffer("Hello")`: ``` capacity = 21 ``` - For `new StringBuffer(30)`:
 * ``` capacity = 30 ```
 ** 
 * Summary:** The output depends on how the `StringBuffer` named `buffer` is
 * created. It shows the amount of character space currently allocated for the
 * buffer. If you want the exact output from the file you referenced, let me
 * know if you want to see the code inside `StringBufferDemo.java`!
 */