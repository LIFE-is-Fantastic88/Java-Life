import javax.swing.JOptionPane;
public class CustomerNumber {

	public static void main(String[] args) {
         String input;
       
         input=JOptionPane.showInputDialog("Enter a customer in the form LLLNNNN"+"\n(LLL=letters and NNNN=numbers");
        
       
       if( checkValidity(input)) {
    	   JOptionPane.showMessageDialog(null, "This is a valid customer number");
       }else
    	   JOptionPane.showMessageDialog(null, "This is a invalid");
       
       
	}
    public static boolean checkValidity(String input) {
    	boolean flag=true;
    	if(input.length()!=7) {
    		
    		return false;
    	}
    	for (int z=0;z<3;z++) {
    		char ch=input.charAt(z);
    		if(!Character.isLetter(ch)) {
    			return false;
    		}
    	}
    	for (int z=3;z<7;z++) {
    		char ch=input.charAt(z);
    		if(!Character.isDigit(ch)) {
    			return false;
    		}
    	}
    	return true;
    }
}
