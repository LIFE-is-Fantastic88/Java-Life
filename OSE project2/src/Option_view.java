import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Option_view extends JFrame {
	public Option_view() {
		setTitle("Second screen");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setVisible(true);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 0));
		Controller_mainmenu control = new Controller_mainmenu();
		JButton btn_searchFlight = new JButton("Search Flight");
		btn_searchFlight.addActionListener(ActionEvent -> {
			control.run();
			dispose();
		});

		JButton btn_checkIn = new JButton("Check-in");
		btn_checkIn.addActionListener(ActionEvent -> {
			UnderConstruction_view();
		});

		JButton btn_viewBoardingPass = new JButton("View Boarding Pass");
		btn_viewBoardingPass.addActionListener(ActionEvent -> {
			UnderConstruction_view();
		});
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(ActionEvent -> {

			dispose();
		});
		pane.add(btn_searchFlight);
		pane.add(btn_checkIn);
		pane.add(btn_viewBoardingPass);
		pane.add(btn_exit);
	}

	public void UnderConstruction_view() {
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
