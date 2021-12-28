import java.util.Scanner;
import java.text.DecimalFormat;
public class MY_RECTANGLE {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       DecimalFormat df=new DecimalFormat("0.00");
    		  
    		int N=sc.nextInt();
    		for(int x=1;x<=N;x++) {
    			Rectangle myrectangle=new Rectangle();
    			 double width=sc.nextDouble();
                 double height=sc.nextDouble();
                 myrectangle.setWidth(width);
                 myrectangle.setHeight(height);
                 double area=myrectangle.getArea();
                 double perimeter=myrectangle.getPerimeter();
                 
                 System.out.println("Case #"+x+": "+df.format(myrectangle.getWidth())+" "+df.format(myrectangle.getHeight())+" "+
                		 df.format(area)+" "+df.format(perimeter)
                 );
    		}
    		   
    		   
    		   
	}

}
 class Rectangle{
	 private double height,width;
	 public Rectangle() {
		 width=0.0;
		 height=0.0;
	 }
	 
	 void setWidth(double wid) {
		 width=wid;
	 }
	 void setHeight(double hei) {
		 height=hei;
	 }
	 double getHeight() {
		 return height;
	 }
     double getWidth() {
    	 return width;
     }
     double getArea() {
    	 return width*height;
     }
     double getPerimeter() {
    	 return (width*2)+(height*2);
     }
 }