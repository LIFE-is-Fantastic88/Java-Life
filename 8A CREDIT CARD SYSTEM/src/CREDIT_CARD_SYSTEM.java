import javax.swing.JOptionPane;

public class CREDIT_CARD_SYSTEM {

	public static void main(String[] args) {
		double salary;
		int creditRating;
		
		String input;
		input = JOptionPane.showInputDialog("What is your annual salary");
		salary = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(
				"On the scale of 1 to 10 ,what is your credit rating?\n" + "10 is excellent, 1 is bad");
		creditRating = Integer.parseInt(input);
		if (salary >= 20000 && creditRating >= 7) {
			qualified();
		} else {
			inqualified();
		}

	}

	public static void qualified() {
		JOptionPane.showMessageDialog(null, "Congratulation, You are qualify for a credit card");
	}

	public static void inqualified() {
		JOptionPane.showMessageDialog(null, "sorry, You are inqualify for a credit card");
	}
}
