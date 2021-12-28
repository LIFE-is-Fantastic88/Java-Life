import java.util.ArrayList;

public class Flight {
private String from;
private String to;
private String flightNumber;
private String date;
private String departureTime;
private int firstClassNum;
private int businessClassNum;
private int economyClassNum;
private ArrayList<BoardingPass> boardingPassList;
	public Flight(String a, String b, String c, String d, String e) {
		this.from=a;
		this.to=b;
		this.flightNumber=c;
		this.date=d;
		this.departureTime=e;
		this.firstClassNum=0;
		this.businessClassNum=0;
		this.economyClassNum=0;
		boardingPassList=new ArrayList<BoardingPass>();
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getFlightNum() {
		return flightNumber;
	}
	public String getDate() {
		return date;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public int getEconomyClassNum() {
		return economyClassNum;
	}
	public int getFirstClassNum() {
		return firstClassNum;
	}
	public int getBusinessClassNum() {
		return businessClassNum;
	}
	public ArrayList<BoardingPass>getBoardingPassList() {
		return boardingPassList;
	}
	public void updatePassengerNum() {
		
	}
	public void passengerNumByClass(ArrayList<BoardingPass> boardingPassList2) {
		for(int z=0;z<boardingPassList.size();z++) {
			if(boardingPassList2.get(z).getPassenger().getTicketClass()=='F') {
				firstClassNum+=1;
			}else if(boardingPassList2.get(z).getPassenger().getTicketClass()=='B') {
				businessClassNum+=1;
			}else if(boardingPassList2.get(z).getPassenger().getTicketClass()=='O') {
				economyClassNum += 1;
			}
		}
	}
}

