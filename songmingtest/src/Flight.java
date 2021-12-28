import java.util.ArrayList;

public class Flight {
	private String FlightNum;
	private ArrayList<Airplane> plane = new ArrayList<Airplane>();
	public Flight(String num) {
		this.FlightNum = num;
		plane.add(new Airplane("08:00"));
		plane.add(new Airplane("10:00"));
		plane.add(new Airplane("12:00"));
		plane.add(new Airplane("14:00"));
		plane.add(new Airplane("16:00"));
		plane.add(new Airplane("18:00"));
		plane.add(new Airplane("20:00"));
		plane.add(new Airplane("22:00"));
	}
	public Flight() {
		plane.add(new Airplane("08:00"));
		plane.add(new Airplane("10:00"));
		plane.add(new Airplane("12:00"));
		plane.add(new Airplane("14:00"));
		plane.add(new Airplane("16:00"));
		plane.add(new Airplane("18:00"));
		plane.add(new Airplane("20:00"));
		plane.add(new Airplane("22:00"));
	}
	public ArrayList<Airplane> getPlaneList(){
		return plane;
	}
}
