import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Option_view extends JFrame {
	public Option_view(Controller_homepage controller) {
		setTitle("OPTION");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 0));

		JButton btn_searchFlight = new JButton("Search Flight");
		btn_searchFlight.setBackground(Color.CYAN);
		btn_searchFlight.setFont(new Font("Serif", Font.BOLD, 20));
		btn_searchFlight.addActionListener(ActionEvent -> {
			new MainMenu_view(controller);
			dispose();
		});

		JButton btn_checkIn = new JButton("Check-in");
		btn_checkIn.setBackground(Color.LIGHT_GRAY);
		btn_checkIn.setFont(new Font("Serif", Font.BOLD, 20));
		btn_checkIn.addActionListener(ActionEvent -> {
			new UnderConstruction_view();
		});

		JButton btn_viewBoardingPass = new JButton("View Boarding Pass");
		btn_viewBoardingPass.setBackground(Color.orange);
		btn_viewBoardingPass.setFont(new Font("Serif", Font.BOLD, 20));
		btn_viewBoardingPass.addActionListener(ActionEvent -> {
			new UnderConstruction_view();
		});
		JButton btn_exit = new JButton("Exit");
		btn_exit.setBackground(Color.PINK);
		btn_exit.setFont(new Font("Serif", Font.BOLD, 20));
		btn_exit.addActionListener(ActionEvent -> {
			new Home_view(controller.getFlightDestination());
			dispose();
		});
		pane.add(btn_searchFlight);
		pane.add(btn_checkIn);
		pane.add(btn_viewBoardingPass);
		pane.add(btn_exit);

	}

}
