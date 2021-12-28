import java.util.ArrayList;
import java.util.Scanner;

public class STACK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>arr=new ArrayList<String>();
        while(true) {
        	String input=sc.nextLine();
        	if(input.equals("#")) {
        		break;
        	}
        	if(input.equals("-")) {
        		arr.remove(arr.size()-1);}
        	else {
        	arr.add(input);}
        	
        }
        for(int z=arr.size()-1;z>=0;z--) {
        	System.out.println(arr.get(z));
        }
        
	}

}
