
public class BasicPhone extends MobileDevice {
private RadioTuner radio;
	public BasicPhone(String ma, String mo, int bs, RadioTuner rt) {
       super(ma,mo,bs);
       radio=rt;
	}
	void setRadio(RadioTuner rt) {
		radio=rt;
	}
    RadioTuner getRadio() {
    	return radio;
    }
    void setRadioSetting(String st,double fr) {
    	radio.setStation(st);
    	radio.setFrequency(fr);
    }
    void printDetails() {
    	super.printDetails();
    	System.out.println("Station: "+radio.getStation());
    	System.out.println("Frequency: "+radio.getFrequency());
    	
    }
}
