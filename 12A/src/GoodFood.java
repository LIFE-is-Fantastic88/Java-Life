import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GoodFood {
	Customer customer;
	int cookIsAvailable;
	int numArrivals; // number of arrivals in any minute
	Queue<Customer> queue;
	int totalWaitingTime;
	int numCustomersServed = 0;
	ArrayList<Integer>arr=new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GoodFood foodService = new GoodFood();
		foodService.simulate();
	}
	
	public GoodFood(){
		cookIsAvailable = 0; // assume the cook starts cooking at time 0
		numArrivals = 0;
		totalWaitingTime = 0;
		numCustomersServed = 0;
		queue = new Queue<Customer>();
	}
		
	private void displayStatistics() {
		int cus=0;
		for(int z=0;z<arr.size();z++) {
			if(arr.get(z)<60) {
			System.out.println("Servicing customer "+(z+1)+" at :"+arr.get(z)+"th minute");
			cus++;
			}
			else
				break;
		}
		System.out.println("Number of customers served "+cus);
		System.out.println("Customers left in queue: "+(arr.size()-cus));
	}
	
	public void simulate(){
		int serviceTime = 0;
		int minServTime = 5;
		int startCooking = 0;
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			int num = sc.nextInt();
			int time=1;
			int total=0;
			while (sc.hasNextLine()) {
				int arrTime = sc.nextInt();
				int cusOrder = sc.nextInt();
				if(time==1) {
					total+=arrTime;
				}
				time++;
				if (cusOrder == 1) {
					total += 10;
				} else if (cusOrder == 2) {
					total += 20;
				} else if (cusOrder == 3) {
					total += 5;
				} else if (cusOrder == 4) {
					total += 15;
				} else if (cusOrder == 5) {
					total += 7;
				}
			  arr.add(total);
			}
				
			while (!queue.isEmpty() ){
/*Algorithm
			If (service time more than 1 hour considering condition*) 
		Finish
         Else
		Remove a customer from the queue;
		Determine and print the time the customer is given service (received food)
		(this should update the overall servicing time)
		Add to the waiting time of the current customer to total waiting time
		Increment the number of customers served;	
*/
					
			}
			sc.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		displayStatistics();
			
		
	}
		
	

}
