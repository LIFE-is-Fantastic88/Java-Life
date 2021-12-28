import java.util.*;

 class SystemController {
	private Reserve_vehicle rvc=new Reserve_vehicle();
	private Record_Rental rv=new Record_Rental();
    private View view=new View();
    int[] check = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public String getbrand() {
    	return rv.getbrand();
    }
    public String getmodel() {
    	return rv.getmodel();
    }
    public String getstartdate() {
    	return rv.getstartdate();
    }
    public String getenddate() {
    	return rv.getenddate();
    }
    public void setbrand(String brand) {
    	rv=new Record_Rental();
    	rv.setbrand(brand);
    }
    public void setmodel(String model) {
    	
    	rv.setmodel(model);
    }
    public void setstartdate(String startdate) {
    	rv.setstartdate(startdate);
    }
    public void setenddate(String enddate) {
    	rv.setenddate(enddate);
    }
    public boolean availability() {
    	return rvc.checkavailability(rv);
    }
    public void run() {
    	while(true) {
    		String input=view.start();
    		if (input.equals("2") || input.equals("3") || input.equals("4")) {
				view.displayundercontruction();
				continue;
			}else if (input.equals("0")) {
				System.exit(0);;
			}else if (input.equals("1")) {
				view.printbrandqs();
				
				String brand = view.enterbrandqs();

				if (!brand.equals("HONDA") && !brand.equals("TOYOTA") && !brand.equals("PERODUA")
						&& !brand.equals("PROTON") && !brand.equals("PORCHE")) {
					view.replyunavailable();
					continue;
				}
				setbrand(brand);

				view.printmodelqs();
				String model = view.entermodelqs();
				if (!model.equals("X70") && !model.equals("G10") && !model.equals("P20") && !model.equals("C10")
						&& !model.equals("M16")) {
					view.replyunavailable();
					continue;
				}
				setmodel(model);

				view.printstartdateqs();
				String startdate = view.enterstartdateqs();  ///
				StringTokenizer token = new StringTokenizer(startdate, "/");
				int daystart = Integer.parseInt(token.nextToken());
				int monthstart = Integer.parseInt(token.nextToken());
				if (daystart > check[monthstart]) {
					view.replyunavailable();
					continue;
				}
				setstartdate(startdate);

				view.printenddateqs();
				String enddate = view.enterenddateqs();
				StringTokenizer token2 = new StringTokenizer(enddate, "/");
				int dayend = Integer.parseInt(token2.nextToken());
				int monthend = Integer.parseInt(token2.nextToken());
				if (dayend > check[monthend]) {
					view.replyunavailable();
					continue;
				}

				setenddate(enddate);

				if (availability() == true) {
					view.printavailable();
				} else {
					view.printunavailable();
				}
			}
    	}
    }
   
}
