
public class RadioTuner {
private String station;
private double frequency;
  public RadioTuner() {
	  station="Mix FM";
	  frequency=94.5;
	  
  }
  public RadioTuner(String st, double fr) {
	  station =st;
	  frequency = fr;
  }
  void setStation(String st) {
	  station=st;
  }
  void setFrequency(double fr) {
	  frequency=fr;
  }
  String getStation() {
	  return station;
  }
  double getFrequency() {
	  return frequency;
  }

}
