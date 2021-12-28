import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

public class View extends JFrame {
	
	SystemController control;
	private JComboBox<String> cmb_from, cmb_to, cmb_seat, cmb_seatnumber, cmb_time;
	private JTextField txt_day, txt_month, txt_year, txt_Rday, txt_Rmonth, txt_Ryear, txt_adult, txt_child, txt_infant,
			txtDate;
	private JButton btn_search, btn_return;
	ArrayList<String> countrylist = new ArrayList<String>();
	ArrayList<String> seatplace = new ArrayList<String>();
	ArrayList<String> seatclass = new ArrayList<String>();
	ArrayList<String> flighttime = new ArrayList<String>();
	boolean terminate = true;

	public View(SystemController systemController) {
		// TODO Auto-generated constructor stub
		control = systemController;
		countrylist.add("Penang");
		countrylist.add("Johor");
		countrylist.add("Ipoh");
		countrylist.add("Kota Kinabalu");
		countrylist.add("Kuching");
		countrylist.add("Miri");
		countrylist.add("Terengganu");
		countrylist.add("Singapura");

		seatplace.add("A01");
		seatplace.add("A02");
		seatplace.add("A03");
		seatplace.add("B01");
		seatplace.add("B02");
		seatplace.add("B03");
		seatplace.add("C01");
		seatplace.add("C02");
		seatplace.add("C03");
		seatplace.add("D01");
		seatplace.add("D02");
		seatplace.add("D03");

		seatclass.add("ECONOMY");
		seatclass.add("BUSINESS");
		seatclass.add("FIRST CLASS");

		flighttime.add("08:00");
		flighttime.add("10:00");
		flighttime.add("12:00");
		flighttime.add("14:00");
		flighttime.add("16:00");
		flighttime.add("18:00");
		flighttime.add("20:00");
		flighttime.add("22:00");
		flighttime.add("00:00");
	}

	public void option_menu() {
		JFrame pane = new JFrame();
		setTitle("OPTION");
		pane.setSize(300, 400);
		pane.setLocationRelativeTo(null);
		pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane.setVisible(true);

		pane.setLayout(new GridLayout(4, 0));

		JButton btn_searchFlight = new JButton("Search Flight");
		btn_searchFlight.setBackground(Color.CYAN);
		btn_searchFlight.setFont(new Font("Serif", Font.BOLD, 20));
		btn_searchFlight.addActionListener(ActionEvent -> {
			flight_menu();
			pane.dispose();
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
			control.setprogramterminate(terminate);
			pane.dispose();
		});
		pane.add(btn_searchFlight);
		pane.add(btn_checkIn);
		pane.add(btn_viewBoardingPass);
		pane.add(btn_exit);
	}

	public void flight_menu() {


		JFrame pane = new JFrame();
		pane.setTitle("Main Menu");
		pane.setSize(700, 500);
		pane.setLocationRelativeTo(null);
		pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane.setVisible(true);

		pane.setLayout(new GridLayout(8, 0));
		JPanel temp = new JPanel(new FlowLayout());
		temp = new JPanel(new FlowLayout());

		JLabel lbl_from = new JLabel("From  :     ");
		cmb_from = new JComboBox<String>();

		for (int i = 0; i < countrylist.size(); i++)
			cmb_from.addItem(countrylist.get(i));

		lbl_from.setFont(new Font("Serif", Font.BOLD, 18));
		cmb_from.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_from);
		temp.add(cmb_from);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_to = new JLabel("To    :     ");
		cmb_to = new JComboBox<String>();
		for (int i = 0; i < countrylist.size(); i++)
			cmb_to.addItem(countrylist.get(i));

		cmb_to.setFont(new Font("Serif", Font.BOLD, 18));
		lbl_to.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_to);
		temp.add(cmb_to);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_date = new JLabel("Departure Date  :");
		JTextField txtDate = new JTextField();
		txtDate.setBounds(101, 107, 86, 20);
		temp.add(txtDate);
		txtDate.setColumns(10);
		txtDate.setFont(new Font("Serif", Font.BOLD, 18));
		JButton btnNewButton = new JButton("date selection");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFrame f = new JFrame();
				txtDate.setText(new DatePicker(f).setPickedDate());
			}
		});
		btnNewButton.setBounds(223, 106, 27, 23);
		temp.add(btnNewButton);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());
		JLabel lbl_passenger = new JLabel("Type of Passenger :");
		lbl_passenger.setFont(new Font("Serif", Font.BOLD, 18));

		JRadioButton adultbutton = new JRadioButton(" Adult");
		adultbutton.setFont(new Font("Serif", Font.BOLD, 18));
		adultbutton.setSelected(true);
		JRadioButton Childbutton = new JRadioButton(" Child");
		Childbutton.setFont(new Font("Serif", Font.BOLD, 18));
		Childbutton.setSelected(true);
		JRadioButton Infantbutton = new JRadioButton(" Infant");
		Infantbutton.setFont(new Font("Serif", Font.BOLD, 18));
		Infantbutton.setSelected(true);

		ButtonGroup group = new ButtonGroup();
		group.add(Infantbutton);
		group.add(Childbutton);
		group.add(adultbutton);
		temp.add(lbl_passenger);
		temp.add(adultbutton);
		temp.add(Childbutton);
		temp.add(Infantbutton);

		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_seat = new JLabel("Seat Class  :");
		lbl_seat.setFont(new Font("Serif", Font.BOLD, 18));

		cmb_seat = new JComboBox<String>();// seat array
		cmb_seat.setFont(new Font("Serif", Font.BOLD, 18));
		for (int i = 0; i < seatclass.size(); i++)
			cmb_seat.addItem(seatclass.get(i));

		temp.add(lbl_seat);
		temp.add(cmb_seat);
		pane.add(temp);

		//
		temp = new JPanel(new FlowLayout());

		JLabel lbl_time = new JLabel("Flight Time  :");
		lbl_time.setFont(new Font("Serif", Font.BOLD, 18));

		cmb_time = new JComboBox<String>();// seat array
		cmb_time.setFont(new Font("Serif", Font.BOLD, 18));
		for (int i = 0; i < flighttime.size(); i++)
			cmb_time.addItem(flighttime.get(i));

		temp.add(lbl_time);
		temp.add(cmb_time);
		pane.add(temp);
		//
		temp = new JPanel(new FlowLayout());

		temp = new JPanel(new FlowLayout());

		JLabel lbl_seatno = new JLabel("Seat Number  :");
		lbl_seatno.setFont(new Font("Serif", Font.BOLD, 18));

		cmb_seatnumber = new JComboBox<String>();// seat array
		cmb_seatnumber.setFont(new Font("Serif", Font.BOLD, 18));
		for (int i = 0; i < seatplace.size(); i++)
			cmb_seatnumber.addItem(seatplace.get(i));

		temp.add(lbl_seatno);
		temp.add(cmb_seatnumber);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());
		btn_search = new JButton("Search Flight and Booking");
		btn_search.setFont(new Font("Serif", Font.BOLD, 18));
		btn_search.addActionListener(ActionEvent -> {
			control.setData(countrylist.get(cmb_from.getSelectedIndex()), countrylist.get(cmb_to.getSelectedIndex()),
					txtDate.getText(), seatclass.get(cmb_seat.getSelectedIndex()),
					seatplace.get(cmb_seatnumber.getSelectedIndex()), flighttime.get(cmb_time.getSelectedIndex()));

			if (control.availability() == true) {
				new BoardingPass_View(control);
			} else {
				control.run();
			}
			pane.dispose();

		});

		temp.add(btn_search);
		pane.add(temp);

	}

}
