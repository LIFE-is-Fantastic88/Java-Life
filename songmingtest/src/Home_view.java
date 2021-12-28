import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home_view extends JFrame implements ActionListener{
	JPanel main = new JPanel(new GridLayout(5,0));
	private Controller_home controller = new Controller_home ();
	private JTextField txt_login,txt_password;
	private JButton btn_login;
	private FlightDes fd;
	public Home_view(FlightDes flightdes) {
		fd = flightdes;
		setTitle("Second screen");
		setSize(400, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		JLabel welcome = new JLabel("Welcome to XXX",SwingConstants.CENTER);
		welcome.setFont(new Font("Serif",Font.BOLD,24));
		main.add(welcome);
		
		JLabel lbl_login = new JLabel("Username  :      ");
		lbl_login.setFont(new Font("Serif", Font.BOLD ,24));
		txt_login = new JTextField(10);
		txt_login.setFont(new Font("Serif", Font.BOLD ,24));
		setLogin_Password(lbl_login,txt_login);
		
		JLabel lbl_password = new JLabel("Password   :      ");
		lbl_password.setFont(new Font("Serif", Font.BOLD ,24));
		txt_password = new JTextField(10);
		txt_password.setFont(new Font("Serif", Font.BOLD ,24));
		setLogin_Password(lbl_password,txt_password);
		
		JButton btn_login = new JButton("Log In");
		btn_login.setFont(new Font("Serif",Font.BOLD,18));
		
		btn_login.addActionListener(this);
		JPanel temp = new JPanel(new FlowLayout());
		temp.add(btn_login);
		main.add(temp);
		
		temp = new JPanel(new FlowLayout());
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(ActionEvent ->{
			dispose();
		});
		temp.add(btn_exit);
		main.add(temp);
		pane.add(main);
		
		
	}
	public void setLogin_Password(JLabel label,JTextField textfield){
		JPanel temp = new JPanel(new FlowLayout());
		temp.add(label);
		temp.add(textfield);
		main.add(temp);
		
	}
//	public static void main(String[] args) {
//		Home_view home_view = new Home_view(new FlightDes());
//		home_view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		home_view.setTitle("First screen");
//		home_view.setSize(400, 250);
//		home_view.setLocationRelativeTo(null);
//		home_view.setVisible(true);
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		controller.action(txt_login.getText(),fd);
		dispose();
	}

}
