import java.util.Scanner;
import java.text.DecimalFormat;
public class MY_EQ_TRIANGLE {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      DecimalFormat df=new DecimalFormat("0.0000");
       int N=sc.nextInt();
       for(int x=1;x<=N;x++) {
    	   double side=sc.nextDouble();
    	   triangle mytriangle=new triangle();
    	   mytriangle.setSide(side);
    	   double area=mytriangle.getArea();
    	 
    	  double side1=mytriangle.getSide();
    	  System.out.println("Case #"+x+": "+df.format(side1)+" "+df.format(area));
       }
}
}

	