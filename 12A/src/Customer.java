import java.util.*;
public class Customer {
	private int arrivalTime; // 0..60, the minute of the hour when a customer arrives
	private int serviceTime; // depends on dish
	
	public Customer()  { // default constructor
		arrivalTime = 0;
		serviceTime = 0;
	}
	public Customer(int arrTime, int dishType) { 
		arrivalTime = arrTime;
		setServiceTime(dishType);
		
	}
	
	private void setServiceTime(int dishType) {
		// TODO Auto-generated method stub
		
	}
	public void setArrivalTime(int arrTime) {
		arrivalTime = arrTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public int getServiceTime() {
		return serviceTime;
	}
}

