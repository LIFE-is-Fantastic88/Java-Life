import java.util.ArrayList;

public class CourseOffered {
	private String courseCode;
	private String courseName;
	private Lecturer lecturer;
	private ArrayList<Student> studentList;
	
	public CourseOffered(String c, String n, Lecturer l) {
		courseCode = c;
		courseName = n;
		lecturer = l;
		studentList = new ArrayList<Student>();
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}	
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void removeStudent(Student student) {
		studentList.remove(student);
	}
}
