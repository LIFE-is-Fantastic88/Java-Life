
public class BoardingPass {

private Passenger object;
private int securityNum;
private char gate;
private String gateOpen;
private String seat;
public BoardingPass(Passenger a, int b, char c, String d, String e) {
this.object=a;
this.securityNum=b;
this.gate=c;
this.gateOpen=d;
this.seat=e;
}
public Passenger getPassenger() {
	return object;
}
public int securityNum() {
	return securityNum;
}
public String getSeat() {
	return seat;
}
public String getGateOpen() {
	return gateOpen;
}
public char getGate() {
	return gate;
}
}
