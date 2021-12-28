import java.util.ArrayList;

public class Tester {
	PrimarySchoolTuition p1;
	PrimarySchoolTuition p2;
	SecondarySchoolTuition s1;
	SecondarySchoolTuition s2;
	Subject c1;
	Subject c2;
	Subject c3;
	private ArrayList<Tuition> tuList;

	public Tester(){
		
		tuList = new ArrayList<Tuition>();
		c1 = new Subject("History",35.00);
		c2 = new Subject("Biology",35.00);
		c3 = new Subject("Add Maths",35.00);
		p1 = new PrimarySchoolTuition("Seksyen 7","Feb-June","Mr.Nizam",6, "UPSR");
		p2= new PrimarySchoolTuition("Seksyen 7"," Feb-June ","Mr.Irham",6,
				"UPSR");
		s1 = new SecondarySchoolTuition("Seksyen 9","March-Sept","Mrs.Rohizah",3, "PT3");
		s2 = new SecondarySchoolTuition("Seksyen 9","Apr-Nov","Mrs.Arynee",3,
				"SPM");
		tuList.add(p1);
		tuList.add(p2);
		tuList.add(s1);
		tuList.add(s2);
		s1.addSubject(c1);
		s2.addSubject(c2);
		s2.addSubject(c3);
	}

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.displayTuitionDetails();
	}

	public void displayTuitionDetails() {
		for (Tuition t : tuList)
			t.display();
	}
}