
public class MobileDevice {
private String manufacturer;
private String model;
private int batteryStatus;
   public MobileDevice(String ma,String mo,int bs) {
	   manufacturer=ma;
	   model=mo;
	   batteryStatus=bs;
   }
   void setManufacturer(String ma) {
	   manufacturer=ma;
   }
   void setModel(String mo) {
	   model=mo;
   }
   void setBatteryStatus(int bs) {
	   batteryStatus=bs;
   }
   String getManufacturer() {
	   return manufacturer;
   }
   String getModel() {
	   return model;
   }
   int getBatteryStatus() {
	   return batteryStatus;
   }
   void printDetails() {
		System.out.println("Basic phone details");
		System.out.println("Manufacturer: "+manufacturer);	
		System.out.println("Model: "+model);
		System.out.println("Battery Status: "+batteryStatus);
	}
	boolean needCharging() {
		boolean flag;
		if(getBatteryStatus()<=10) {
			return true;
		}return false;
	}
	void recharge() {
		setBatteryStatus(100);
	}

}
