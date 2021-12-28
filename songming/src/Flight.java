import java.util.ArrayList;

public class Flight {
	private String FlightNum;
	private ArrayList<Plane> plane = new ArrayList<Plane>();
	public Flight(String num) {
		this.FlightNum = num;
		plane.add(new Plane("08:00"));
		plane.add(new Plane("10:00"));
		plane.add(new Plane("12:00"));
		plane.add(new Plane("14:00"));
		plane.add(new Plane("16:00"));
		plane.add(new Plane("18:00"));
		plane.add(new Plane("20:00"));
		plane.add(new Plane("22:00"));
	}
	public Flight() {
		plane.add(new Plane("08:00"));
		plane.add(new Plane("10:00"));
		plane.add(new Plane("12:00"));
		plane.add(new Plane("14:00"));
		plane.add(new Plane("16:00"));
		plane.add(new Plane("18:00"));
		plane.add(new Plane("20:00"));
		plane.add(new Plane("22:00"));
	}
	public ArrayList<Plane> getPlaneList(){
		return plane;
	}
}
