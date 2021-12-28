import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class MabrurTravel extends JFrame implements ActionListener {
	JButton submitbutton;
	JButton cancelbutton;
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	JTextField text6;
	JTextField text8;
	JTextField text10;
	JTextField text12;
	JList list;
	JComboBox <String>box;
	ButtonGroup gp;
	JTextArea detaillabel;
	int room;
	
	
    public MabrurTravel() {
    	setTitle("Mabrur Travel & Tour");
    	setSize(700,800);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new BorderLayout());
    	JPanel upperpanel=new JPanel(new BorderLayout());
    	//
    	JPanel northpanel=new JPanel();
    	ImageIcon img=new ImageIcon("img/labtest3.png");
    	JLabel piclabel=new JLabel(img);
    	northpanel.add(piclabel);
    	upperpanel.add(northpanel,BorderLayout.NORTH);
    	JPanel midpanel=new JPanel(new BorderLayout());
    	//
    	JPanel westpanel=new JPanel(new GridLayout(4,1));
    	JPanel westpanel1=new JPanel();
    	JPanel westpanel2=new JPanel();
    	JPanel westpanel3=new JPanel();
    	JPanel westpanel4=new JPanel();
    	JLabel westlabel=new JLabel("Room Selection");
    	westpanel1.add(westlabel);
    	button1=new JRadioButton("2 person/room (RM500)");
    	button2=new JRadioButton("4 person/room (RM300)");
    	button3=new JRadioButton("8 person/room (RM200)");
    	
    	westpanel2.add(button1);
    	westpanel3.add(button2);
    	westpanel4.add(button3);
    	westpanel.add(westpanel1);
    	westpanel.add(westpanel2);
    	westpanel.add(westpanel3);
    	westpanel.add(westpanel4);
    	gp=new ButtonGroup();
    	gp.add(button1);
    	gp.add(button2);
    	gp.add(button3);
    	midpanel.add(westpanel,BorderLayout.WEST);
    	//
    	JPanel centerpanel=new JPanel(new GridLayout(6,2));
    	JPanel panel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	
    	JPanel panel3=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	
    	JPanel panel5=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JPanel panel6=new JPanel();
    	JPanel panel7=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JPanel panel8=new JPanel();
    	JPanel panel9=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JPanel panel10=new JPanel();
    	JPanel panel11=new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JPanel panel12=new JPanel();
    	
    	JLabel label1=new JLabel("Food selection");
    	JLabel label3=new JLabel("Ziarah Destination");
    	JLabel label5=new JLabel("Name:");
    	JLabel label7=new JLabel("Mobile No:");
    	JLabel label9=new JLabel("Number of days:");
    	JLabel label11=new JLabel("Number of person:");
    	panel1.add(label1);
    	panel3.add(label3);
    	panel5.add(label5);
    	panel7.add(label7);
    	panel9.add(label9);
    	panel11.add(label11);
    	
    	String [] food= {"Buffet (RM60/day)","Served (RM50/day)","Packed (RM30/day)"};
    	box=new JComboBox<String>(food);
    	
    	
    	String [] destination= {"Camel Farm RM90","dates Market RM70","Maqam baqi' RM70","Jabal Rahmah RM90","Jabal Uhud RM100","Qiblatain Mosque RM200","Quba' Mosque"};
    	list=new JList(destination);
    	JScrollPane panel4=new JScrollPane(list);
    	
    	
    	
    	text6=new JTextField(23);
    	text8=new JTextField(23);
    	text10=new JTextField(23);
    	text10.setText("0");
    	text12=new JTextField(23);
    	text12.setText("0");
    	
    	
    	panel6.add(text6);
    	panel8.add(text8);
    	panel10.add(text10);
    	panel12.add(text12);
    	
    	centerpanel.add(panel1);
    	centerpanel.add(box);
    	centerpanel.add(panel3);
    	centerpanel.add(panel4);
    	centerpanel.add(panel5);
    	centerpanel.add(panel6);
    	centerpanel.add(panel7);
    	centerpanel.add(panel8);
    	centerpanel.add(panel9);
    	centerpanel.add(panel10);
    	centerpanel.add(panel11);
    	centerpanel.add(panel12);
    	
    	midpanel.add(centerpanel,BorderLayout.CENTER);
    	//
    	JPanel southpanel=new JPanel();
    	JPanel buttonpanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
    	submitbutton=new JButton("Submit");
    	submitbutton.addActionListener(this);
    	cancelbutton=new JButton("Cancel");
    	cancelbutton.addActionListener(this);
    	buttonpanel.add(submitbutton);
    	buttonpanel.add(cancelbutton);
    	southpanel.add(buttonpanel);
    	midpanel.add(southpanel,BorderLayout.SOUTH);
    	
    	detaillabel=new JTextArea(10,61);
        JPanel lowerpanel=new JPanel();
    	lowerpanel.add(detaillabel);
    	add(upperpanel,BorderLayout.NORTH);
    	add(midpanel,BorderLayout.CENTER);
    	add(lowerpanel,BorderLayout.SOUTH);
    	
    	setVisible(true);
    	//

    }
	public static void main(String[] args) {
          MabrurTravel mb=new MabrurTravel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String [] food= {"Buffet (RM60/day)","Served (RM50/day)","Packed (RM30/day)"};
		String [] destination= {"Camel Farm RM90","dates Market RM70","Maqam baqi' RM70","Jabal Rahmah RM90","Jabal Uhud RM100","Qiblatain Mosque RM200","Quba' Mosque RM120"};
		if (e.getSource()==submitbutton) {
	    try {
		ArrayList <String> dahell=new ArrayList<String>();
		dahell.add("Charges for "+text12.getText()+" persons for "+text10.getText()+" days");
		dahell.add("====================");
		room=0;
		String str="";
		if(button1.isSelected()) {
			room=500;
			str="2 person/room (RM500)";
		}else if(button2.isSelected()) {
			room=300;
			str="4 person/room (RM300)";
		}else if(button3.isSelected()) {
			room=200;
			str="6 person/room (RM200)";
		}
		dahell.add("Room ("+str+") \t:RM"+Integer.toString((room*(Integer.parseInt(text12.getText())*Integer.parseInt(text10.getText()))))+".0");
		int foodprice=0;
		if(food[box.getSelectedIndex()].equals("Buffet (RM60/day)")) {
			foodprice=60;
		}else if(food[box.getSelectedIndex()].equals("Served (RM50/day)")) {
			foodprice=50;
		}else if(food[box.getSelectedIndex()].equals("Packed (RM30/day)")) {
			foodprice=30;
		}
		dahell.add("Food ("+food[box.getSelectedIndex()]+") \t\t:RM"+Integer.toString((foodprice*(Integer.parseInt(text12.getText())*Integer.parseInt(text10.getText()))))+".0");
		ArrayList <String> arr=(ArrayList<String>)list.getSelectedValuesList();
		int dprice=0;
		for(int z=0;z<arr.size();z++) {
			if(arr.get(z).equals(destination[0])){
				dprice+=90;
			}else if(arr.get(z).equals(destination[1])){
				dprice+=70;
			}else if(arr.get(z).equals(destination[2])){
				dprice+=70;
			}else if(arr.get(z).equals(destination[3])){
				dprice+=90;
			}else if(arr.get(z).equals(destination[4])){
				dprice+=100;
			}else if(arr.get(z).equals(destination[5])){
				dprice+=200;
			}else if(arr.get(z).equals(destination[6])){
				dprice+=120;
			}
		}
		dahell.add("Ziarah \t\t\t:RM"+Integer.toString((dprice*(Integer.parseInt(text12.getText())))));
		for(int z=0;z<arr.size();z++) {
			dahell.add(arr.get(z));
		}
		dahell.add("====================");
		dahell.add("Total \t\t\t:RM"+Integer.toString((room*(Integer.parseInt(text12.getText())*Integer.parseInt(text10.getText())))
				+(foodprice*(Integer.parseInt(text12.getText())))*Integer.parseInt(text10.getText())+(dprice*(Integer.parseInt(text12.getText())))));
		if(Integer.parseInt(text12.getText())>=5) {
			dahell.add("After 10% discount \t\t:RM"+Double.toString((((room*(Integer.parseInt(text12.getText())*Integer.parseInt(text10.getText())))
					+(foodprice*(Integer.parseInt(text12.getText())))*Integer.parseInt(text10.getText())+(dprice*(Integer.parseInt(text12.getText()))))*90)/100));
		}
		dahell.add("Quatation sent to "+text6.getText()+" at "+text8.getText());
		
			String fml="";
			for(int z=0;z<dahell.size();z++) {
				fml+=dahell.get(z)+"\n";
			}
			detaillabel.setText(fml);}catch (Exception shit) {
				ERRORPAGE PG=new ERRORPAGE();
			}
			
		}else if(e.getSource()==cancelbutton) {
			dispose();
		}
		
	}

}
