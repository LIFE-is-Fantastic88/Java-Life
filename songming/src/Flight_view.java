import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Flight_view extends JFrame implements ActionListener{
	private Controller_flight controller = new Controller_flight();
	private JLabel txt_from,txt_to,txt_Date,txt_Price;
	private JComboBox<String> cmb_time,cmb_selectSeat,cmb_selectRow;
	private JButton btn_buy;
	private JPanel main = new JPanel(new FlowLayout());
	private Controller_mainmenu c;
	private SeatClass seatClass = new SeatClass();
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
		
		main = new JPanel(new FlowLayout());
		cmb_time = new JComboBox<String>();
		for(int i=0;i<this.controller.getPlaneList().size();i++) 
			cmb_time.addItem(this.controller.getPlaneList().get(i).getTime());
		cmb_time.setFont(new Font("Serif",Font.BOLD,18));
		cmb_selectRow = new JComboBox<String>();
		ArrayList<Row> temp = seatClass.getRow();
		for(int i=0;i<temp.size();i++)
			cmb_selectRow.addItem(temp.get(i).getRowNumber());
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
		
		cmb_selectRow.addActionListener(actionEvent ->{
			ArrayList<Seat> temp1 = controller.getflightdes().getFlightList().get(0).getPlaneList().get(cmb_time.getSelectedIndex()).getSeatClassList().get(controller.getSeatClass()).getRow().get(cmb_selectRow.getSelectedIndex()).getSeat();
			for(int i=0;i<temp1.size();i++)
				if(!temp1.get(i).getAvailability())
					cmb_selectSeat.addItem(temp1.get(i).getSeatNum());
		});
		JLabel lbl_row = new JLabel(" row ");
		lbl_to.setFont(new Font("Serif",Font.BOLD,18));
		main.add(lbl_row);
		
		main.add(cmb_selectRow);

		JLabel lbl_seat = new JLabel(" Seat ");
		lbl_to.setFont(new Font("Serif",Font.BOLD,18));
		main.add(lbl_seat);
		
		main.add(cmb_selectSeat);
		
		pane.add(main);
		
		main = new JPanel(new FlowLayout());
		btn_buy = new JButton("Buy");
		btn_buy.setFont(new Font("Serif",Font.BOLD,18));
		btn_buy.addActionListener(this);
		main.add(btn_buy);
		pane.add(main);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.controller.action(cmb_time.getSelectedIndex(),this,c,cmb_selectRow.getSelectedIndex(),cmb_selectSeat.getSelectedIndex());
	}
}
