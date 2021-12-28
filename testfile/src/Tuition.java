
public class Tuition {

	private String location;
	private String duration;
	
	public Tuition (String l, String d) {
		location = l;
		duration = d;
	}
	
	public String getLocation() {
		return location;
	}
	 public String getDuration() {
		 return duration;
	 }
	 
	 public void display() {
		 System.out.println("Location: " + getLocation());
		 System.out.println("Duration: " + getLocation());
		 
	 }
	
}
