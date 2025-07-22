package classassignment;

public class Student {
	private int sid;
	private String sname;
	private int mark;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + "]";
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

}
