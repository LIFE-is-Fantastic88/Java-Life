import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Flight_view  extends JFrame implements ActionListener{
	private Controller_flight controller = new Controller_flight();
	private JLabel txt_from,txt_to,txt_Date,txt_Price;
	private JComboBox<String> cmb_time,cmb_selectSeat,cmb_selectRow;
	private JButton btn_buy;
	private JPanel main = new JPanel(new FlowLayout());
	private Controller_mainmenu c;
	private ArrayList<String> time=new ArrayList<String>();
	
	public Flight_view(Controller_mainmenu controller) {
		setTitle("Second screen");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		c = controller;
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(6,0));
		
		main = new JPanel(new FlowLayout());
		txt_from = new JLabel(controller.getFrom());
		txt_from.setFont(new Font("Serif",Font.BOLD,18));
		main.add(txt_from);
		
		JLabel lbl_to = new JLabel(" to ");
		lbl_to.setFont(new Font("Serif",Font.BOLD,18));
		main.add(lbl_to);
		
		txt_to = new JLabel(controller.getTo());
		txt_to.setFont(new Font("Serif",Font.BOLD,18));
		main.add(txt_to);
		pane.add(main);
		
		main = new JPanel(new FlowLayout());
		txt_Date = new JLabel(controller.getDate());
		txt_Date.setFont(new Font("Serif",Font.BOLD,18));
		main.add(txt_Date);
		pane.add(main);
		time.add("08:00");
		time.add("10:00");
		time.add("12:00");
		time.add("14:00");
		time.add("16:00");
		time.add("18:00");
		time.add("20:00");
		time.add("22:00");
		time.add("00:00");
		main = new JPanel(new FlowLayout());
		cmb_time = new JComboBox<String>();
		for(int i=0;i<time.size();i++) 
			cmb_time.addItem(time.get(i));
		cmb_time.setFont(new Font("Serif",Font.BOLD,18));
		cmb_selectRow = new JComboBox<String>();
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("A");
		temp.add("B");
		temp.add("C");
		temp.add("D");
		temp.add("E");
		for(int i=0;i<temp.size();i++)
			cmb_selectRow.addItem(temp.get(i));
		main.add(cmb_time);
		pane.add(main);
		
		main = new JPanel(new FlowLayout());
		txt_Price = new JLabel(controller.getPrice()+".00");
		txt_Price.setFont(new Font("Serif",Font.BOLD,18));
		main.add(txt_Price);
		pane.add(main);
		
		main = new JPanel(new FlowLayout());
		cmb_selectRow.setFont(new Font("Serif",Font.BOLD,18));
		cmb_selectSeat = new JComboBox<String>();
		cmb_selectSeat.setFont(new Font("Serif",Font.BOLD,18));
	}
}
