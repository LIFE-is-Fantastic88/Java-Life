import java.util.Scanner;
public class RELOAD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inf=1;
		int num=1;
		for (int n=1;n<=inf;inf++) {
			String input=sc.nextLine();
			if(input.equals("*")) {
				break;
			}
			if(input.substring(0, 5).equals("*122*")&&input.substring(input.length()-1, input.length()).equals("#")&&(input.length()-6)==8){
				
				System.out.println("Case #"+num+": valid");
				
			}else {
				System.out.println("Case #"+num+": Invalid");
			}
			num++;
		}
	}

}
