
import java.util.ArrayList;

public class SystemController {
	private ArrayList<Student> studentList;
	private ArrayList<Lecturer> lecturerList;
	private ArrayList<CourseOffered> courseList;
	
	public SystemController() {
		studentList = new ArrayList<Student>();		
		Student student1 = new Student("A11111", "Harris");
		Student student2 = new Student("A11222", "Aishah");		
		studentList.add(student1);
		studentList.add(student2);
		
		lecturerList = new ArrayList<Lecturer>();		
		Lecturer lecturer1 = new Lecturer("K011111", "Tim");
		Lecturer lecturer2 = new Lecturer("K011222", "Jane");
		lecturerList.add(lecturer1);
		lecturerList.add(lecturer2);
		
		courseList = new ArrayList<CourseOffered>();		
		CourseOffered course1 = new CourseOffered("TTTK2023", "Kejuruteraan Perisian Berorientasikan Objek", lecturer1);
		CourseOffered course2 = new CourseOffered("TTTK2093", "Interaksi Manusia Komputer", lecturer1);
		CourseOffered course3 = new CourseOffered("TTTK2323", "Pengaturcaraan Mudahalih", lecturer2);
		CourseOffered course4 = new CourseOffered("TTTU2983", "Pangkalan Data Lanjutan", lecturer2);
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
	}
	
	// get the student with a particular matric number
	public Student getStudent(String matricNum) {
		for (Student student : studentList) {
			if (student.getMatricNum().equals(matricNum))
				return student;
		}
		
		return null;
	}
	
	// get the lecture with a particular employee number
	public Lecturer getLecturer(String employeeNum) {
		for (Lecturer lecturer : lecturerList) {
			if (lecturer.getEmployeeNum().equals(employeeNum))
				return lecturer;
		}
		
		return null;
	}
	
	public ArrayList<CourseOffered> getCourseOfferedList() {
		return courseList;
	}
	
	// get the course offered with a particular course code
	public CourseOffered getCourseOffered(String courseCode) {
		for (CourseOffered course : courseList) {
			if (course.getCourseCode().equals(courseCode))
				return course;
		}
		
		return null;
	}
	
	// register a course to a student, 
	// and add the student to the list of students taking the course 
	public boolean addCourse(Student student, CourseOffered course) {
		// try adding the course to the student
		// status is true if the course has not been registered before
		// status is false if the course has been registered before
		boolean status = student.addCourse(course);
		
		// if status is true, add the student to the list of students taking the course 
		if (status)
			course.addStudent(student);
			
		return status;
	}
	
	public boolean dropCourse(Student student, String code) {
		boolean status = student.dropCourse(code);
		
		// if status is true, remove the student from the list of students taking the course 
		if (status) {
			CourseOffered course = getCourseOffered(code);
			course.removeStudent(student);
		}
			
		return status;
	}
}
