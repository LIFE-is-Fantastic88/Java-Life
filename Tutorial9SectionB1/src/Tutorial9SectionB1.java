import java.util.Scanner;
public class Tutorial9SectionB1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
             int arr[][]=new int[10][10]; //a
            for(int row=0;row<10;row++) {
            	for(int colomn=0;colomn<10;colomn++) {
            		arr[row][colomn]=sc.nextInt();
            	}
            } //b
            
            for(int row1=0;row1<10;row1++) {
            	for(int colomn1=0;colomn1<10;colomn1++) {
            		System.out.print(arr[row1][colomn1]+" ");
            	}
            	System.out.println();
            } //c
            int sum=0;
            for(int row3=0;row3<10;row3++) {
            	for(int colomn3=0;colomn3<10;colomn3++) {
            		sum+=arr[row3][colomn3];
            	}
            } 
            System.out.println("sum is equal "+sum); //d
            
            int arr2[]=new int[10];
            
            for(int row4=0;row4<10;row4++) {
            	int total=0;
            	for(int colomn4=0;colomn4<10;colomn4++) {
            		total+=arr[row4][colomn4];
            	}
            	arr2[row4]=total;
            	System.out.println("row"+row4+" is equal to "+arr2[row4]);
            } //e
            int arr3[]=new int[10];
            for(int row5=0;row5<10;row5++) {
            	int total2=0;
            	for(int colomn5=0;colomn5<10;colomn5++) {
            		total2+=arr[colomn5][row5];
            	}
            	arr3[row5]=total2;
            	System.out.println("colomn"+row5+" is equal to "+arr3[row5]);
            } //f
            int arr4[]=new int[10];
            int sum1=0;
            int result=0;
            for(int row6=0;row6<10;row6++) {
            	int total3=0;
            	for(int colomn6=0;colomn6<10;colomn6++) {
            		total3+=arr[row6][colomn6];
            	}
            	arr4[row6]=total3;
            	if(arr4[row6]>sum1) {
            		sum1=arr4[row6];
            		 result=row6;
            	}
            }
            System.out.println("The row with the largest sum is row"+result ); //g
            
            int arr5[]=new int[10];
            int sum2=0;
            int result1=0;
            for(int row7=0;row7<10;row7++) {
            	int total4=0;
            	for(int colomn7=0;colomn7<10;colomn7++) {
            		total4+=arr[colomn7][row7];
            	}
            	arr5[row7]=total4;
            	if(arr5[row7]>sum2) {
            		sum2=arr5[row7];
            		 result1=row7;
            	}
            }
            System.out.println("The colomn with the largest sum is colomn"+result1 ); //h
            
	}

}
