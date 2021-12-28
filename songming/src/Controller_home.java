
public class Controller_home{
	private String name,password;
	private FlightDes flightdes;
	public void action(String name,FlightDes fd) {
		this.setName(name);
		this.flightdes = fd;
		new Option_view(this);
	}
	public FlightDes getFLightdes() {
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
