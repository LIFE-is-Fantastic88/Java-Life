import java.util.ArrayList;

public class SystemController {
	ArrayList<String> countrylist = new ArrayList<String>();
	ArrayList<String> seatplace = new ArrayList<String>();
	ArrayList<String> seatclasss = new ArrayList<String>();
	private Search_and_Booking sb = new Search_and_Booking();
	private Record_booking record = new Record_booking();
	View view = new View(this);
	private boolean terminate;

	public void setData(String departure, String arrival, String date, String seatclass, String seatnumber,
			String time) {
		setDeparture(departure);
		setArrival(arrival);
		setDate(date);
		setSeatclass(seatclass);
		setSeatnumber(seatnumber);
		setTime(time);
	}

	public void setDeparture(String departure) {
		record = new Record_booking();
		record.setDeparture(departure);
	}

	public void setArrival(String arrival) {
		record.setArrival(arrival);
		;
	}

	public void setDate(String date) {
		record.setDate(date);
		;
	}

	public void setSeatclass(String seatclass) {
		record.setSeatclass(seatclass);
		;
	}

	public void setSeatnumber(String seatnumber) {
		record.setSeatnumber(seatnumber);
		;
	}

	public void setTime(String time) {
		record.setTime(time);
		;
	}

	public String getDeparture() {
		return record.getDeparture();
	}

	public String getArrival() {
		return record.getArrival();
	}

	public String getDate() {
		return record.getDate();
	}

	public String getSeatclass() {
		return record.getSeatclass();
	}

	public String getSeatnumber() {
		return record.getSeatnumber();
	}

	public String getTime() {
		return record.getTime();
	}

	public boolean availability() {
		return sb.checkavailability(record);
	}

	public void setprogramterminate(boolean terminate) {
		this.terminate = terminate;
	}

	public boolean programterminate() {
		return terminate;
	}

	public void run() {

		view.option_menu();

	}

}
