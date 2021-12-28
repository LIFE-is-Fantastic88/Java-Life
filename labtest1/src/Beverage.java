

public class Beverage {
private String origin;
private String brand;
private String name;
private boolean veganFriendly;
private double pricePerPack;
private int quantityPerPack;
private NutritionalInfo nutritionalInfo;
public Beverage(String a,String b,String c,boolean d,double e,int f,NutritionalInfo g) {
	this.origin=a;
	this.brand=b;
	this.name=c;
	this.veganFriendly=d;
	this.pricePerPack=e;
	this.quantityPerPack=f;
	nutritionalInfo=g;
}
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
public String getBrand() {
	// TODO Auto-generated method stub
	return brand;
}
public String getOrigin() {
	// TODO Auto-generated method stub
	return origin;
}
public boolean getVeganStatus() {
	// TODO Auto-generated method stub
	return veganFriendly;
}
public double getPricePerPack() {
	// TODO Auto-generated method stub
	return pricePerPack;
}
public int getQuantityPerPack() {
	// TODO Auto-generated method stub
	return quantityPerPack;
}
public NutritionalInfo getNutitionalInfo() {
	return nutritionalInfo;
}
}
