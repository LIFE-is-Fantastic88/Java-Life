
class Record_Rental {
	private String brand;
	private String model;
	private String startdate;
	private String enddate;

	private boolean[] daycheck = new boolean[366];

	public Record_Rental() {

	}

	public Record_Rental(String brand, String model, String startdate, String enddate) {
		this.brand = brand;
		this.model = model;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public boolean[] getdaycheck() {
		return daycheck;
	}

	public String getbrand() {
		return brand;
	}

	public String getmodel() {
		return model;
	}

	public String getstartdate() {
		return startdate;
	}

	public String getenddate() {
		return enddate;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public void setstartdate(String startdate) {
		this.startdate = startdate;
	}

	public void setenddate(String enddate) {
		this.enddate = enddate;
	}

}
