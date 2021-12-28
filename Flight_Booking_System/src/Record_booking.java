
public class Record_booking {
  private String departure;
  private String arrival;
  private String date;
  private String seatclass;
  private String seatnumber;
  private String time;
  public void setDeparture(String departure) {
	  this.departure=departure;
  }
  public void setArrival(String arrival) {
	  this.arrival=arrival;
  }
  public void setDate(String date) {
	  this.date=date;
  }
  public void setSeatclass(String seatclass ) {
	  this.seatclass=seatclass;
  }
  public void setSeatnumber(String seatnumber) {
	  this.seatnumber=seatnumber;
  }
  public void setTime(String time) {
	  this.time=time;
  }
  public String getTime() {
	  return time;
  }
  public String getDeparture() {
	  return departure;
  }
  public String getArrival() {
	  return arrival;
  }
  public String getDate() {
	  return date;
  }
  public String getSeatclass() {
	  return seatclass;
  }
  public String getSeatnumber() {
	  return seatnumber;
  }
}
