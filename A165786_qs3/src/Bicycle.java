
public class Bicycle extends Vehicle {
	String type;
	public Bicycle(String type) {
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("\n" + type + ": Moves forward when rider pedals forward");
	}
	
	public void stop() {
		System.out.println(type + ": Stops when rider squeezes the brakes on the handlebar");
	}
}
