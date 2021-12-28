
public class Plant {
private String name;
private String climate;
private String type;
  public Plant(String n, String cl,String t) {
	  name=n;
	  climate=cl;
	  type=t;
  }
  void setName(String n) {
	  name=n;
  }
  void setClimate(String cl) {
	  climate=cl;
  }
  void setType(String t) {
	  type=t;
  }
  String getName() {
	  return name;
  }
  String getClimate() {
	  return climate;
  }
  String getType() {
	  return type;
  }
  void printDetails() {
	  System.out.println("Plant Name: "+name);;
	  System.out.println("Suitable Climate: "+climate);
	  System.out.println("Plant Type: "+type);
  }
}
