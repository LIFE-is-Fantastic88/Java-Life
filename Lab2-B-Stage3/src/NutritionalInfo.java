
public class NutritionalInfo {
private double energy;
private double fat;
private double carbohydrate;
private double fibre;
private double protein;
private double sodium;
public NutritionalInfo(double energy,double fat,double carbohydrate,double fibre,double protein,double sodium) {
	this.energy=energy;
	this.fat=fat;
	this.carbohydrate=carbohydrate;
	this.fibre=fibre;
	this.protein=protein;
	this.sodium=sodium;
}
public double getEnergy() {
	return energy;
}
public double getFat() {
	return fat;
}
public double getCarbohydrate() {
	return carbohydrate;
}
public double getFibre() {
	return fibre;
}
public double getProtein() {
	return protein;
}
public double getSodium() {
	return sodium;
}
}
