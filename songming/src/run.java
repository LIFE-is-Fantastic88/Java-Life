import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class run extends JFrame{
	public run() {
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		JButton btn_welcome = new JButton("Welcome to XXX");
		btn_welcome.addActionListener(ActionEvent ->{
			new Home_view(new FlightDes());
			dispose();
		});
		pane.add(btn_welcome);
	}
	public static void main(String[] args) {
		run frame = new run();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flight Check-In System");
		frame.setSize(200, 80);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
