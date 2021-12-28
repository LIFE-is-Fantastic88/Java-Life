import java.util.Scanner;

public class MINI_SUDOKU_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int cases = 1; cases <= n; cases++) {
			int arr[][] = new int[6][6];
			for (int row = 0; row < 6; row++) {
				for (int colomn = 0; colomn < 6; colomn++) {
					arr[row][colomn] = sc.nextInt();
				}
			}
			System.out.print("Case #" + cases + ": ");
			int num = 0;
			boolean flag = true;
			
			for (int row = 0; row < 6; row++) {
				int sum=0;
				for (int colomn = 0; colomn < 6; colomn++) {
					sum+=arr[row][colomn];
				}
				if(sum==21) {
					
				}else {
					flag=false;
				}
			}
			for (int row = 0; row < 6; row++) {
				int sum=0;
				for (int colomn = 0; colomn < 6; colomn++) {
					sum+=arr[colomn][row];
				}
				if(sum==21) {
					
				}else {
					flag=false;
				}
			}
			int num1=5;
			int sum=0;
			for (int row = 0; row< 6; row++) {
				sum+=arr[row][num1];
				num1--;
			}
				if(sum==21) {
					
				}else {
					flag=false;
				
			}
			for (int x = 0; x < 5; x++) {

				for (int z = num; z < 5; z++) {
					if (arr[x][x] != arr[z + 1][z + 1]) {

					} else {
						flag = false;
					}
				}
				num++;

			}
			if (flag == true) {
				System.out.println("1");
			} else {
				System.out.println("0");

			}
		}

	}

}
