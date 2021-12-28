import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Option_view extends JFrame{
	public Option_view(Controller_home controller) {
		setTitle("Second screen");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4,0));
		
		JButton btn_searchFlight = new JButton("Search Flight");
		btn_searchFlight.addActionListener(ActionEvent ->{
			new MainMenu_view(controller);
			dispose();
		});
		
		JButton btn_checkIn = new JButton("Check-in");
		btn_checkIn.addActionListener(ActionEvent -> {
			new UnderConstruction_view();
		});
		
		JButton btn_viewBoardingPass = new JButton("View Boarding Pass");
		btn_viewBoardingPass.addActionListener(ActionEvent -> {
			new UnderConstruction_view();
		});
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(ActionEvent -> {
			new Home_view(controller.getFLightdes());
			dispose();
		});
		pane.add(btn_searchFlight);
		pane.add(btn_checkIn);
		pane.add(btn_viewBoardingPass);
		pane.add(btn_exit);
	}

}
