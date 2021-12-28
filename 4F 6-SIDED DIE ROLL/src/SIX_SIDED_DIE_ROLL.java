import java.util.Scanner;
public class SIX_SIDED_DIE_ROLL {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         for(int z=1;z<=N;z++) {
         int n=1;
         int arr[]=new int[6];
       
         for(int roll=1;roll<=n;n++) {
        	 int input=sc.nextInt();
        	 if(input==-1) {
        		 break;
        	 }
        	 if(input>=1&&input<=6) {
        	 arr[input-1]++;
        	 }
         }
         System.out.println("Case #"+z+":");
         int num1=1;
         for(int result=0;result<6;result++) {
        	 System.out.println("Face "+num1+":"+arr[result]);
        	 num1++;
         }
         }
	}

}
