import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class PageInfo {
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private ImageIcon image;
	private JLabel labelpic;
	private JLabel title;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JRadioButton radio1;
	private JRadioButton radio2;
	private ButtonGroup radiobuttongroup;
	private JComboBox<String> box;
	private JButton button1;
	private JButton button2;
	private ButtonGroup gp;
    private String cmd;
	public PageInfo() {
		frame = new JFrame();
		frame.setSize(600, 300);
		frame.setTitle("Body Mass Index (BMI).info");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		panel2 = new JPanel(new GridLayout(6, 1));
		image = new ImageIcon("img/pic 2.jpeg");
		labelpic = new JLabel(image);
		panel1 = new JPanel();
		panel1.add(labelpic);
		frame.add(panel1, BorderLayout.WEST);
		title = new JLabel("KINDLY FILL IN ALL INFORMATION");
		JPanel titlepanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titlepanel.add(title);
		panel2.add(titlepanel);
		// name
		JPanel namepanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label1 = new JLabel("Name:");
		text1 = new JTextField(20);
		namepanel.add(label1);
		namepanel.add(text1);
		panel2.add(namepanel);
		// gender
		JPanel genderpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label2 = new JLabel("Gender:");
		radio1 = new JRadioButton("male");
		radio2 = new JRadioButton("Female");
		radio1.addActionListener(new error());
		radio2.addActionListener(new error());
		genderpanel.add(label2);
		genderpanel.add(radio1);
		genderpanel.add(radio2);
		gp = new ButtonGroup();
		gp.add(radio1);
		gp.add(radio2);
		panel2.add(genderpanel);
		// age category
		JPanel agepanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label3 = new JLabel("Age Category:");
		String[] years = { "1-11 years old (child)", "12-25 years old (teenage)", "26-59 years old (adult)",
				"60 years and above (elderly)" };
		box = new JComboBox<String>(years);
		agepanel.add(label3);
		agepanel.add(box);
		panel2.add(agepanel);
		// weight
		JPanel weightpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label4 = new JLabel("Weight (in kg):");
		text2 = new JTextField(5);
		weightpanel.add(label4);
		weightpanel.add(text2);
		panel2.add(weightpanel);
		// height
		JPanel heightpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label5 = new JLabel("Height (in meter):");
		text3 = new JTextField(5);
		heightpanel.add(label5);
		heightpanel.add(text3);
		panel2.add(heightpanel);
		frame.add(panel2, BorderLayout.CENTER);
		// panel3
		// button1
		panel3 = new JPanel(new GridLayout(2, 1));
		button1 = new JButton("RESET");
		button1.addActionListener(new error());
		panel3.add(button1);
		// button2
		button2 = new JButton("SUBMIT");
		button2.addActionListener(new error());
		panel3.add(button2);
		frame.add(panel3, BorderLayout.EAST);
	
	}

	private class error implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button2) {
				if (text1.getText().equals("") || text2.getText().equals("") || text3.getText().equals("")) {
					errors err = new errors();
				} else {
					String gen;
				
				
					if (radio1.isSelected()) {
						gen="male";
					}else {
						gen="female";
					}
					String name = text1.getText();
				
					String[] years = { "1-11 years old (child)", "12-25 years old (teenage)", "26-59 years old (adult)",
							"60 years and above (elderly)" };

					String weight = text2.getText();
					String height = text3.getText();
					String age = years[box.getSelectedIndex()];
					frame.dispose();
					PageReport report = new PageReport(name, gen, age, weight, height);
				}
			} else if (e.getSource() == button1) {
				frame.dispose();
				PageInfo pg = new PageInfo();
			}

		}

	}
}
