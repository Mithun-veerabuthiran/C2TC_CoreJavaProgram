package day7.Polymorphism_override;

public class Executor {
	public static void main(String[] args) {
		PLTraining u = new PLTraining();
		u.session("Full stack developer");
		
		u = new JFS();
		u.session("Method overiding");
		
		u = new Python();
		u.session("Method overriding");
	}

}
