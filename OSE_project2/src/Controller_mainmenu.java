
import java.util.ArrayList;

public class Controller_mainmenu {
	private int from, to, day, month, year, Rday, Rmonth, Ryear, seatClass, price;
	private String name, password;
	private FlightDestination flightdes;
	private Airport airport = new Airport();
	private DateCheck date = new DateCheck();
	private Plane airplane = new Plane("8:00");

	public void action(int departure, int arrival, String day, String month, String year, String Rday, String Rmonth,
			String Ryear, int seat, MainMenu_view view, Controller_homepage controller) {
		this.flightdes = controller.getFlightDestination();
		this.setName(controller.getName());
		this.setPassword(controller.getPassword());
		this.setFrom(departure);
		this.setTo(arrival);
		if (!validNum(day, month, year)
				|| !date.checkDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))
				|| !validNum(Rday, Rmonth, Ryear)
				|| !date.checkReturn(Integer.parseInt(Rday), Integer.parseInt(Rmonth), Integer.parseInt(Ryear))
				|| departure == -1 || arrival == -1 || seat == -1 ||departure==arrival) {
			new ErrorChecking();
			return;
		}
		this.setDay(Integer.parseInt(day));
		this.setMonth(Integer.parseInt(month));
		this.setYear(Integer.parseInt(year));
		this.setRday(Integer.parseInt(Rday));
		this.setRmonth(Integer.parseInt(Rmonth));
		this.setRyear(Integer.parseInt(Ryear));

		this.setSeatClass(seat);

		view.dispose();
		setPrice();
		new Flight_view(this);
	}

	public boolean validNum(String day, String month, String year) {
		try {
			Integer.parseInt(day);
			Integer.parseInt(month);
			Integer.parseInt(year);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean validPassenger(String adult, String child, String infant) {
		int a = 0, c = 0, i = 0;
		try {
			a = Integer.parseInt(adult);
			c = Integer.parseInt(child);
			i = Integer.parseInt(infant);
		} catch (Exception e) {
		}
		if ((a + c + i) <= 0)
			return false;
		return true;
	}

	public ArrayList<SeatClass> getSeatClassList() {
		return airplane.getSeatClassList();
	}

	public ArrayList<String> getCountryList() {
		return airport.getCountryList();
	}

	public String getFrom() {
		return airport.getCountryList().get(from);
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public String getTo() {
		return airport.getCountryList().get(to);
	}

	public void setTo(int to) {
		this.to = to;
	}

	public String getDate() {
		return day + "/" + month + "/" + year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getRDate() {
		return Rday + "/" + Rmonth + "/" + Ryear;
	}

	public void setRday(int rday) {
		Rday = rday;
	}

	public void setRyear(int ryear) {
		Ryear = ryear;
	}

	public void setRmonth(int rmonth) {
		Rmonth = rmonth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSeatClass(int seat) {
		this.seatClass = seat;
	}

	public int getSeatClass() {
		return seatClass;
	}

	public void setPrice() {
		price = 100 * 1 + airplane.getSeatClassList().get(seatClass).getPrice();
	}

	public int getPrice() {
		return price;
	}

	public FlightDestination getflightdes() {
		return this.flightdes;
	}
}
