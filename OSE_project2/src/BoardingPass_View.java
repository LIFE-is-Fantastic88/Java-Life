import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoardingPass_View extends JFrame {
	
	public BoardingPass_View(Controller_flight_booking c) {
		
		
		
		
		setTitle("Printing Boarding Pass");
		setSize(850, 225);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(new BorderLayout());
		//1part
		
		JPanel upperpanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		ImageIcon ic=new ImageIcon("img/logoMAs.png");
		ImageIcon ip=new ImageIcon("img/barcode.png");
		JLabel piclabel1=new JLabel(ic);
		JLabel piclabel2=new JLabel(c.getSeatClass());
		Font classlabel=new Font("Serif", Font.BOLD, 16);
		piclabel2.setFont(classlabel);
		piclabel2.setForeground(Color.BLACK);
		JLabel piclabel3=new JLabel(ip);
		upperpanel.add(piclabel1);
		upperpanel.add(piclabel2);
		upperpanel.add(piclabel3);
		upperpanel.setBackground(Color.WHITE);
		add(upperpanel,BorderLayout.NORTH);
		//2part
		JPanel middlepanel=new JPanel(new GridLayout(2,3));
		JPanel middlepanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel middlepanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel middlepanel3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel middlepanel4=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel middlepanel5=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel middlepanel6=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Font fontLabel = new Font("Serif", Font.PLAIN, 14);
        Font fontValue = new Font("Serif", Font.PLAIN, 14);
        JLabel label1=new JLabel("Name");
		label1.setFont(fontLabel);
		label1.setForeground(Color.BLUE);
		middlepanel1.add(label1);
		JLabel label2=new JLabel("Frequent Flyer Number");
		label2.setFont(fontLabel);
		label2.setForeground(Color.BLUE);
		middlepanel2.add(label2);
		JLabel label3=new JLabel("Security Number");
		label3.setFont(fontLabel);
		label3.setForeground(Color.BLUE);
		middlepanel3.add(label3);
		JLabel label4=new JLabel(c.getName());
		label4.setFont(fontValue);
		label4.setForeground(Color.BLACK);
		middlepanel4.add(label4);
		JLabel label5=new JLabel("None");
		label5.setFont(fontValue);
		label5.setForeground(Color.BLACK);
		middlepanel5.add(label5);
		
		JLabel label6=new JLabel("None");
		label6.setFont(fontValue);
		label6.setForeground(Color.BLACK);
		middlepanel6.add(label6);
		middlepanel.add(middlepanel1);
		middlepanel.add(middlepanel2);
		middlepanel.add(middlepanel3);
		middlepanel.add(middlepanel4);
		middlepanel.add(middlepanel5);
		middlepanel.add(middlepanel6);
		add(middlepanel,BorderLayout.CENTER);
		//3part
		JPanel lowerpanel=new JPanel(new GridLayout(4,6));
		JPanel lowerpanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel4=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel5=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel6=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel7=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel8=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel9=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel10=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel11=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel12=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel13=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel14=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel15=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel16=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel17=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel18=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel19=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel20=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel21=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel22=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel23=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerpanel24=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labela1=new JLabel("From");
		labela1.setFont(fontLabel);
		labela1.setForeground(Color.BLUE);
		JLabel labela2=new JLabel("To");
		labela2.setFont(fontLabel);
		labela2.setForeground(Color.BLUE);
		JLabel labela3=new JLabel("SSR");
		labela3.setFont(fontLabel);
		labela3.setForeground(Color.BLUE);
		JLabel labela4=new JLabel("Flight Number");
		labela4.setFont(fontLabel);
		labela4.setForeground(Color.BLUE);
		JLabel labela5=new JLabel("Date");
		labela5.setFont(fontLabel);
		labela5.setForeground(Color.BLUE);
		JLabel labela6=new JLabel("Departure Time");
		labela6.setFont(fontLabel);
		labela6.setForeground(Color.BLUE);
		JLabel labela7=new JLabel(c.getDepart());
		labela7.setFont(fontValue);
		labela7.setForeground(Color.BLACK);
		JLabel labela8=new JLabel(c.getArrival());
		labela8.setFont(fontValue);
		labela8.setForeground(Color.BLACK);
		JLabel labela9=new JLabel("None");
		labela9.setFont(fontValue);
		labela9.setForeground(Color.BLACK);
		JLabel labela10=new JLabel(c.getFlightNo());
		labela10.setFont(fontValue);
		labela10.setForeground(Color.BLACK);
		JLabel labela11=new JLabel(c.getDate());
		labela11.setFont(fontValue);
		labela11.setForeground(Color.BLACK);
		JLabel labela12=new JLabel(c.getTime());
		labela12.setFont(fontValue);
		labela12.setForeground(Color.BLACK);
		JLabel labela13=new JLabel("Gate");
		labela13.setFont(fontLabel);
		labela13.setForeground(Color.BLUE);
		JLabel labela14=new JLabel("Gate Opens Till");
		labela14.setFont(fontLabel);
		labela14.setForeground(Color.BLUE);
		JLabel labela15=new JLabel("Class");
		labela15.setFont(fontLabel);
		labela15.setForeground(Color.BLUE);
		JLabel labela16=new JLabel("PNR");
		labela16.setFont(fontLabel);
		labela16.setForeground(Color.BLUE);
		JLabel labela17=new JLabel("Seat");
		labela17.setFont(fontLabel);
		labela17.setForeground(Color.BLUE);
		JLabel labela18=new JLabel("E-Ticket Number");
		labela18.setFont(fontLabel);
		labela18.setForeground(Color.BLUE);
		JLabel labela19=new JLabel(Character.toString(c.getGate()));
		labela19.setFont(fontValue);
		labela19.setForeground(Color.BLACK);
		JLabel labela20=new JLabel(c.getBoardTill());
		labela20.setFont(fontValue);
		labela20.setForeground(Color.BLACK);
		JLabel labela21=new JLabel("PLATINUM");
		labela21.setFont(fontValue);
		labela21.setForeground(Color.BLACK);
		JLabel labela22=new JLabel("None");
		labela22.setFont(fontValue);
		labela22.setForeground(Color.BLACK);
		JLabel labela23=new JLabel(c.getSeat());
		labela23.setFont(fontValue);
		labela23.setForeground(Color.BLACK);
		JLabel labela24=new JLabel("None");
		labela24.setFont(fontValue);
		labela24.setForeground(Color.BLACK);
		lowerpanel1.add(labela1);
		lowerpanel2.add(labela2);
		lowerpanel3.add(labela3);
		lowerpanel4.add(labela4);
		lowerpanel5.add(labela5);
		lowerpanel6.add(labela6);
		lowerpanel7.add(labela7);
		lowerpanel8.add(labela8);
		lowerpanel9.add(labela9);
		lowerpanel10.add(labela10);
		lowerpanel11.add(labela11);
		lowerpanel12.add(labela12);
		lowerpanel13.add(labela13);
		lowerpanel14.add(labela14);
		lowerpanel15.add(labela15);
		lowerpanel16.add(labela16);
		lowerpanel17.add(labela17);
		lowerpanel18.add(labela18);
		lowerpanel19.add(labela19);
		lowerpanel20.add(labela20);
		lowerpanel21.add(labela21);
		lowerpanel22.add(labela22);
		lowerpanel23.add(labela23);
		lowerpanel24.add(labela24);
		lowerpanel.add(lowerpanel1);
		lowerpanel.add(lowerpanel2);
		lowerpanel.add(lowerpanel3);
		lowerpanel.add(lowerpanel4);
		lowerpanel.add(lowerpanel5);
		lowerpanel.add(lowerpanel6);
		lowerpanel.add(lowerpanel7);
		lowerpanel.add(lowerpanel8);
		lowerpanel.add(lowerpanel9);
		lowerpanel.add(lowerpanel10);
		lowerpanel.add(lowerpanel11);
		lowerpanel.add(lowerpanel12);
		lowerpanel.add(lowerpanel13);
		lowerpanel.add(lowerpanel14);
		lowerpanel.add(lowerpanel15);
		lowerpanel.add(lowerpanel16);
		lowerpanel.add(lowerpanel17);
		lowerpanel.add(lowerpanel18);
		lowerpanel.add(lowerpanel19);
		lowerpanel.add(lowerpanel20);
		lowerpanel.add(lowerpanel21);
		lowerpanel.add(lowerpanel22);
		lowerpanel.add(lowerpanel23);
		lowerpanel.add(lowerpanel24);
		add(lowerpanel,BorderLayout.SOUTH);
		pack();
	}
}
