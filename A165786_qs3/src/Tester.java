public class Tester {
	public static void main(String[] args) {

		Vehicle bicycle = new Bicycle("Bicycle");
		Vehicle car = new Car("Car");
		
		Person p1 = new Person(bicycle);
		Person p2 = new Person(car);

		p1.moveVehicle();
		p1.stopVehicle();

		p2.moveVehicle();
		p2.stopVehicle();
	}
}
