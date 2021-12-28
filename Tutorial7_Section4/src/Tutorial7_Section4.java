import java.util.Scanner;

public class Tutorial7_Section4 {
	public static String getMonthname(String month) {
		String Monthname = new String();
		if (month.equals("01")) {
			Monthname = "January";
		} else if (month.equals("02")) {
			Monthname = "February";
		} else if (month.equals("03")) {
			Monthname = "March";
		} else if (month.equals("04")) {
			Monthname = "April";
		} else if (month.equals("05")) {
			Monthname = "May";
		} else if (month.equals("06")) {
			Monthname = "June";
		} else if (month.equals("07")) {
			Monthname = "July";
		} else if (month.equals("08")) {
			Monthname = "August";
		} else if (month.equals("09")) {
			Monthname = "September";
		} else if (month.equals("10")) {
			Monthname = "October";
		} else if (month.equals("11")) {
			Monthname = "November";
		} else if (month.equals("12")) {
			Monthname = "December";
		}

		return Monthname;
	}

	public static String Getbirthplace(String birthplace) {
		String place = new String();
		if (birthplace.equals("01")) {
			place = "Johor";
		} else if (birthplace.equals("02")) {
			place = "Kedah";
		} else if (birthplace.equals("03")) {
			place = "Kelantan";
		} else if (birthplace.equals("04")) {
			place = "Malacca";
		} else if (birthplace.equals("05")) {
			place = "Negeri Sembilan";
		} else if (birthplace.equals("06")) {
			place = "Pahang";
		} else if (birthplace.equals("07")) {
			place = "Penang";
		} else if (birthplace.equals("08")) {
			place = "Perak";
		} else if (birthplace.equals("09")) {
			place = "Perlis";
		} else if (birthplace.equals("10")) {
			place = "Selangor";
		} else if (birthplace.equals("11")) {
			place = "Terengganu";
		} else if (birthplace.equals("12")) {
			place = "Sabah";
		} else if (birthplace.equals("13")) {
			place = "Sarawak";
		} else if (birthplace.equals("14")) {
			place = "Kuala Lumpur";
		} else if (birthplace.equals("15")) {
			place = "Putrajaya";
		} else if (birthplace.equals("21") || birthplace.equals("22") || birthplace.equals("23")
				|| birthplace.equals("24")) {
			place = "Johor";
		} else if (birthplace.equals("25") || birthplace.equals("26") || birthplace.equals("27")) {
			place = "Kedah";
		} else if (birthplace.equals("28") || birthplace.equals("29")) {
			place = "Kelantan";
		} else if (birthplace.equals("30")) {
			place = "Malacca";
		} else if (birthplace.equals("31")) {
			place = "Negeri Sembilan";
		} else if (birthplace.equals("32") || birthplace.equals("33")) {
			place = "Pahang";
		} else if (birthplace.equals("34") || birthplace.equals("35")) {
			place = "Penang";
		} else if (birthplace.equals("36") || birthplace.equals("37") || birthplace.equals("38")
				|| birthplace.equals("39")) {
			place = "Perak";
		} else if (birthplace.equals("40")) {
			place = "Perlis";
		} else if (birthplace.equals("41") || birthplace.equals("42") || birthplace.equals("43")
				|| birthplace.equals("44")) {
			place = "Selangor";
		} else if (birthplace.equals("45") || birthplace.equals("46")) {
			place = "Terengganu";
		} else if (birthplace.equals("47") || birthplace.equals("48") || birthplace.equals("49")) {
			place = "Sabah";
		} else if (birthplace.equals("50") || birthplace.equals("51") || birthplace.equals("52")
				|| birthplace.equals("53")) {
			place = "Sarawak";
		} else if (birthplace.equals("54") || birthplace.equals("55") || birthplace.equals("56")
				|| birthplace.equals("57")) {
			place = "Kuala Lumpur";
		} else if (birthplace.equals("58")) {
			place = "Labuan";
		} else if (birthplace.equals("59")) {
			place = "Negeri Sembilan";
		}

		return place;

	}

	public static String setGender(String gender) {
		String realgender = new String();
		if (gender.equals("0") || gender.equals("2") || gender.equals("4") || gender.equals("6")
				|| gender.equals("8")) {
			realgender = "Female";
		} else if (gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")
				|| gender.equals("9")) {
			realgender = "Male";
		}
		return realgender;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = str.substring(2, 4);
		String month = str2;

		String str3 = str.substring(6, 8);
		String birthplace = str3;
		String str4 = str.substring(11);
		String gender = str4;
		String str5 = str.substring(0, 2);
		String year = str5;
		String month1 = getMonthname(month);
		String place1 = Getbirthplace(birthplace);
		String gender1 = setGender(gender);

		if (str5 == "00" || str5 == "01" || str5 == "02" || str5 == "03" || str5 == "05" || str5 == "06" || str5 == "07"
				|| str5 == "08" || str5 == "09" || str5 == "10" || str5 == "11" || str5 == "12" || str5 == "13"
				|| str5 == "14" || str5 == "15" || str5 == "16" || str5 == "17") {

			System.out.print(str.substring(4, 6) + " " + month1 + " " + "20" + year + " " + place1 + " " + gender1);
		} else {
			System.out.print(str.substring(4, 6) + " " + month1 + " " + "19" + year + " " + place1 + " " + gender1);
		}

	}

}
