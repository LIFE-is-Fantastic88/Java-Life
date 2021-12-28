import java.util.ArrayList;
import java.util.StringTokenizer;

 class Reserve_vehicle {
	ArrayList<Record_Rental> recordrental = new ArrayList<Record_Rental>();
	 int[] check = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
	
	public boolean checkavailability(Record_Rental rv) {
		
		boolean last = true;
		String date1=rv.getstartdate();
		String date2=rv.getenddate();
		boolean detail=false;
		if (recordrental.size() == 0) {
			last=true;
			recordrental.add(rv);
			StringTokenizer token = new StringTokenizer(rv.getstartdate(), "/");
			int daystart = Integer.parseInt(token.nextToken());
			int monthstart = Integer.parseInt(token.nextToken());
			int totaldaystart = check[monthstart - 1] + daystart;

			StringTokenizer token2 = new StringTokenizer(rv.getenddate(), "/");
			int dayend = Integer.parseInt(token2.nextToken());
			int monthend = Integer.parseInt(token2.nextToken());
			int totaldayend = check[monthend - 1] + dayend;

			int finalresult = (totaldayend - totaldaystart) + 1;

			for (int z = 0; z < finalresult; z++) {
				rv.getdaycheck()[totaldaystart] = true;
				totaldaystart++;
			}

		} else {
			int a1=0;
			int a2=0;
			for (int z = 0; z < recordrental.size(); z++) {
			
				if (rv.getbrand().equals(recordrental.get(z).getbrand()) && rv.getmodel().equals(recordrental.get(z).getmodel())) {
					
					StringTokenizer token = new StringTokenizer(date1, "/");
					int daystart = Integer.parseInt(token.nextToken());
					int monthstart = Integer.parseInt(token.nextToken());
					int totaldaystart = check[monthstart - 1] + daystart;

					StringTokenizer token2 = new StringTokenizer(date2, "/");
					int dayend = Integer.parseInt(token2.nextToken());
					int monthend = Integer.parseInt(token2.nextToken());
					int totaldayend = check[monthend - 1] + dayend;
					a1=totaldaystart;
					a2=totaldayend;
			            for(int x=totaldaystart;x<=totaldayend;x++) {
			            	if(recordrental.get(z).getdaycheck()[x]==true)
			            		last= false;
			            }
			            if (last == false) {
							break;
					}

				} else if (z == recordrental.size() - 1) {
					last = false;
					detail = true;
					StringTokenizer token = new StringTokenizer(date1, "/");
					int daystart = Integer.parseInt(token.nextToken());
					int monthstart = Integer.parseInt(token.nextToken());
					int totaldaystart = check[monthstart - 1] + daystart;

					StringTokenizer token2 = new StringTokenizer(date2, "/");
					int dayend = Integer.parseInt(token2.nextToken());
					int monthend = Integer.parseInt(token2.nextToken());
					int totaldayend = check[monthend - 1] + dayend;
					a1 = totaldaystart;
					a2 = totaldayend;
					for (int y = a1; y <= a2; y++) {
						rv.getdaycheck()[y] = true;
					}
					recordrental.add(rv);
				}
			}
			if (last == true) {
				for (int y = a1; y <= a2; y++) {
					rv.getdaycheck()[y] = true;
					
				}
				recordrental.add(rv);
			}
		}
		if(detail==true) {
			last=true;
		}
		if (last == true) {
			return true;
		}  else {
			return false;
		}
	}
	

}
