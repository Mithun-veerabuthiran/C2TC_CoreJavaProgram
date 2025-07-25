package dayfive;

public class Trainer extends Person {
	private String session;
	private String desigmn;
	private String batchno;
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesigmn() {
		return desigmn;
	}
	public void setDesigmn(String desigmn) {
		this.desigmn = desigmn;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public Trainer() {
		super();
	}
	
	public Trainer(int pid, String name, String city,String session, String desigmn, String batchno) {
		super( pid,name,city);
		this.session = session;
		this.desigmn = desigmn;
		this.batchno = batchno;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer id:"+super.getPid()+" ,trainer name="+super.getName()+" ,Trainer city="+super.getCity()+ ", session=" +session + ", desigmn=" + desigmn + ", batchno=" + batchno + "]";
	}
	

}
