package daynine;
class Sample {

}

class Demo {
	public Demo() {
		// resource allocate
		System.out.println("In Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// resource cleanup code
		System.out.println("In Finalize");
	}

}

public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1=d;
		//Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		d = null;
		System.gc();
		System.out.println(d1);
		
	

	}
}

/*
 * program about Great! You're learning about the **Object class** and **garbage
 * collection** in Java — awesome job! Let’s **break this program down** in a
 * very beginner-friendly way so you understand **each part clearly**.
 * 
 * ---
 * 
 * ## 🔹 What is this program about?
 * 
 * This Java program demonstrates:
 * 
 * 1. The **Object class** methods (like `hashCode()`, `getClass()`). 2. What
 * happens when you make an object `null` and call `System.gc()` (Garbage
 * Collector). 3. How the **`finalize()`** method works (used for cleanup).
 * 
 * ---
 * 
 * ## 📦 Package Line
 * 
 * ```java package com.tnsif.daynine; ```
 * 
 * This tells Java: “This class belongs to a package (folder) named
 * `com.tnsif.daynine`.” You can ignore this part for now if you’re just
 * learning.
 * 
 * ---
 * 
 * ## 🔸 Class 1: `Sample`
 * 
 * ```java class Sample {
 * 
 * } ```
 * 
 * This is just an **empty class**. You're going to create objects of it later
 * to test `Object` class methods.
 * 
 * ---
 * 
 * ## 🔸 Class 2: `Demo`
 * 
 * ```java class Demo { public Demo() { System.out.println("In Constructor"); }
 * 
 * @Override protected void finalize() throws Throwable {
 * System.out.println("In Finalize"); } } ```
 * 
 * ### What’s happening here?
 * 
 * 1. ✅ `public Demo()` is a **constructor** — runs when a new object is
 * created.
 * 
 * It prints "In Constructor".
 * 
 * 2. ✅ `finalize()` is a method called by the **garbage collector** just before
 * an object is destroyed.
 * 
 * It prints "In Finalize".
 * 
 * ---
 * 
 * ## 🧪 Main Class: `ObjectClassDemo`
 * 
 * Let’s go through it step by step:
 * 
 * ```java Sample s = new Sample(); Sample s1 = new Sample(); ```
 * 
 * You created two different `Sample` objects.
 * 
 * ```java System.out.println(s.getClass().getName()); ```
 * 
 * 🧠 This prints the class name of object `s`:
 * 
 * > `com.tnsif.daynine.Sample`
 * 
 * ```java System.out.println(s.hashCode()); System.out.println(s1.hashCode());
 * ```
 * 
 * 🧠 This prints the **hash codes** (unique IDs) of each object. Each object
 * has a different memory address, so the hash codes will differ.
 * 
 * ```java Demo d = new Demo(); ```
 * 
 * 🧠 Creates an object of `Demo`, so it calls the constructor and prints:
 * 
 * > `In Constructor`
 * 
 * ```java System.out.println(d.hashCode()); ```
 * 
 * 🧠 Prints the hash code of the `Demo` object `d`.
 * 
 * ```java Demo d1 = d; ```
 * 
 * 🧠 Now both `d` and `d1` point to the **same object**.
 * 
 * ```java System.out.println(d1.hashCode()); ```
 * 
 * 🧠 Same hash code as `d`, since both refer to the same object.
 * 
 * ```java d = null; ```
 * 
 * 🧠 Now `d` doesn't refer to the object anymore, but `d1` still does.
 * 
 * ```java System.gc(); ```
 * 
 * 🧠 This **asks the Garbage Collector to clean unused memory**.
 * 
 * But since `d1` still points to the object, **object is not deleted**. So
 * `finalize()` will **not run**.
 * 
 * ```java System.out.println(d1); ```
 * 
 * 🧠 Prints something like:
 * 
 * > `com.tnsif.daynine.Demo@6d06d69c`
 * 
 * That means:
 * 
 * It’s an object of `Demo` `@6d06d69c` is its hash code in hexadecimal.
 * 
 * ---
 * 
 * ## ✅ OUTPUT (Example)
 * 
 * ```java com.tnsif.daynine.Sample 366712642 1829164700 In Constructor
 * 2018699554 2018699554 com.tnsif.daynine.Demo@7852e922 ```
 * 
 * (`In Finalize` may **not appear** because the object was not garbage
 * collected.)
 * 
 * ---
 * 
 * ## 🔁 Summary
 * 
 * | Code | Meaning | | ---------------------- |
 * ------------------------------------------------- | | `getClass().getName()`
 * | Returns the class name of the object | | `hashCode()` | Returns unique
 * number based on object memory | | `finalize()` | Runs before object is
 * destroyed (rarely used now) | | `System.gc()` | Requests Garbage Collection
 * (may or may not run) | | `d = null;` | Removes reference to the object from
 * `d` | | `Demo d1 = d;` | Both `d` and `d1` point to the same object |
 * 
 * ---
 * 
 * Would you like a **diagram** or **object memory flow** to understand it
 * visually?
 */