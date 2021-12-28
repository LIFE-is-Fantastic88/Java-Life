import java.util.ArrayList;

public class Airplane {
	private ArrayList<SeatClass> seatclass = new ArrayList<SeatClass>();
	private String time;
	public Airplane() {
		seatclass.add(new SeatClass("Economy",50));
		seatclass.add(new SeatClass("Business",100));
		seatclass.add(new SeatClass("First class",200));
	}
	public Airplane(String time) {
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
