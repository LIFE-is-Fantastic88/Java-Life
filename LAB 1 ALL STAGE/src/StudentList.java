import java.util.ArrayList;

public class StudentList {
  private ArrayList<Student> stdList;
  public StudentList() {
	  stdList=new ArrayList<Student>();
  }
	public ArrayList<Student> getStudentList() {
		return stdList;
	}

	public boolean addStudent(Student m) {
		boolean flag;
		for(int z=0;z<stdList.size();z++) {
			if(stdList.get(z).getMatrix().equals(m.getMatrix())) {
				return false;
			}
		}
		stdList.add(m);
		return true;
	}
	public int calculateAstudents(ArrayList<Student> list) {
		int sum=0;
		for(int z=0;z<list.size();z++) {
			if(list.get(z).getGrade().equals("A")) {
				sum++;
			}
		}return sum;
		
	}
	public int calculateFstudents(ArrayList<Student> list) {
		int amt=0;
		for(int z=0;z<list.size();z++) {
			if(list.get(z).getGrade().equals("F")) {
				amt++;
			}
		}return amt;
	}

}
