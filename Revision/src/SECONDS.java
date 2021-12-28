import java.util.Scanner;

public class SECONDS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("number of input:");
        n=sc.nextInt();
        
        
        for(int z=1; z<=n;z++) {
        	double sec, min, hour;
            System.out.println("please key in the sec to be convert:");
        	int input =sc.nextInt();
             hour=input/3600;
        	 min=(input%3600)/60;
        	 sec=(input%3600)%60;
        	System.out.printf("%.0f:%.0f:%.0f\n",hour,min,sec);
        	
        	
        	
        }
		
		
	}
	

}
