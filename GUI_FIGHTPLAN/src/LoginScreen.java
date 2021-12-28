import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginScreen extends JFrame implements ActionListener{
	ButtonGroup bt;
	JButton enterbutton;
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	public LoginScreen() {
		 //stage 1
		setTitle("Flight Check-In-System");
		setLayout(new BorderLayout());
		setSize(450,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    //stage 2
		JPanel uppermainpanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		ImageIcon image=new ImageIcon("img/checkin.png");
		JLabel mainpanellabel=new JLabel(image);
		uppermainpanel.add(mainpanellabel);
		add(uppermainpanel,BorderLayout.NORTH);
		JPanel lowermainpanel=new JPanel(new GridLayout(3,1));
		JPanel lowermainpanel1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel lowermainpanel1label=new JLabel("To begin your check in, please select your preffered method");
		lowermainpanel1.add(lowermainpanel1label);
		lowermainpanel.add(lowermainpanel1);
		//
		JPanel buttonpanel=new JPanel(new GridLayout(1,3));
		JPanel buttonpanel1=new JPanel();
		buttonpanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel buttonpanel2=new JPanel();
		buttonpanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel buttonpanel3=new JPanel();
		buttonpanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		button1=new JRadioButton("Passport");
		buttonpanel1.add(button1);
		buttonpanel.add(buttonpanel1);
		button2=new JRadioButton("E-Ticket Number");
		buttonpanel2.add(button2);
		buttonpanel.add(buttonpanel2);
		button3=new JRadioButton("Booking Reference");
		buttonpanel3.add(button3);
		buttonpanel.add(buttonpanel3);
		lowermainpanel.add(buttonpanel);
		bt=new ButtonGroup();
		bt.add(button1);
		bt.add(button2);
		bt.add(button3);
		//
		JPanel enterpanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		enterbutton=new JButton("Enter");
		enterbutton.addActionListener(this);
		enterpanel.add(enterbutton);
		lowermainpanel.add(enterpanel);
		add(lowermainpanel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		LoginScreen sc=new LoginScreen();
		
	}

	public void actionPerformed(ActionEvent e) {
		dispose();
       	if(e.getSource()==enterbutton) {
       		if(button1.isSelected()) {
       			PassportMenu ps=new PassportMenu(this);
       			
       		}
       		else if(button2.isSelected()) {
       			ETicketMenu ticket=new ETicketMenu(this);
       		}
       		else if(button3.isSelected()) {
       			BookingPNRMenu pr=new BookingPNRMenu(this);
       		}
       	}
	}



			
}
