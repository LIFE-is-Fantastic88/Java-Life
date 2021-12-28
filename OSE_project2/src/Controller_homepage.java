
public class Controller_homepage {
	private String name, password;
	private FlightDestination flightdes;

	public void action(String name, FlightDestination flightdest) {
		this.setName(name);
		this.flightdes = flightdest;
		new Option_view(this);
	}

	public FlightDestination getFlightDestination() {
		return flightdes;
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
}
