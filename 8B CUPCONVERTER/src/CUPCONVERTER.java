import javax.swing.JOptionPane;

public class CUPCONVERTER {

	public static void main(String[] args) {
		double cup;
		double ounces;
		cup = getCup();
		ounces = getOunces(cup);
		GetResult(cup, ounces);
	}

	public static double getCup() {
		String input;
		Double numCup;
		input = JOptionPane
				.showInputDialog("This program converts measurements\n" + "in cups to fluid ounces.For your\n"
						+ "reference the formula is:\n" + "1cup=8fluid ounces\n\n" + "Enter the number of cup");
		numCup = Double.parseDouble(input);
		return numCup;
	}

	public static double getOunces(double numCup) {
		return numCup * 8;
	}

	public static void GetResult(double num1, double num2) {
		JOptionPane.showMessageDialog(null, num1 + " cups equals " + num2 + " fluid ounces");
	}
}
