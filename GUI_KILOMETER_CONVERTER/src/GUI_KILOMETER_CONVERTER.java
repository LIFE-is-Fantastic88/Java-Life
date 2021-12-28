import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class GUI_KILOMETER_CONVERTER {

	public static void main(String[] args) {
    converter mycon=new converter();

	}

}
class converter extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JTextField text;
	private JButton button;

	public converter() {
	
		setTitle("KILOMETER CONVERTER");
		setSize(310, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setContent();
		add(panel);
		setVisible(true);
	}
	void setContent() {
		label=new JLabel("Enter a distance in KILOMETER");
		text=new JTextField(5);
		button=new JButton("Calculate");
		button.addActionListener(new furtherprocess());
	
		panel=new JPanel();
		panel.setBackground(Color.yellow);
		panel.add(label);
		panel.add(text);
		panel.add(button);
	}
	private class furtherprocess implements ActionListener{

      public void actionPerformed(ActionEvent arg0) {
   			String input;
   			double mile;
   			input=text.getText();
   			mile=Double.parseDouble(input)*0.6214;
   			JOptionPane.showMessageDialog(null,input+" kilometer is "+mile+" miles");
		}
		
	}
}

