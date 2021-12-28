import javax.swing.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class GUI_SIMPLEMATH extends JFrame implements ActionListener{
	private JPanel panel;
	private JPanel panel1;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JPanel panel2;
	private JTextField text;
	private JButton button;
	private int num1;
	private int num2;
    public GUI_SIMPLEMATH() {
    	setTitle("Simple Math GUI");
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rd = new Random();
		num1 = rd.nextInt(100);
		num2 = rd.nextInt(100);
		setLayout(new BorderLayout());
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		label = new JLabel("Let's answer the question");
		label.setFont(new Font("Verdana", Font.BOLD, 24));
		label1 = new JLabel(str1 + "+" + str2);
		label1.setFont(new Font("Verdana", Font.BOLD, 24));
		text = new JTextField(5);
		text.setFont(new Font("Verdana", Font.BOLD, 24));
		text.addActionListener(this);
		label2 = new JLabel("????");
		label2.setFont(new Font("Verdana", Font.PLAIN, 17));
		button=new JButton("RESET");
		panel1.add(button);
		button.addActionListener(this);
		panel.add(label);
		panel1.add(label1);
		panel1.add(text);
		panel2.add(label2);
		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		int answer = num1 + num2;
    }
	public static void main(String[] args) {
		GUI_SIMPLEMATH math = new GUI_SIMPLEMATH();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str;
		int num;
		
		str = text.getText();
		num = Integer.parseInt(str);
		if (num == answer) {
			label2.setText("Your answer is correct..Well Done");
			
		} else {
			label2.setText("Oooops wrong answer..please try again");
		}
		if(e.getSource()==button) {
			Random rd = new Random();
			num1 = rd.nextInt(100);
			num2 = rd.nextInt(100);
			String str1 = Integer.toString(num1);
			String str2 = Integer.toString(num2);
			label1.setText(str1 + "+" + str2);
			
		}
		
	}

}

