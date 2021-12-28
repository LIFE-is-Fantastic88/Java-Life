
import javax.swing.JOptionPane;

public class ErrorChecking{
	
	public void error() {
		JOptionPane.showMessageDialog(null, "There is a mistake and please key in your value again", "ERROR",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public void success() {
		JOptionPane.showMessageDialog(null, "Your flight ticket is successfully booked", "BOOKING SUCCESSFUL",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
