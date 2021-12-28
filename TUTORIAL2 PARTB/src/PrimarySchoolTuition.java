
class PrimarySchoolTuition extends Tuition {
  
 private String pname;
   private int standard;
   private String examType;
   private double basicpackage;
  
   public PrimarySchoolTuition(String l,String d, String n,int s,String e ) {
	super(l,d);
	pname=n;
	standard=s;
	examType=e;
	basicpackage=100;
   }
   public String getPName() {
	   return pname;
   }
   public int getStandard() {
	   return standard;
   }
   public String getExamType() {
	   return examType;
   }
   public void display() {
   	

	   System.out.println("Primary School Tuition");
	   System.out.println("==========================");
	   System.out.println("Parent Name: "+pname);
	   System.out.println("Children in Standard: "+standard);
	   System.out.println("Exam Type: "+examType);
	   System.out.println("Basic Package(Fees): RM"+(int)basicpackage);
	  super.display();
	   System.out.println();
   }
}
