
class Tuition {
 private String Location;
 private String duration;
   public Tuition(String l,String d) {
	 
	   Location=l;
	   duration=d;
   }
   public String getLocation() {
	   return Location;
   }
   public String getDuration() {
	   return duration;
   }
   public void display() {
	   System.out.println("Location :"+getLocation());
 	   System.out.println("Duration :"+getDuration());
	   System.out.println();
	   
   }
}
