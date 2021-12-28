import java.util.ArrayList;

public class Airport {
	private ArrayList<String> airportCode = new ArrayList<String>();
	private ArrayList<String> country = new ArrayList<String>();
	private ArrayList<FlightDes> FDes = new ArrayList<FlightDes>();
	public Airport() {
		country.add("Johor Bahru");
		country.add("Kota Kinabalu");
		country.add("Kuala Lumpur");
		country.add("Kuching");
		country.add("Miri");
		country.add("Penang");
		country.add("Ipoh");
		country.add("Bintulu");
		airportCode.add("A001");
		airportCode.add("A002");
		airportCode.add("A003");
		airportCode.add("A004");
		airportCode.add("A005");
		airportCode.add("A006");
		airportCode.add("A007");
		airportCode.add("A008");
	}
	public ArrayList<String> getCountryList(){
		return country;
	}
	public ArrayList<String> getairportCodeList(){
		return airportCode;
	}
}
