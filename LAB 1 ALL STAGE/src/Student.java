
public class Student {
private String firstName;
private String lastName;
private String matrix;
private String phoneNo;
private double individualAssignment;
private double groupProject;
private double finalExam;
private double continuosAssessment;
private double finalExam40percent;
private double allMarks;
private String grade;
   public Student(String a,String b,String c, String d,double e,double f,double g){
	   this.firstName=a;
	   this.lastName=b;
	   this.matrix=c;
	   this.phoneNo=d;
	   this.individualAssignment=e;
	   this.groupProject=f;
	   this.finalExam=g;
   }
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getMatrix() {
	return matrix;
}

public String getPhoneNo() {
	return phoneNo;
}

public double getIndividualAssignmt() {
	return individualAssignment;
}

public double getFinalExam() {
	return finalExam;
}

public double getGroupProject() {
	return groupProject;
}
public void calculateContinuousAssessment() {
    continuosAssessment=(individualAssignment+groupProject)/200*60;
    
}
public double  getContinuousAssessment() {
	return continuosAssessment;
}
public void calculateFinalExam() {
	finalExam40percent=(finalExam/100)*40;
}
public double getFinalExam40percent() {
	return finalExam40percent;
}
public void calculateAllMarks() {
 allMarks=continuosAssessment+finalExam40percent;
}
public double getAllMarks() {
	
	return allMarks;
}
public void calculateGrade() {
  if(allMarks>=85) {
	  grade="A";
  }else if(allMarks>=75) {
	  grade="B";
  }else if(allMarks>=60) {
	  grade="C";
  }else if(allMarks>=39) {
	  grade="D";
  }else if(allMarks<39) {
	  grade="F";
  }
}
public String getGrade() {
	return grade;
}


}
