import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class program_start extends JFrame {
	public program_start() {
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		JButton btn_welcome = new JButton("Welcome to fucker");
		btn_welcome.addActionListener(ActionEvent ->{
			new Option_view();
			dispose();
		});
		pane.add(btn_welcome);
	}
	public static void main(String[] args) {
		program_start frame = new program_start();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flight Check-In System");
		frame.setSize(200, 80);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
