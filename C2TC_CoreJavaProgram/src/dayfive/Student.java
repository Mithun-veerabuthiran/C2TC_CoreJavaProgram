package dayfive;

public class Student extends Person{
	private int uid;
	private String courseName;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Student [Student id:"+super.getPid()
		+"Student Name :"+super.getName()
		 +"Student City:"+super.getCity()
		 +"uid=" + uid + ", courseName=" + courseName + "]";
	}
	

}
