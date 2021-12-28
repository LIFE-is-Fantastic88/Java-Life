import java.util.Scanner;
import java.text.DecimalFormat;
public class revision1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		int inf=1;
		for(int z=1;z<=inf;inf++) {
		int input=sc.nextInt();
		if(input==0) {
			break;
		}
		int arr[][]=new int[input][7];
		for(int row=0;row<input;row++) {
			for(int colomn=0;colomn<7;colomn++) {
				arr[row][colomn]=sc.nextInt();
			}
		}
		int arr1[]=new int[input];
		for(int row=0;row<input;row++) {
			for(int colomn=0;colomn<7;colomn++) {
				arr1[row]+=arr[row][colomn];
			}
		}
		int num=0;
		for(int student=0;student<input;student++) {
			if (arr1[student]>=25) {
				num++;
			}
		}
		int sum=(num*100)/input;
		System.out.println("Case #"+inf+": "+df.format(sum)+"%");
		for(int n=0;n<input;n++) {
			System.out.println("Student "+n+": "+arr1[n]);
		}
	}
}
}
