import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenu_view extends JFrame implements ActionListener {
	private Controller_mainmenu controller = new Controller_mainmenu();
	private JComboBox<String> cmb_from, cmb_to, cmb_seat;
	private JTextField txt_day, txt_month, txt_year, txt_Rday, txt_Rmonth, txt_Ryear, txt_adult, txt_child, txt_infant;
	private JButton btn_search;
	private ArrayList<String> country = new ArrayList<String>();
	private ArrayList<String> seatclass = new ArrayList<String>();

	public MainMenu_view() {
		setTitle("Main Menu");
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setVisible(true);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(7, 0));

		JPanel temp = new JPanel(new FlowLayout());

		country.add("Johor Bahru");
		country.add("Kota Kinabalu");
		country.add("Kuala Lumpur");
		country.add("Kuching");
		country.add("Miri");
		country.add("Penang");
		country.add("Ipoh");
		country.add("Bintulu");

		JLabel lbl_from = new JLabel("From  :     ");
		cmb_from = new JComboBox<String>();
		for (int i = 0; i < country.size(); i++)
			cmb_from.addItem(country.get(i));

		lbl_from.setFont(new Font("Serif", Font.BOLD, 18));
		cmb_from.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_from);
		temp.add(cmb_from);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_to = new JLabel("To    :     ");
		cmb_to = new JComboBox<String>();
		for (int i = 0; i < country.size(); i++)
			cmb_to.addItem(country.get(i));

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
		JLabel lbl_passenger = new JLabel("No. of Passengers  :");
		lbl_passenger.setFont(new Font("Serif", Font.BOLD, 18));

		txt_adult = new JTextField(2);
		txt_adult.setFont(new Font("Serif", Font.BOLD, 18));

		JLabel lbl_adult = new JLabel(" Adult");
		lbl_adult.setFont(new Font("Serif", Font.BOLD, 18));

		txt_child = new JTextField(2);
		txt_child.setFont(new Font("Serif", Font.BOLD, 18));

		JLabel lbl_child = new JLabel(" Child");
		lbl_child.setFont(new Font("Serif", Font.BOLD, 18));

		txt_infant = new JTextField(2);
		txt_infant.setFont(new Font("Serif", Font.BOLD, 18));

		JLabel lbl_infant = new JLabel(" Infant");
		lbl_infant.setFont(new Font("Serif", Font.BOLD, 18));

		temp.add(lbl_passenger);
		temp.add(txt_adult);
		temp.add(lbl_adult);
		temp.add(txt_child);
		temp.add(lbl_child);
		temp.add(txt_infant);
		temp.add(lbl_infant);
		pane.add(temp);

		temp = new JPanel(new FlowLayout());

		JLabel lbl_seat = new JLabel("Seat Class  :");
		lbl_seat.setFont(new Font("Serif", Font.BOLD, 18));

		cmb_seat = new JComboBox<String>();// seat array
		cmb_seat.setFont(new Font("Serif", Font.BOLD, 18));

		seatclass.add("");
		seatclass.add("ECONOMY CLASS");
		seatclass.add("BUSINESS CLASS");
		seatclass.add("FIRST CLASS");

		for (int i = 0; i < seatclass.size(); i++)
			cmb_seat.addItem(seatclass.get(i));

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

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		controller.action(cmb_from.getSelectedIndex(), cmb_to.getSelectedIndex(), txt_day.getText(),
				txt_month.getText(), txt_year.getText(), txt_Rday.getText(), txt_Rmonth.getText(), txt_Ryear.getText(),
				txt_adult.getText(), txt_child.getText(), txt_infant.getText(), cmb_seat.getSelectedIndex(), this);
	}

}
