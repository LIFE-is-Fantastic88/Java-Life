import java.util.ArrayList;

public class Plane {
	private ArrayList<SeatClass> seatclass = new ArrayList<SeatClass>();
	private String time;
	public Plane() {
		seatclass.add(new SeatClass("Economy",50));
		seatclass.add(new SeatClass("Business",100));
		seatclass.add(new SeatClass("First class",200));
	}
	public Plane(String time) {
		seatclass.add(new SeatClass("Economy",50));
		seatclass.add(new SeatClass("Business",100));
		seatclass.add(new SeatClass("First class",200));
		this.time = time;
	}
	public ArrayList<SeatClass> getSeatClassList(){
		return seatclass;
	}
	public String getTime() {
		return time;
	}
}
