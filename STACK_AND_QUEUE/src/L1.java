import java.util.Scanner;
import java.util.Stack;

public class L1 {

	public static void main(String[] args) {
		Stack<Integer>stack1=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        while(true) {
        	int input=sc.nextInt();
        	if(input==0)
              break;
        	stack1.push(input);
        }
        System.out.println("the total size of stack are "+stack1.size());
        int z=0;
        while(!stack1.isEmpty()) {
        	
        	z++;
        	System.out.println(z+" to be pop out = "+stack1.pop());
        	System.out.println("the total size of stack are "+stack1.size());
        }
	}

}
