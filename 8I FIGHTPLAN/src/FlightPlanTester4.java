

import java.util.ArrayList;

public class FlightPlanTester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		
		Flight f1 = new Flight("HEAHTROW-LONDON", "KUALA LUMPUR", "MH001", "19 APR", "22:00");
		Flight f2 = new Flight("CDG-PARIS", "JFK-NEW YORK", "Icelandair 541", "20 JUN", "15:00");
		Flight f3 = new Flight("ADL-ADELAIDE", "DOH-DOHA", "EY6311", "13 JUL", "00:40");
		flightList.add(f1);
		flightList.add(f2);
		flightList.add(f3);
		ArrayList<BoardingPass> bpListf1 = f1.getBoardingPassList();
		ArrayList<BoardingPass> bpListf2 = f2.getBoardingPassList();
		ArrayList<BoardingPass> bpListf3 = f3.getBoardingPassList();
		
		Passenger p1 = new Passenger("AZIZ/MOHD AZLAN DR", "A11041969", "MALAYSIA", 'M', "MH 304662573 BLUE", "E778988688", "MOML", 'O');
		BoardingPass bp1 = new BoardingPass(p1, 40, 'A', "17:00", "58A");
		bpListf1.add(bp1);
		Passenger p2 = new Passenger("LEAS/LIYANA", "MY10012KJ", "MALAYSIA", 'F', "", "E12349876", "MOML CHD", 'B');
		BoardingPass bp2 = new BoardingPass(p2, 41, 'A', "17:00", "45F");
		bpListf1.add(bp2);
		Passenger p3 = new Passenger("ABDULLAH/ZURAIDAH", "A12345678", "MALAYSIA", 'F', "MH012333444 GOLD", "E77778888", "MOML", 'F');
		BoardingPass bp3 = new BoardingPass(p3, 44, 'A', "17:00", "07A");
		bpListf1.add(bp3);
		
		Passenger p4 = new Passenger("LEE MIN HO", "21A90034KYE", "SOUTH KOREA", 'M', "SK0777999", "E23455678", "VML", 'B');
		BoardingPass bp4 = new BoardingPass(p4, 42, 'G', "12:10", "12A");
		bpListf2.add(bp4);
		Passenger p5 = new Passenger("LIN DAN", "AF320034GW", "REP OF CHINA", 'M', "RC081737", "E23455678", "CHD", 'B');
		BoardingPass bp5 = new BoardingPass(p5, 43, 'G', "12:10", "13B");
		bpListf2.add(bp5);
		
		Passenger p6 = new Passenger("ELIYA EKA KURNIAWAN", "1A13BK5754AGPW", "INDONESIA", 'F', "","E12345678", "MOML", 'O');
		BoardingPass bp6 = new BoardingPass(p6, 45, 'C', "21:10", "37D");
		bpListf3.add(bp6);
				
		System.out.println("Print number of passenger according to Ticket Class");
		//printBoardingPass(flightList);
		printPassengerNumByTicketClass(flightList);
		
	}

	public static void printBoardingPass(ArrayList<Flight> flightList){
		int i = 1;
		for (Flight f: flightList){
			System.out.println("\nFlight "+i);
			for (BoardingPass bp: f.getBoardingPassList()){
	    		System.out.println("Name : "+ bp.getPassenger().getName() + " | Frequent Flyer Number : "+ bp.getPassenger().getFrequentFlyerNum() + 
	    				" | Security Number :"+ bp.securityNum());
		    	System.out.println("From : "+ f.getTo() + " | To : "+ f.getTo() + " | SSR : "+ bp.getPassenger().getSpecialServiceRequest() +
		    			" | Flight Number : "+f.getFlightNum() + " | Date : "+ f.getDate() + " | Departure : "+ f.getDepartureTime());
		    	System.out.println("Gate : "+ bp.getGate() + " | Gate Open : "+bp.getGateOpen() + " | Class : "+ bp.getPassenger().getTicketClass() +
		    			" | Seat : "+ bp.getSeat() + " | E-Ticket Number : "+ bp.getPassenger().getETicketNum());
		    	System.out.println();
		    }
			i++;
			System.out.println();
		}
	}
	
	public static void printPassengerNumByTicketClass(ArrayList<Flight> flightList) {
		int i = 1;
		for (Flight f: flightList){
			System.out.println("\nFlight "+i + " : "+ f.getFlightNum());
			f.passengerNumByClass(f.getBoardingPassList());
			System.out.println("Number of Economy Class Passengers : "+ f.getEconomyClassNum());
			System.out.println("Number of Business Class Passengers : "+ f.getBusinessClassNum());
			System.out.println("Number of First Class Passengers : "+ f.getFirstClassNum());
			i++;
		}
	}

}
