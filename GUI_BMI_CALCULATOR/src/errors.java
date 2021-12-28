import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class errors {
	private JButton button;
	private JFrame frame;

	public errors() {
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("Error");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel allpanel = new JPanel(new GridLayout(2, 1));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Please fill in all information");
		button = new JButton(" OK ");
		button.addActionListener(new renew());
		panel.add(label);
		panel1.add(button);
		allpanel.add(panel);
		allpanel.add(panel1);
		frame.add(allpanel);
		frame.setVisible(true);
	}

	private class renew implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				frame.dispose();
			}
		}

	}

}
