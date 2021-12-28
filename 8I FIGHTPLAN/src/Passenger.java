
public class Passenger {
private String name;
private String frequentFlyerNum;
private String passportNum;
private String nationality;
private char gender;
private String eTicketNum;
private String specialServiceRequest;
private char ticketClass;

public Passenger(String a, String b, String c, char d, String e, String f, String g, char h) {
	this.name=a;
	this.frequentFlyerNum=e;
	this.passportNum=b;
	this.nationality=c;
	this.gender=d;
	this.eTicketNum=f;
	this.specialServiceRequest=g;
	this.ticketClass=h;
			
}



public String getETicketNum() {
	return eTicketNum;
}

public String getFrequentFlyerNum() {
	return frequentFlyerNum;
}

public String getName() {
	return name;
}

public String getSpecialServiceRequest() {
	return specialServiceRequest;
}
public String getPassportNum() {
	return passportNum;
}
public String getNationality() {
	return nationality;
}
public char getGender() {
	return gender;
}	
public char getTicketClass() {
	return ticketClass;
}
}
