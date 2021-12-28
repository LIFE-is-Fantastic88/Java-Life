import java.util.Scanner;

public class Tutorial10_SectionB1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		MyTime time=new MyTime(hour,minute,second);
		time.setHour(hour);
		time.setMinute(minute);
		time.setSecond(second);
		System.out.print(time.toString());
	}

}

class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		int valid = 0;
		valid = setTime(hour, minute, second);// method inside contractor to invoke
		if (valid == 1) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;}
	}

	public int setTime(int hour, int minute, int second) {
		if (hour <= 0 || hour >= 23) {
			throw new IllegalArgumentException();		}
		if (minute <= 0 || minute >= 59) {
			throw new IllegalArgumentException();
		}
		if (second <= 0 || second >= 59) {
			throw new IllegalArgumentException();
		}return 1;
	}

	void setHour(int hour) {
		this.hour = hour;
	}

	void setMinute(int minute) {
		this.minute = minute;
	}

	void setSecond(int second) {
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public String toString() {
		String h=Integer.toString(getHour());
		String m=Integer.toString(getMinute());
		String s=Integer.toString(getSecond());
		String combine=h+":"+m+":"+s;
		return combine;
	}
}