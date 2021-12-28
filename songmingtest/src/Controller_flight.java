import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Controller_flight {
	private Random random = new Random();
	private String from,to,seat,name,time,date,Rdate,seatClass,FlightNum;
	private Airplane airplane;
	private int price;
	private char gate;
	private FlightDes flightdes;
	private Flight flight = new Flight();
	public FlightDes getFlightDes() {
		return flightdes;
	}
	public ArrayList<Airplane> getPlaneList(){
		return flight.getPlaneList();
	}
	public void action(int selectedIndex, Flight_view view, Controller_mainmenu c,int row,int seatNum) {
		this.flightdes = c.getflightdes();
		airplane = c.getflightdes().getFlightList().get(0).getPlaneList().get(selectedIndex);
		time = getPlaneList().get(selectedIndex).getTime();
		this.seatClass = airplane.getSeatClassList().get(c.getSeatClass()).getClassName();
		this.price = c.getPrice();
		this.from = c.getFrom();
		this.to = c.getTo();
		this.seat = airplane.getSeatClassList().get(c.getSeatClass()).getRow().get(row).getRowName()+airplane.getSeatClassList().get(c.getSeatClass()).getRow().get(row).getSeat().get(seatNum).getSeatNum();
		this.name = c.getName();
		this.date = c.getDate();
		this.Rdate = c.getRDate();
		this.FlightNum = "A"+random.nextInt(999-100);
		setGate();
		flightdes.getFlightList().get(0).getPlaneList().get(selectedIndex).getSeatClassList().get(c.getSeatClass()).getRow().get(row).getSeat().get(seatNum).setAvailability(true);
		new BoardingPass_view(this);
		view.dispose();
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getSeat() {
		return seat;
	}
	public String getName() {
		return name;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public String getRdate() {
		return Rdate;
	}
	public int getPrice() {
		return price;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public char getGate() {
		return this.gate;
	}
	public void setGate() {
		this.gate = (char) (random.nextInt(('Z'-'A')+1)+'A');
	}
	public String getFlightNum() {
		return this.FlightNum;
	}
	public String getBoardTill() {
		StringTokenizer st = new StringTokenizer(this.time,":");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		min-=30;
		if(min<0) {
			min+=60;
			hour--;
		}
		return hour+":"+min;
	}
}
