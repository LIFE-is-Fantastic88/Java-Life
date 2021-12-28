import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoardingPass_view extends JFrame implements ActionListener{
	
	public BoardingPass_view(Controller_flight c) {
		setTitle("FLIGHT TICKET BOOKING");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5,0));
		
		JPanel main = new JPanel(new FlowLayout());
		JLabel lbl_board = new JLabel("Boarding Pass");
		lbl_board.setFont(new Font("Serif",Font.BOLD,25));
		main.add(lbl_board);
		pane.add(main);
		
		main = new JPanel(new GridLayout(0,2));
		JPanel a = new JPanel(new BorderLayout());
		JLabel lbl_class = new JLabel("Class");
		lbl_class.setFont(new Font("Serif",Font.PLAIN,18));
		JLabel txt_class = new JLabel(c.getSeatClass());
		txt_class.setFont(new Font("Serif",Font.BOLD,18));
		a.add(lbl_class,BorderLayout.NORTH);
		a.add(txt_class,BorderLayout.CENTER);
		main.add(a);
		
		a = new JPanel(new BorderLayout());
		JLabel lbl_name = new JLabel("Name");
		lbl_name.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_name = new JLabel(c.getName());
		txt_name.setFont(new Font("Serif",Font.BOLD,18));
		a.add(lbl_name,BorderLayout.NORTH);
		a.add(txt_name,BorderLayout.CENTER);
		main.add(a);
		pane.add(main);
		
		main = new JPanel(new GridLayout(0,2));
		a = new JPanel(new BorderLayout());
		JLabel lbl_from = new JLabel("From");
		lbl_from.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_from = new JLabel(c.getFrom());
		txt_from.setFont(new Font("Serif",Font.BOLD,18));
		a.add(lbl_from,BorderLayout.NORTH);
		a.add(txt_from,BorderLayout.CENTER);
		main.add(a);
		
		a = new JPanel(new BorderLayout());
		JLabel lbl_to = new JLabel("To");
		lbl_to.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_to = new JLabel(c.getTo());
		txt_to.setFont(new Font("Serif",Font.BOLD,18));
		a.add(lbl_to,BorderLayout.NORTH);
		a.add(txt_to,BorderLayout.CENTER);
		main.add(a);
		pane.add(main);
		
		main = new JPanel(new GridLayout(0,3));
		JPanel temp = new JPanel(new BorderLayout());
		JLabel lbl_date = new JLabel("Date");
		lbl_date.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_date = new JLabel(c.getDate());
		txt_date.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_date,BorderLayout.NORTH);
		temp.add(txt_date,BorderLayout.CENTER);
		main.add(temp);
		
		temp = new JPanel(new BorderLayout());
		JLabel lbl_time = new JLabel("Time");
		lbl_time.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_time = new JLabel(c.getTime());
		txt_time.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_time,BorderLayout.NORTH);
		temp.add(txt_time,BorderLayout.CENTER);
		main.add(temp);
		
		temp = new JPanel(new BorderLayout());
		JLabel lbl_gate = new JLabel("Gate");
		lbl_gate.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_gate = new JLabel(Character.toString(c.getGate()));
		txt_gate.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_gate,BorderLayout.NORTH);
		temp.add(txt_gate,BorderLayout.CENTER);
		main.add(temp);
		pane.add(main);
		
		temp = new JPanel(new BorderLayout());
		JLabel lbl_flight = new JLabel("Flight");
		lbl_flight.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_flight = new JLabel(c.getFlightNum());
		txt_flight.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_flight,BorderLayout.NORTH);
		temp.add(txt_flight,BorderLayout.CENTER);
		main.add(temp);
		
		temp = new JPanel(new BorderLayout());
		JLabel lbl_seat = new JLabel("Seat");
		lbl_seat.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_seat = new JLabel(c.getSeat());
		txt_seat.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_seat,BorderLayout.NORTH);
		temp.add(txt_seat,BorderLayout.CENTER);
		main.add(temp);
		
		temp = new JPanel(new BorderLayout());
		JLabel lbl_boardTill = new JLabel("Board till");
		lbl_boardTill.setFont(new Font("Serif",Font.BOLD,18));
		JLabel txt_boardTill = new JLabel(c.getBoardTill());
		txt_boardTill.setFont(new Font("Serif",Font.BOLD,18));
		temp.add(lbl_boardTill,BorderLayout.NORTH);
		temp.add(txt_boardTill,BorderLayout.CENTER);
		main.add(temp);
		pane.add(main);
		
		main = new JPanel(new FlowLayout());
		JButton btn_home = new JButton("HOME");
		btn_home.addActionListener(ActionEvent -> {
			new Home_view(c.getFlightDes());
			dispose();
		});
		main.add(btn_home);
		pane.add(main);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		dispose();
	}
	
}
