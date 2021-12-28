import java.util.Scanner;

public class EXPLORAC {
public static int[]MSTnum(int[][]explorace,int starter){
	int[] MSTnum=new int[explorace.length];
	boolean[] MSTcheck=new boolean[explorace.length];
	for(int z=0;z<MSTnum.length;z++) {
		MSTnum[z]=Integer.MAX_VALUE;
	}
	MSTnum[starter]=0;
	for(int x=0;x<explorace.length-1;x++) {
		int latest=MSTcheckpoint(MSTnum,MSTcheck);
		MSTcheck[latest]=true;
		for(int i=0;i<explorace.length;i++) {
			if(!MSTcheck[i]&&explorace[latest][i]!=0&&MSTnum[i]>explorace[latest][i]) {
				MSTnum[i]=explorace[latest][i];
			}
		}
	}
	return MSTnum;
}
public static int MSTcheckpoint(int[]MSTnum,boolean[]MSTcheck) {
	int min=Integer.MAX_VALUE;
	int curr=-1;
	for(int z=0;z<MSTnum.length;z++) {
		if(MSTnum[z]<min&&!MSTcheck[z]) {
			min=MSTnum[z];
			curr=z;
		}
	}
	return curr;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int input=sc.nextInt();
		int cases=1;
		for(int q=0;q<input;q++) {
		int n=sc.nextInt();
		int loop=sc.nextInt();
		int [][]explorace=new int [n+1][n+1];
		for(int z=0;z<loop;z++) {
			int X=sc.nextInt();
			int Y=sc.nextInt();
			int distance=sc.nextInt();
			explorace[X][Y]=distance;
			explorace[Y][X]=distance;
		}
		int []MSTnum=MSTnum(explorace,1);
         int total=0;
         for(int p=1;p<MSTnum.length;p++) {
        	 total+=MSTnum[p];
         }
         System.out.println("Case "+cases+": "+total+" meters");
         cases++;
	}
	}
}
