import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab_7E_my_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MyTime mytime = new MyTime();
		int n = sc.nextInt();
		int hour, minute, h, m;
		for (int z = 1; z <= n; z++) {

			hour = sc.nextInt();
			minute = sc.nextInt();
			h = sc.nextInt();
			m = sc.nextInt();
			mytime.setTime(hour, minute, h, m);

			System.out.println("Case #" + z + ": " + mytime.getEndMin());

		}

	}

}

class MyTime {
	private int hour;
	int minute;
	int h;
	int m;

	public MyTime() {
		hour = 0;
		minute = 0;
		h = 0;
		m = 0;
	}

	void setTime(int hour, int minute, int h, int m) {
		this.hour = hour;
		this.minute = minute;
		this.h = h;
		this.m = m;
	}

	String getEndMin() {
		int y = 0;
		int min;
		int x = 0;
		x = hour + h;
		y = minute + m;
		if (y < 60) {
			min = y;
		} else {
			min = y % 60;
			x++;
		}
		String str=new String();
		if (x<10&&x>0) {
			str = "0"+x + ":" + min;
		}else {
			str = x + ":" + min;
		}
		return str;
	}

}