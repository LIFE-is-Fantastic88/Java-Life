import java.util.ArrayList;

public class AsexualPlant extends Plant {
private double height;
private String propagationMethod;
	public AsexualPlant(String n, String cl, String t, double initHeight, String pm) {
        super(n,cl,t);
        height=initHeight;
        propagationMethod=pm;
        }
 void setHeight(double h) {
	 height=h;
 }
 void setPropagationMethod(String pm) {
	 propagationMethod=pm;
 }
 double getHeight() {
	 return height;
 }
 String getPropagationmethod() {
	 return propagationMethod;
 }
 void printDetails() {
	 super.printDetails();
	 System.out.println("Height: "+height+" cm");
	 System.out.println("Propagation Method: "+propagationMethod);
	 System.out.println();
 }
public void determineGrowth(int days) {
	double GROWTH_RATE_INDOOR = 0.5;
	double GROWTH_RATE_OUTDOOR = 1.5;
	if (super.getType().equals("Indoor")) {
		if(propagationMethod.equals("Stem")||propagationMethod.equals("Dividing")) {
			height += days * 2 * GROWTH_RATE_INDOOR;
		}else {
			height += days * GROWTH_RATE_INDOOR;
		}
	}else if(super.getType().equals("Outdoor")) {
		if(propagationMethod.equals("Stem")||propagationMethod.equals("Dividing")) {
			height += days * 2 * GROWTH_RATE_OUTDOOR;
		}else {
			height += days * GROWTH_RATE_OUTDOOR;
		}
	}
}

	public void countIndoorPlant(ArrayList<Plant> plantList) {
		int num = 0;
		for (int z = 0; z < plantList.size(); z++) {
			if (plantList.get(z).getType().equals("Indoor")&& plantList.get(z)instanceof AsexualPlant) {
				num++;
			}
		}
		System.out.println("Number of indoor AsexualPlant: " + num);
	}

	public void countOutdoorPlant(ArrayList<Plant> plantList) {
		int num = 0;
		for (int z = 0; z < plantList.size(); z++) {
			if (plantList.get(z).getType().equals("Outdoor")&& plantList.get(z)instanceof AsexualPlant) {
				num++;
			}
		}
		System.out.println("Number of outdoor AsexualPlant: " + num);
	}
}
