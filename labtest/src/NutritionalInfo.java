

public class NutritionalInfo {
private double energy;
private double fat;
private double carbohydrate;
private double fibre;
private double protein;
private double sodium;
public NutritionalInfo(double a,double b,double c,double d,double e,double f) {
this.energy=a;
this.fat=b;
this.carbohydrate=c;
this.fibre=d;
this.protein=e;
this.sodium=f;
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
public double getsodium() {
	return sodium;
}

}
