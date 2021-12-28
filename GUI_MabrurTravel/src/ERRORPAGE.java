import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class ERRORPAGE extends JFrame implements ActionListener {
	JButton button;
	public ERRORPAGE() {
		
	setSize(300, 200);
		setTitle("Error");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel allpanel = new JPanel(new GridLayout(2, 1));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Please fill in all information");
		button = new JButton(" OK ");
		button.addActionListener(this);
		panel.add(label);
		panel1.add(button);
		allpanel.add(panel);
		allpanel.add(panel1);
		add(allpanel);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			dispose();
			
		}
		
	}

}
