import java.util.Scanner;
public class myturtleapp {

	public static void main(String[] args) {
		MWorld myworld= new MWorld("blablabla",800,600);
		MTurtle turtle= new MTurtle(myworld); 
		turtle.moveTo(200, 0);
		turtle.turnRight(180);
		turtle.forward(400);
		Scanner sc=new Scanner(System.in);
		int x, y;
		System.out.print("x =");
		x=sc.nextInt();
		System.out.print("y =");	
		y=sc.nextInt();
		
		MTurtle turtle2= new MTurtle(myworld); 
		if (x<200) {
			turtle2.moveTo(x, y);
			turtle2.forward(50);
			turtle2.turnRight(90);
			turtle2.forward(50);
			turtle2.turnRight(90);
			turtle2.forward(50);
			turtle2.turnRight(90);
			turtle2.forward(50);
			turtle2.turnRight(90);}
		else {turtle2.moveTo(x, y);
		      turtle2.turnRight(30);
		      turtle2.forward(50);
		      turtle2.turnRight(120);
		      turtle2.forward(50);
		      turtle2.turnRight(120);
		      turtle2.forward(50);}
		
		}

	}

