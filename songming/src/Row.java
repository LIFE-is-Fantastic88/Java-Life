import java.util.ArrayList;

public class Row {
	private ArrayList<Seat> seatrow = new ArrayList<Seat>();
	private String rowName;
	public Row(String rowName) {
		this.rowName = rowName;
		seatrow.add(new Seat(1));
		seatrow.add(new Seat(2));
		seatrow.add(new Seat(3));
	}
	public String getRowNumber() {
		return rowName;
	}
	public ArrayList<Seat> getSeat(){
		return seatrow;
	}
}
