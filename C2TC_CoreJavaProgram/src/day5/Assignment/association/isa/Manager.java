package day5.Assignment.association.isa;

public class Manager extends Employee {
	private int teamSize;

	// constructors
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super(name, employeeId, department);
		this.teamSize = teamSize;
	}

	// getter/setter methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize +", Name="+super.getName()+", EmployeeId="+super.getEmployeeId()+", Dept="+super.getDepartment()+"]";
	}


}
