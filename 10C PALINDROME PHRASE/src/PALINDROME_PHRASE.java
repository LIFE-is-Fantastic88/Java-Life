import java.util.ArrayList;
import java.util.Scanner;

public class PALINDROME_PHRASE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z"};
       int n=Integer.parseInt(sc.nextLine());
       for(int z=0;z<n;z++) {
    	   ArrayList<String>list=new ArrayList<String>();
    	   String input=sc.nextLine();
    	   for(int x=0;x<input.length();x++) {
    		   String check=input.substring(x, x+1);
    		   for(int y=0;y<arr.length;y++) {
    			   if(check.toLowerCase().equals(arr[y])) {
    				   list.add(arr[y]);
    			   }
    		   }
    	   }String ans1="";
    	   String ans2="";
    	   for(int p=0;p<list.size();p++) {
    		   ans1+=list.get(p);
    	   } 
    	   for(int p=list.size()-1;p>=0;p--) {
    		   ans2+=list.get(p);
    	   }
    	   if(ans1.equals(ans2)) {
    		   System.out.println("Yes");
    	   }else {
    		   System.out.println("No");
    	   }
       }
	}

}
