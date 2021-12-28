import javax.swing.*;
public class GUI_APPLCATION_WINDOWCREATION {

	public static void main(String[] args) {
      SimpleWindow sc=new SimpleWindow();
	}

}
 class SimpleWindow extends JFrame{
	 public SimpleWindow() {
		 int height=350;
	       int width=250;
	       
	      setSize(height, width);
	      setTitle("Final Fantasy XV");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setVisible(true); 
	 }
 }