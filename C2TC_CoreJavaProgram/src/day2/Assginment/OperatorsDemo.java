package day2.Assginment;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		 int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;// 11
		int c = ++a + b + a--;//43
		//a=>10
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;//73
		//b=>19,c=>44
System.out.println("d value after the operations: " + d);//73

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
				
		//Ternary operator demonstration
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);

	}

}
