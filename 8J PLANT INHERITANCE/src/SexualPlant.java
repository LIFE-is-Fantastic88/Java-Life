import java.util.ArrayList;

public class SexualPlant extends Plant {
  private double size;
  private boolean hasSeeds;
  private String pollinationAgent;
  public SexualPlant(String n,String cl,String t,boolean hs,String pa) {
	  super(n,cl,t);
	  size=1;
	  hasSeeds=hs;
	  pollinationAgent=pa;
  }
  void setSize(double s) {
	  size=s;
  }
  void setHasSeeds(boolean hs) {
	  hasSeeds=hs;
  }
  void setPollinationAgent(String pa) {
	  pollinationAgent=pa;
  }
  double getSize() {
	  return size;
  }
  boolean getHasSeeds() {
	  return hasSeeds;
  }
  String getPollinationAgent() {
	  return pollinationAgent;
  }
  void printDetails() {
	  super.printDetails();
	  System.out.println("Size: "+size+" cm");
	  System.out.println("Has seeds: "+hasSeeds);
	  System.out.println("Pollination agent: "+pollinationAgent);
	  System.out.println();
  }

	public void determineGrowth(int days) {
		double GROWTH_RATE_INDOOR = 0.25;
		double GROWTH_RATE_OUTDOOR = 1.25;
		if (super.getType().equals("Outdoor")) {
			if (hasSeeds == true) {
				if (pollinationAgent.equals("birds")) {
					size += days * GROWTH_RATE_OUTDOOR;
				} else if (pollinationAgent.equals("bats")) {
					size += days * 2 * GROWTH_RATE_OUTDOOR;
				}
			} else {
				if (pollinationAgent.equals("insect")) {
					size += days * 2 * GROWTH_RATE_OUTDOOR;
				} else if (pollinationAgent.equals("birds")) {
					size += days * GROWTH_RATE_OUTDOOR;
				}
			}
		} else {
			size += days * GROWTH_RATE_INDOOR;
		}

	}

	public void countIndoorPlant(ArrayList<Plant> plantList) {
		int num = 0;
		for (int z = 0; z < plantList.size(); z++) {
			if (plantList.get(z).getType().equals("Indoor")&& plantList.get(z)instanceof SexualPlant) {
			 	num++;
			}
		}
		System.out.println("Number of indoor SexualPlant: " + num);
	}

	public void countOutdoorPlant(ArrayList<Plant> plantList) {
		int num = 0;
		for (int z = 0; z < plantList.size(); z++) {
			
			if (plantList.get(z).getType().equals("Outdoor")&& plantList.get(z)instanceof SexualPlant) {
				num++;
			}
		}
		System.out.println("Number of outdoor SexualPlant: " + num);
	}

}
