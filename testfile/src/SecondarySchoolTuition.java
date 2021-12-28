import java.util.ArrayList;

import javax.security.auth.Subject;

public class SecondarySchoolTuition extends Tuition {
private int form;
private String pname;
private int std;
private String examType;
private double basicpackage;
private ArrayList<Subject>subjectList;

public SecondarySchoolTuition (String l, String d, String n, int f, String e) {
	super (l,d);
	pname = n;
	form = f;
	examType = e;
	subjectList = new ArrayList<Subject>();
}

public String getPName() {
	return pname;
}

public int getForm() {
	return form;
}

public String getExamType() {
	return examType;
}



public boolean addSubject(Subject c1) {
 boolean flag;
 for(int z=0;z<subjectList.size();z++) {
	 if (subjectList.get(z).getSubject().equal(c1.getSubject())) {
		 return false;
	 }
 }subjectList.add(c1);
 return true;
}


public void display() {
	for(int i=0; i<subjectList.size(); i++) {
	System.out.println();
	}
}



}
