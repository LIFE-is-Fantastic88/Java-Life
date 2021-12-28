
import java.util.ArrayList;

public class Student {
	private String matricNum;
	private String name;
	private ArrayList<CourseTaken> registeredCourseList;
	
	public Student(String m, String n) {
		matricNum = m;
		name = n;
		registeredCourseList = new ArrayList<CourseTaken>();
	}
	
	public String getMatricNum() {
		return matricNum;
	}
	public boolean addCourse(CourseOffered newCourse) {
		String newCode=newCourse.getCourseCode();
		for(int i=0;i<registeredCourseList.size();i++) {
			CourseTaken currCourse=registeredCourseList.get(i);
			String currCode=currCourse.getCourseCode();
			if(currCode.equals(newCode)) {
				return false;
			}
		}
		CourseTaken regCourse=new CourseTaken(newCode, newCourse.getCourseName());
		registeredCourseList.add(regCourse);
		return true;
	}
	public boolean dropCourse(String code) {
		CourseTaken course=getCourse(code);
		if(course != null) {
			registeredCourseList.remove(course);
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}	
	
	public ArrayList<CourseTaken> getRegisteredCourseList() {
		return registeredCourseList;
	}
	
	public CourseTaken getCourse(String code) {
		for (CourseTaken course : registeredCourseList) {
			if (course.getCourseCode().equals(code))
				return course;
		}
		
		return null;
	}
}
