package day7.Polymorphism_override;
//which method sign in java allows you to override a superclass
//method overloading 
//method overriding 
// constructor overring and overloading 
//overriding  when have inherit class 
 class college{
	protected college getobject() {
		return new college();
	}
	
}
 class Student extends college{
	 @Override
	 public Student getobject() {
		 return new Student();
	 }
 }
 
 



public class StudentDemo {
	
public static void main(String[] args) {
	
}
}
