package Day4.thirdpackage;

public class MyClass {
	private static MyClass obj=new MyClass();//we using the Singleton
//in this singleton only create a obj with class only
// we declare obj with private 
// only create a static only that change the obj with single
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	public static MyClass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
}
