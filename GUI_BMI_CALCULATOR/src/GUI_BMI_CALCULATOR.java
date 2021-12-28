import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class GUI_BMI_CALCULATOR {

	public static void main(String[] args) {
		firstpage fp = new firstpage();
	}

}

class firstpage {
	private JFrame frame;
	private JLabel label;
	private JPanel panel1;
	private JPanel panel2;
	private ImageIcon image;
	private JButton button;

	public firstpage() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Body Mass Index (BMI)");
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image = new ImageIcon("img/pic 1.jpeg");
		label = new JLabel(image);
		panel1 = new JPanel();
		panel1.add(label);
		frame.add(panel1, BorderLayout.NORTH);
		button = new JButton("Click here know your BMI status");
		button.addActionListener(new inprogress());
		panel2 = new JPanel();
		panel2.add(button);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	private class inprogress implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				frame.dispose();
				PageInfo pg = new PageInfo();
			}

		}

	}
}
