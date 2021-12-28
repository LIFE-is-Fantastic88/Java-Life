import java.util.Scanner;
public class MYINHERITANCE {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int weight=sc.nextInt();
     int length=sc.nextInt();
     int height=sc.nextInt();
     cube mycube=new cube(weight,length,height);
     System.out.println("the area of cube is "+mycube.getArea());
     System.out.println("the volume of cube is "+mycube.getVolume());
	}

}
class square{
	private int width;
	private int length;
   public square(int w,int l) {
	   this.width=w;
	   this.length=l;
   }
   int getArea() {
	   return width*length;
   }
}

class cube extends square{
	private int height;
	public cube(int w,int l,int h) {
		super(w,l);
		this.height=h;
	}
	int getArea() {
		return super.getArea()*6;
	}
	int getVolume() {
		return super.getArea()*height;
	}
	
}