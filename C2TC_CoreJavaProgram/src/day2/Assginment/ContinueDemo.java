package day2.Assginment;

public class ContinueDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for (int k = 5; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue; // in the continue is used to skip the part block of code 
		// Even numbers are printed
		System.out.print(k + " ");
		}

	}

}
