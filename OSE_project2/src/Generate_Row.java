import java.util.ArrayList;

public class Generate_Row {
	private ArrayList<Seat> seatrow = new ArrayList<Seat>();
	private String rowName;

	public Generate_Row(String rowNumber) {
		this.rowName = rowNumber;
		seatrow.add(new Seat(1));
		seatrow.add(new Seat(2));
		seatrow.add(new Seat(3));
	}

	public ArrayList<Seat> getSeat() {
		return seatrow;
	}

	public String getRowNumber() {
		return rowName;
	}
}
