import java.util.ArrayList;

public class Row {
	private ArrayList<Seat> seat = new ArrayList<Seat>();
	private String rowName;
	public Row(String rowName) {
		this.rowName = rowName;
		seat.add(new Seat(1));
		seat.add(new Seat(2));
		seat.add(new Seat(3));
	}
	public String getRowName() {
		return rowName;
	}
	public ArrayList<Seat> getSeat(){
		return seat;
	}
}
