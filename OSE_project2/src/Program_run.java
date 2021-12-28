import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Program_run extends JFrame {
	public Program_run() {
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());

		ImageIcon image = new ImageIcon("img/flight.jpg");
		JLabel piclabel = new JLabel(image);
		pane.add(piclabel);

		JButton btn_welcome = new JButton("Welcome to FLYASIA");
		btn_welcome.setFont(new Font("Serif", Font.BOLD, 18));
		btn_welcome.setBackground(Color.LIGHT_GRAY);
		btn_welcome.addActionListener(ActionEvent -> {
			new Home_view(new FlightDestination());
			dispose();
		});

		pane.add(btn_welcome);

		pack();
	}

	public static void main(String[] args) {
		Program_run frame = new Program_run();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flight Check-In System");
		frame.setSize(1000, 790);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
