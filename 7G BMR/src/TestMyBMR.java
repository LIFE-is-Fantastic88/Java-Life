import java.util.Scanner;
import java.text.DecimalFormat;

public class TestMyBMR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int n = sc.nextInt();
		for (int input = 1; input <= n; input++) {
			MyBMR mybmr = new MyBMR();
			double weight = sc.nextDouble();
			double height = sc.nextDouble();
			int age = sc.nextInt();
			int gender = sc.nextInt();
			int num = sc.nextInt();
			mybmr.setBMR(weight, height, age, gender);
			mybmr.getDCR(num);
			System.out.println("Case #" + input + ": " + df.format(mybmr.getBMR()) + " " + df.format(mybmr.setDCR()));
		}
	}
}

class MyBMR {
	private double weight;
	double height;
	int age;
	int gender;
	int num;

	public MyBMR() {
		weight = 0.0;
		height = 0.0;
		age = 0;
		gender = 0;

	}

	void setBMR(double weight, double height, int age, int gender) {
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.gender = gender;

	}

	double getBMR() {
		double gen = 0;
		if (gender == 2) {
			gen = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);

		} else if (gender == 1) {
			gen = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);

		}
		return gen;
	}

	void getDCR(int num) {
		this.num = num;
	}

	double setDCR() {
		double activity = 0;
		if (num == 0) {
			activity = 1.2 * getBMR();
		} else if (num >= 1 && num <= 3) {
			activity = 1.375 * getBMR();
		} else if (num == 4 || num == 5) {
			activity = 1.55 * getBMR();
		} else if (num == 6) {
			activity = 1.725 * getBMR();
		} else if (num > 6) {
			activity = 1.9 * getBMR();
		}
		return activity;
	}

}