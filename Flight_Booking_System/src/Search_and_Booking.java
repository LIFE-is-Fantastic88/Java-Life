import java.util.ArrayList;
import java.util.StringTokenizer;

public class Search_and_Booking {
	ArrayList<Record_booking> recordbooking = new ArrayList<Record_booking>();

	public boolean checkavailability(Record_booking record) {
		ErrorChecking check1 = new ErrorChecking();
		boolean check = false;

		if (recordbooking.size() == 0) {
			recordbooking.add(record);
			check = true;
			check1.success();

		} else {
			for (int z = 0; z < recordbooking.size(); z++) {

				if (record.getArrival().equals(recordbooking.get(z).getArrival())
						&& record.getDeparture().equals(recordbooking.get(z).getDeparture())
						&& record.getDate().equals(recordbooking.get(z).getDate())
						&& record.getSeatclass().equals(recordbooking.get(z).getSeatclass())
						&& record.getSeatnumber().equals(recordbooking.get(z).getSeatnumber())
						&& record.getTime().equals(recordbooking.get(z).getTime())) {

					check = false;
					check1.error();
					break;
				} else if (z == recordbooking.size() - 1) {
					recordbooking.add(record);
					check = true;
					check1.success();
					break;
				}

			}

		}
		return check;
	}
}
