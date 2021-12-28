import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PageReport {
	private String name;
	private String gender;
	private String age;
	private String weight;
	private String height;

	public PageReport(String name, String gender, String age, String weight, String height) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height = height;
		JFrame frame = new JFrame();
		DecimalFormat df = new DecimalFormat("0.00");
		frame.setLayout(new BorderLayout());
		frame.setTitle("Body Mass Index(BMI) REPORT");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel north = new JPanel(new GridLayout(2, 1));
		JPanel north1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel north2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel labela = new JLabel("BMI RESULT");
		JLabel labelb = new JLabel("========================================================");
		north1.add(labela);
		north2.add(labelb);
		north.add(north1);
		north.add(north2);
		frame.add(north, BorderLayout.NORTH);
		// north
		JPanel centerpanel = new JPanel(new GridLayout(5, 1));
		JPanel center1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel center2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel center3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel center4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel center5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel label1 = new JLabel("Name: " + name);
		JLabel label2 = new JLabel("Gender: " + gender);
		JLabel label3 = new JLabel("Age Category: " + age);
		JLabel label4 = new JLabel("Weight: " + weight + "kg");
		JLabel label5 = new JLabel("Height: " + height + "meter");
		center1.add(label1);
		center2.add(label2);
		center3.add(label3);
		center4.add(label4);
		center5.add(label5);
		centerpanel.add(center1);
		centerpanel.add(center2);
		centerpanel.add(center3);
		centerpanel.add(center4);
		centerpanel.add(center5);
		frame.add(centerpanel, BorderLayout.CENTER);
		// calculate BMI
		Double w = Double.parseDouble(weight);
		Double h = Double.parseDouble(height);
		Double BMI = (w / h) / h;
		String status = new String();
		if (BMI < 18.5) {
			status = "UNDERWEIGHT";
		} else if (BMI < 29.9 && BMI > 18.5) {
			status = "NORMAL";
		} else if (BMI < 29.9 && BMI > 25.0) {
			status = "OVERWEIGHT";
		} else if (BMI < 34.9 && BMI > 30.0) {
			status = "OBESE I";
		} else if (BMI < 39.9 && BMI > 35.0) {
			status = "OBESE II";
		} else if (BMI >= 40.0) {
			status = "OBESE III";
		}
		String bmi = df.format(BMI);
		// south
		JPanel sorth = new JPanel(new GridLayout(2, 1));
		JPanel sorth1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel sorth2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel labeli = new JLabel("Your BMI is " + bmi + " Status: " + status);
		JLabel labelii = new JLabel("============================================================");
		sorth1.add(labelii);
		sorth2.add(labeli);
		sorth.add(sorth1);
		sorth.add(sorth2);
		frame.add(sorth, BorderLayout.SOUTH);
		frame.setVisible(true);

	}

}
