
public class Seat {
	private int seatNum;
	private boolean availability;

	public Seat(int num) {
		seatNum = num;
	}
	public String getSeatNum() {
		return String.valueOf(seatNum);
	}
	public boolean getAvailability() {
		return availability;
	}
	public void setAvailability(boolean flag) {
		availability = flag;
	}
}
