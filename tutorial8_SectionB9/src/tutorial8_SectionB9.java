import java.util.Scanner;

public class tutorial8_SectionB9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		String result = convertSeconds(sec);
		System.out.print(result);

	}

	public static String convertSeconds(int sec) {
		double hour = sec / 3600;
		double min = (sec % 3600) / 60;
		double second = (sec % 3600) % 60;
		String time = String.format("%.0f:%.0f:%.0f", hour, min, second);
		return time;
	}
}
