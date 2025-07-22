package classassignment;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter the id of the student");
		int sid= si.nextInt();
	
		System.out.println("Enter the name of the Student");
		String sname = si.next();
		System.out.println("Enter the mark of the student");
		int mark= si.nextInt();
		s.setSid(sid);
		s.setSname(sname);
		s.setMark(mark);
		System.out.println(s);
		

	}

}
