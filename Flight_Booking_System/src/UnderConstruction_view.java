import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnderConstruction_view extends JFrame {
	public UnderConstruction_view() {
		setTitle("Main Menu");
		setSize(744, 319);
		setLocationRelativeTo(null);
		setVisible(true);
		ImageIcon image = new ImageIcon("img/under.jpg");

		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());

		JLabel error = new JLabel(image);
		pane.add(error);
		pack();
	}
}
