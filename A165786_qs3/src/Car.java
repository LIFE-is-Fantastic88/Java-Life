
public class Car extends Vehicle {
	String type;

	public Car(String type) {
	this.type=type;
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("\n" + type + ": Moves forward when driver steps on the accelerator");
	}

	public void stop() {
		System.out.println(type + ": Stops when the driver steps on the brake");
	}

}
