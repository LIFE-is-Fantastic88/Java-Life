package simultaneus_equation;

public class simultaneus_equation {

	public static void main(String[] args) {
		double a,b,c,d,e,f;
		a=3;
		b=1;
		c=10;
		d=8;
		e=140;
		f=840;
		
		    double check = ((a) * (d) - (b) * (c)); 
		    double x = ((d) * (e) - (b) * (f)) / check;
		    double y = ((a) * (f) - (c) * (e)) / check;
		    System.out.print("lower-grade peanuts: " + (2*x*2.2)+" pounds" + "\nhigh-grade peanuts: " + (x*2.2)+" pounds"+"\ncashew: "+(y*2.2)+" pounds");
            System.out.printf("\nlower-grade peanuts: %.2f pounds",(2*x*2.2));
	}

}
