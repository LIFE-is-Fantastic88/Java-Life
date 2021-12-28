import java.util.ArrayList;

import javax.swing.JFrame;

public class Controller_mainmenu {
	private int from, to, day, month, year, Rday, Rmonth, Ryear, adult, child, infant, seatClass;
	private int price;
	private ArrayList<String> country = new ArrayList<String>();
	private Date date = new Date();
	public void run() {
		new MainMenu_view();

	}

	public void action(int from, int to, String day, String month, String year, String Rday, String Rmonth,
			String Ryear, String adult, String child, String infant, int seat, MainMenu_view view) {
		country.add("Johor Bahru");
		country.add("Kota Kinabalu");
		country.add("Kuala Lumpur");
		country.add("Kuching");
		country.add("Miri");
		country.add("Penang");
		country.add("Ipoh");
		country.add("Bintulu");
		this.setFrom(from);
		this.setTo(to);
		if (!validNum(day, month, year)
				|| !date.checkDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))
				|| !validNum(Rday, Rmonth, Ryear)
				|| !date.checkReturn(Integer.parseInt(Rday), Integer.parseInt(Rmonth), Integer.parseInt(Ryear))
				|| !validPassenger(adult, child, infant) || from == -1 || to == -1 || seat == -1) {
			new error();
			return;
		}
		this.setDay(Integer.parseInt(day));
		this.setMonth(Integer.parseInt(month));
		this.setYear(Integer.parseInt(year));
		this.setRday(Integer.parseInt(Rday));
		this.setRmonth(Integer.parseInt(Rmonth));
		this.setRyear(Integer.parseInt(Ryear));
		this.setAdult(Integer.parseInt(adult));
		this.setSeatClass(seat);
		try {
			this.setChild(Integer.parseInt(child));
		} catch (Exception e) {
			this.setChild(0);
		}
		try {
			this.setInfant(Integer.parseInt(infant));
		} catch (Exception e) {
			this.setInfant(0);
		}
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

	public void setFrom(int from) {
		this.from = from;
	}

	public void setTo(int to) {
		this.to = to;
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

	public void setRday(int rday) {
		Rday = rday;
	}

	public void setRyear(int ryear) {
		Ryear = ryear;
	}

	public void setRmonth(int rmonth) {
		Rmonth = rmonth;
	}

	public void setAdult(int adult) {
		this.adult = adult;
	}

	public void setChild(int child) {
		this.child = child;
	}

	public void setInfant(int infant) {
		this.infant = infant;
	}

	public void setSeatClass(int seat) {
		this.seatClass = seat;
	}

	public int getSeatClass() {
		return seatClass;
	}

	public int getInfant() {
		return infant;
	}

	public int getChild() {
		return child;
	}

	public int getAdult() {
		return adult;
	}

	public String getRDate() {
		return Rday + "/" + Rmonth + "/" + Ryear;
	}

	public String getDate() {
		return day + "/" + month + "/" + year;
	}

	public String getFrom() {
		return country.get(from);
	}

	public String getTo() {
		return country.get(to);
	}

	public void setPrice() {
		int seatclass_price = 0;
		if (getSeatClass() == 1) {
			seatclass_price = 0;
		} else if (getSeatClass() == 2) {
			seatclass_price = 100;
		} else if (getSeatClass() == 3) {
			seatclass_price = 200;
		}
		price = 100 * adult + 50 * child + 25 * infant + seatclass_price;
	}

	public int getPrice() {
		return price;
	}

}
