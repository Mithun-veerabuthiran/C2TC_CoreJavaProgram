package DayEight.interfaces.functionalinterfaces;

public class FunctionalInterfaceData {
  public static void main(String[] args) {
	  GreetClass u = new GreetClass();
	  System.out.println(u.greet());
	  GreetInterface g1 = () ->{
		  return "fail again";
		  
	  };
	  System.out.println(g1.greet());
	  
}
}
