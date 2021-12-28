import java.util.Scanner;

public class Tutorial7_Section2c {

	public static int toSecond(int hour, int min, int sec) {

		int total;
		total = (hour * 3600) + (min * 60) + sec;
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		if (hour >= 0 && hour <= 24 && min >= 0 && min <= 60 && sec >= 0 && sec <= 60) {
			int time = toSecond(hour, min, sec);
			System.out.print(time);
		}

	}

}
