import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class error extends JFrame{
	public error() {
		setTitle("Main Menu");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JLabel error = new JLabel("There is a mistake and please key in your value again!");
		pane.add(error);
	}
}
