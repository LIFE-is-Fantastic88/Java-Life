
import java.util.Scanner;
import java.util.ArrayList;

public class Screen {
	SystemController sys = new SystemController();
	Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		Screen screen = new Screen(); // create object of Screen
		screen.display();
	}
	
	public void display() {		
		String id = "default";
		
		while (!id.equals("x")) {
			System.out.println("\nWelcome!");
			System.out.println("Enter your employee/matric number (x to exit): ");
			id = sc.next();
			
			if (!id.equals("x")) {
				Student student = sys.getStudent(id);
				
				if (student != null) { // id is of a Student
					String opt = "default";
					
					while (!opt.equals("0")) {
						System.out.println("\nEnter your selection "+student.getName()+":");
						System.out.println("1: Add course");
						System.out.println("2: Drop course");
						System.out.println("3: View results");
						System.out.println("0: Logout");
						opt = sc.next();

						if (opt.equals("1")) {
							addCourse(student);
						}
						
						else if (opt.equals("2")) {
							dropCourse(student);
						}
						
						else if (opt.equals("3")) {
							System.out.println("\nThis feature is under construction");
						}
						
						else if (!opt.equals("0")) {
							System.out.println("\nError, wrong input");
						}
					}					
				}
				
				else {
					Lecturer lecturer = sys.getLecturer(id);
					
					if (lecturer != null) { // id is of a Lecturer
						String opt = "default";
						
						while (!opt.equals("0")) {
							System.out.println("\nEnter your selection "+lecturer.getName()+":");
							System.out.println("1: Add student's assignment marks");
							System.out.println("2: Add student's exam marks");
							System.out.println("0: Logout");
							opt = sc.next();

							if (opt.equals("1"))
								System.out.println("\nThis feature is under construction");
							
							else if (opt.equals("2"))
								System.out.println("\nThis feature is under construction");
							
							else if (!opt.equals("0")) {
								System.out.println("\nError, wrong input");
							}
						}
					}
					
					else
						System.out.println("\nSorry, employee/matric number not found");
				}
			}
		} // end of while
		
		System.out.println("\nThank you, and see you again");
		
	} // end of display()
	
	
	public void addCourse(Student student) {
		System.out.println("\nCourses:");
		
		ArrayList<CourseOffered> courseList = sys.getCourseOfferedList();
		
		// display list of courses offered by faculty
		for (int i=0; i<courseList.size(); i++) {
			CourseOffered course = courseList.get(i);								
			System.out.println((i+1)+". "+course.getCourseCode()+" "+course.getCourseName());
		}
									
		System.out.println("\nEnter course code to add:");
		String code = sc.next();
		
		// ask system to get the course with the same code entered by the student
		CourseOffered course = sys.getCourseOffered(code);
		
		if (course == null)
			System.out.println("\nError, invalid course code");
		
		else { // ask system to add the course to the student's list of registered courses
			if (sys.addCourse(student, course)) { // if true, it means new course is successfully added 
				System.out.println("\nCourse is successfully added");
			}
			
			else { // if false, it means new course has been regsitered before 
				System.out.println("\nError, course has been registered before");
			}
		}
	}
	
	public void dropCourse(Student student) {
		ArrayList<CourseTaken> courseList = student.getRegisteredCourseList();
		
		if (courseList.size() == 0)
			System.out.println("\nYou have not registered for any course");
		
		else {
			System.out.println("\nYour registered course(s):");
			
			// display list of registered courses
			for (int i=0; i<courseList.size(); i++) {
				CourseTaken course = courseList.get(i);								
				System.out.println((i+1)+". "+course.getCourseCode()+" "+course.getCourseName());
			}
			
			System.out.println("\nEnter course code to drop:");
			String code = sc.next();
			
			// ask system to drop the course from student's registered courses
			if (sys.dropCourse(student, code)) { // if true, it means course is successfully dropped 
				System.out.println("\nCourse is successfully dropped");
			}
			
			else { // if false, it means course code is invalid or has not been registered before
				System.out.println("\nError, course has NOT been registered before");
			} 
		}
	}
}
