public class Person {
	private Vehicle vehicle;

	public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void moveVehicle() {
		vehicle.move();
	}

	public void stopVehicle() {
		vehicle.stop();
	}
}
