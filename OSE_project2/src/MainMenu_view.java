import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu_view extends JFrame implements ActionListener {
	private Controller_mainmenu controller = new Controller_mainmenu();
	private JComboBox<String> cmb_from, cmb_to, cmb_seat;
	private JTextField txt_day, txt_month, txt_year, txt_Rday, txt_Rmonth, txt_Ryear, txt_adult, txt_child, txt_infant;
	private JButton btn_search, btn_return;
	private Controller_homepage c;
	private Controller_homepage homecontrol=new Controller_homepage();
	public MainMenu_view(Controller_homepage controller) {
		this.c = controller;
		setTitle("Main Menu");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(8, 0));
		JPanel temp = new JPanel(new FlowLayout());
		temp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btn_return = new JButton("RETURN");
		btn_return.addActionListener(ActionEvent -> {
			new Option_view(homecontrol);
			dispose();
		});
		temp.add(btn_return);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_from = new JLabel("From  :     ");
		cmb_from = new JComboBox<String>();
		for (int i = 0; i < this.controller.getCountryList().size(); i++)
			cmb_from.addItem(this.controller.getCountryList().get(i));

		lbl_from.setFont(new Font("Serif", Font.BOLD, 18));
		cmb_from.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_from);
		temp.add(cmb_from);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_to = new JLabel("To    :     ");
		cmb_to = new JComboBox<String>();
		for (int i = 0; i < this.controller.getCountryList().size(); i++)
			cmb_to.addItem(this.controller.getCountryList().get(i));

		cmb_to.setFont(new Font("Serif", Font.BOLD, 18));
		lbl_to.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_to);
		temp.add(cmb_to);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_date = new JLabel("Departure Date  :");
		lbl_date.setFont(new Font("Serif", Font.BOLD, 18));

		txt_day = new JTextField(2);
		txt_day.setFont(new Font("Serif", Font.BOLD, 18));

		JLabel lbl_slash = new JLabel("/");
		lbl_slash.setFont(new Font("Serif", Font.BOLD, 18));

		txt_month = new JTextField(2);
		txt_month.setFont(new Font("Serif", Font.BOLD, 18));

		txt_year = new JTextField(4);
		txt_year.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_date);
		temp.add(txt_day);
		temp.add(lbl_slash);

		lbl_slash = new JLabel("/");
		lbl_slash.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(txt_month);
		temp.add(lbl_slash);
		temp.add(txt_year);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());
		JLabel lbl_Rdate = new JLabel("Return Date  :");
		lbl_Rdate.setFont(new Font("Serif", Font.BOLD, 18));

		txt_Rday = new JTextField(2);
		txt_Rday.setFont(new Font("Serif", Font.BOLD, 18));

		lbl_slash = new JLabel("/");
		lbl_slash.setFont(new Font("Serif", Font.BOLD, 18));

		txt_Rmonth = new JTextField(2);
		txt_Rmonth.setFont(new Font("Serif", Font.BOLD, 18));

		txt_Ryear = new JTextField(4);
		txt_Ryear.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_Rdate);
		temp.add(txt_Rday);
		temp.add(lbl_slash);
		temp.add(txt_Rmonth);

		lbl_slash = new JLabel("/");
		lbl_slash.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_slash);
		temp.add(txt_Ryear);
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
		for (int i = 0; i < this.controller.getSeatClassList().size(); i++)
			cmb_seat.addItem(this.controller.getSeatClassList().get(i).getClassName());

		temp.add(lbl_seat);
		temp.add(cmb_seat);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		btn_search = new JButton("Search Flight");
		btn_search.setFont(new Font("Serif", Font.BOLD, 18));
		btn_search.addActionListener(this);

		temp.add(btn_search);
		pane.add(temp);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		controller.action(cmb_from.getSelectedIndex(), cmb_to.getSelectedIndex(), txt_day.getText(),
				txt_month.getText(), txt_year.getText(), txt_Rday.getText(), txt_Rmonth.getText(), txt_Ryear.getText(),

				cmb_seat.getSelectedIndex(), this, c);

	}
}
