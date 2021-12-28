
import java.util.ArrayList;

public class Controller_mainmenu{
	private int from,to,day,month,year,Rday,Rmonth,Ryear,adult,child,infant,seatClass;
	private String name,password;
	private Date date = new Date();
	private Airport airport = new Airport();
	private Airplane airplane = new Airplane("8:00");
	private FlightDes flightdes;
	private int price;
	public void action(int from, int to, String day, String month, String year, String Rday,
		String Rmonth, String Ryear, String adult, String child, String infant, int seat,MainMenu_view view,Controller_home controller) {
		this.flightdes = controller.getFLightdes();
		this.setName(controller.getName());
		this.setPassword(controller.getPassword());
		this.setFrom(from);
		this.setTo(to);
		if(!validNum(day,month,year) || !date.checkDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year)) || 
				!validNum(Rday,Rmonth,Ryear) || !date.checkReturn(Integer.parseInt(Rday), Integer.parseInt(Rmonth), Integer.parseInt(Ryear)) || 
				!validPassenger(adult,child,infant) || from==-1 || to==-1 || seat==-1) {
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
		}catch(Exception e) {this.setChild(0);}
		try {
			this.setInfant(Integer.parseInt(infant));
		}catch(Exception e) {this.setInfant(0);}
		view.dispose();
		setPrice();
		new Flight_view(this);
	}
	public boolean validNum(String day,String month,String year) {
		try {
			Integer.parseInt(day);
			Integer.parseInt(month);
			Integer.parseInt(year);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	public boolean validPassenger(String adult,String child,String infant) {
		int a = 0,c = 0,i = 0;
		try {
			a = Integer.parseInt(adult);
			c = Integer.parseInt(child);
			i = Integer.parseInt(infant);
		}catch(Exception e) {}
		if((a+c+i)<=0)
			return false;
		return true;
	}
	
	public ArrayList<SeatClass> getSeatClassList(){
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
		return day+"/"+month+"/"+year;
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
		return Rday+"/"+Rmonth+"/"+Ryear;
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
	public int getAdult() {
		return adult;
	}
	public void setAdult(int adult) {
		this.adult = adult;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public int getInfant() {
		return infant;
	}
	public void setInfant(int infant) {
		this.infant = infant;
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
		price = 100*adult+50*child+25*infant+airplane.getSeatClassList().get(seatClass).getPrice();
	}
	public int getPrice() {
		return price;
	}
	public FlightDes getflightdes() {
		return this.flightdes;
	}
}
