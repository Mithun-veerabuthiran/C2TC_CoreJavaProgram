package day7.abstract_class;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we access the derived class by using the base class
		// we can only create a ref to abstract class
		//Student object
		Coder c1;
		c1 = new Student();
		c1.rules();
		//Trainer object
		Coder c2;
		c2 = new Trainer();
		c2.rules();
		

	}

}
