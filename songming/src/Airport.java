import java.util.ArrayList;

public class Airport {
	private ArrayList<String> airportCode = new ArrayList<String>();
	private ArrayList<String> country = new ArrayList<String>();
	private ArrayList<FlightDes> flightdestination = new ArrayList<FlightDes>();
	public Airport() {
		country.add("Korea");
		country.add("England");
		country.add("Japan");
		country.add("Australia");
		country.add("Vietnam");
		country.add("Iceland");
		country.add("Finland");
		country.add("Indonesia");
		airportCode.add("A001");
		airportCode.add("A002");
		airportCode.add("A003");
		airportCode.add("A004");
		airportCode.add("A005");
		airportCode.add("A006");
		airportCode.add("A007");
		airportCode.add("A008");
	}
	public ArrayList<String> getAirportList(){
		return airportCode;
	}
	public ArrayList<String> getCountryList(){
		return country;
	}
	
}
