import java.util.ArrayList;

public class FlightDestination {
	private ArrayList<Flight> flight = new ArrayList<Flight>();

	public FlightDestination() {
		flight.add(new Flight("F001"));
		flight.add(new Flight("F002"));
		flight.add(new Flight("F003"));
	}

	public ArrayList<Flight> getFlightList() {
		return flight;
	}
}
