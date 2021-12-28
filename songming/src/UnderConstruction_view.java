import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnderConstruction_view extends JFrame{
	public UnderConstruction_view() {
		setTitle("Main Menu");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JLabel error = new JLabel("Under Construction!");
		pane.add(error);
	}
}
