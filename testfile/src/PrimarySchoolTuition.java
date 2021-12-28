

public class PrimarySchoolTuition extends Tuition {

	private String pname;
	private int std;
	private String examType;
	private double basicpackage;

	public PrimarySchoolTuition(String l, String d, String n, int s, String e) {
		super(l, d);
		pname = n;
		std = s;
		examType = e;
		basicpackage = 100;
		
	}

	public String getPName() {
		return pname;
	}

	public int getStandard() {
		return std;
	}

	public String getExamType() {
		return examType;
	}

	public void display() {
		super.display();
		System.out.println("Parent's name: " + getPName());
		System.out.println("Standard: " + getStandard());
		System.out.println("Exam type: " + getExamType());

	}

}
