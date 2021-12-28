
public class Beverage {
private String origin;
private String brand;
private String name;
private boolean veganFriendly;
private double pricePerPack;
private int quantityPerPack;
private NutritionalInfo nutritionalInfo;
  public Beverage(String origin,String brand,String name, boolean veganFriendly,double pricePerPack,int quantityPerPack,NutritionalInfo n) {
	  this.origin=origin;
	  this.brand=brand;
	  this.name=name;
	  this.veganFriendly=veganFriendly;
	  this.pricePerPack=pricePerPack;
	  this.quantityPerPack=quantityPerPack;
	  nutritionalInfo=n;
  }
  String getOrigin() {
	  return origin;
  }
  String getBrand() {
	  return brand;
  }
  String getName() {
	  return name;
  }
 boolean getVeganStatus() {
	  return veganFriendly;
  }
 double getPricePerPack() {
	 return pricePerPack;
 }
 int getQuantityPerPack() {
	 return quantityPerPack;
 }
 public NutritionalInfo getnutritionalinfo() {
	 return nutritionalInfo;
 }
}
