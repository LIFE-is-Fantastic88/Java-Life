
import java.util.ArrayList;

public class CourseTaken {
	private String courseCode;
	private String courseName;
	private String courseGrade;
	private ArrayList<AssessmentItem> examList;
	private ArrayList<AssessmentItem> assignmentList;
	
	public CourseTaken(String c, String n) {
		courseCode = c;
		courseName = n;
		courseGrade = "";
		examList = new ArrayList<AssessmentItem>();
		assignmentList = new ArrayList<AssessmentItem>();
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}
}
