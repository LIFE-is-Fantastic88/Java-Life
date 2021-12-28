import java.util.ArrayList;
public class SecondarySchoolTuition extends Tuition {
    private String pname;
    private int form;
    private String examType;
    private double basicpackage;
    private ArrayList<Subject>subjectList;
    public SecondarySchoolTuition(String l,String d,String n,int f,String e) {
    	super(l,d);
    	pname=n;
    	form=f;
    	examType=e;
    	basicpackage=100;
    	subjectList=new ArrayList<Subject>();
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
    public boolean addSubject(Subject s) {
    	boolean flag=true;
    	for(int i=0;i<subjectList.size();i++) {
    		if(subjectList.get(i).getSubject().equals(s.getSubject())) {
    			return false;}
    	}
    	subjectList.add(s);
    	return true;
    	
    }
    public void display() {
    	
 	   System.out.println("Secondary School Tuition");
 	   System.out.println("==========================");
 	   System.out.println("Parent Name: "+pname);
 	   System.out.println("Children in Standard: "+form);
 	   System.out.println("Exam Type: "+examType);
 	   System.out.println("Basic Package(Fees): RM"+(int)basicpackage);
 	   super.display();
   	System.out.println();

 	   
 	   for(int z=0;z<subjectList.size();z++) {
 		   basicpackage+=(int)subjectList.get(z).getPrice();
 				   System.out.println("Subject name: "+subjectList.get(z).getSubject());
 		   System.out.println("Price: RM"+(basicpackage-100));
 		   
 	   }System.out.println("Total Fees: RM"+(int)basicpackage);
    }
    
}
