import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI_COLOURS {

	public static void main(String[] args) {
		color mycolor=new color();

	}

}
class color extends JFrame{
	private JPanel panel;
	private JLabel label;
    private JButton bluebutton;
	private JButton yellowbutton;
	private JButton redbutton;
	 public color(){
		 setTitle("COLORS");
		 setSize(250,125);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setColor();
		 add(panel);
		 setLayout(new FlowLayout(FlowLayout.CENTER));
		 add(bluebutton,BorderLayout.NORTH);
		 add(yellowbutton,BorderLayout.WEST);
		 add(redbutton,BorderLayout.EAST);
		 setVisible(true);
	 }
	 void setColor() {
		 panel=new JPanel();
		 label=new JLabel("Click a button to selct a colors");
		 bluebutton=new JButton("BLUE");
		 bluebutton.addActionListener(new JButtonBlue());
		 yellowbutton=new JButton("YELLOW");
		 yellowbutton.addActionListener(new JButtonYellow());
		 redbutton=new JButton("RED");
		 redbutton.addActionListener(new JButtonRed());
		
		 panel.add(label);
		 panel.add(bluebutton);
		 panel.add(yellowbutton);
		 panel.add(redbutton);
		
	 }
	 private class JButtonBlue implements ActionListener{
		public void actionPerformed(ActionEvent e) {
           		panel.setBackground(Color.BLUE);	
           		label.setForeground(Color.CYAN);
           		String str=e.getActionCommand();
           		if(str.equals("BLUE")) {
           			JOptionPane.showMessageDialog(null, "YOU HAVE CLICK BLUE BUTTON");
           		}
		}
		 
	 }
	 private class JButtonYellow implements ActionListener{
			public void actionPerformed(ActionEvent e) {
	           		panel.setBackground(Color.yellow);	
	           		label.setForeground(Color.BLUE);
	           		String str=e.getActionCommand();
	           		if(str.equals("YELLOW")) {
	           			JOptionPane.showMessageDialog(null, "YOU HAVE CLICK YELLOW BUTTON");
	           		}
			}
			 
		 }
	 private class JButtonRed implements ActionListener{
			public void actionPerformed(ActionEvent e) {
	           		panel.setBackground(Color.red);	
	           		label.setForeground(Color.yellow);
	           		String str=e.getActionCommand();
	           		if(e.getSource()==redbutton) {
	           			JOptionPane.showMessageDialog(null, "YOU HAVE CLICK RED BUTTON");
	           		}
			}
			 
		 }
	
}
