import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Controller_flight_booking {
	private Random random = new Random();
	private String depart,arrival,seat,name,time,date,selectedDate,seatClass,FlightNum;
	private Plane airplane;
	private int price;
	private char gate;
	private FlightDestination flightdestination;
	private Flight flight = new Flight();
	public FlightDestination getFlightDestination() {
		return flightdestination;
	}
	public ArrayList<Plane> getPlaneList(){
		return flight.getPlaneList();
	}
	public void action(int selectedIndex, Flight_view view, Controller_mainmenu menu,int row,int seatNum) {
		this.flightdestination = menu.getflightdes();
		airplane = menu.getflightdes().getFlightList().get(0).getPlaneList().get(selectedIndex);
		time = getPlaneList().get(selectedIndex).getTime();
		this.seatClass = airplane.getSeatClassList().get(menu.getSeatClass()).getClassName();
		this.price = menu.getPrice();
		this.depart = menu.getFrom();
		this.arrival = menu.getTo();
		this.seat = airplane.getSeatClassList().get(menu.getSeatClass()).getRow().get(row).getRowNumber()+airplane.getSeatClassList().get(menu.getSeatClass()).getRow().get(row).getSeat().get(seatNum).getSeatNum();
		this.name = menu.getName();
		this.date = menu.getDate();
		this.selectedDate = menu.getRDate();
		this.FlightNum = "A"+random.nextInt(999-100);
		setGateNo();
		flightdestination.getFlightList().get(0).getPlaneList().get(selectedIndex).getSeatClassList().get(menu.getSeatClass()).getRow().get(row).getSeat().get(seatNum).setAvailability(true);
		new BoardingPass_View(this);
		
	}
	public String getDepart() {
		return depart;
	}
	
	
	public String getName() {
		return name;
	}
	public String getArrival() {
		return arrival;
	}
	
	public String getDate() {
		return date;
	}
	public String getSeat() {
		return seat;
	}
	public String getRdate() {
		return selectedDate;
	}
	public int getPrice() {
		return price;
	}
	public String getTime() {
		return time;
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
	public String getSeatClass() {
		return seatClass;
	}
	public char getGate() {
		return this.gate;
	}
	public void setGateNo() {
		this.gate = (char) (random.nextInt(('Z'-'A')+1)+'A');
	}
	public String getFlightNo() {
		return this.FlightNum;
	}
	
}
