import java.util.Scanner;

public class tutorial8_SectionB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		if (str.contains(str2)) {
			System.out.print(str2+" is a substring of "+str);
		}
	}

}
