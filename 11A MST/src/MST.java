
public class MST {
	public static int[] parent = new int[9];

	public static int[] MSTnum(int[][] minspan, int starter) {
		int[] MSTnum = new int[minspan.length];
		boolean[] MSTcheck = new boolean[minspan.length];
		for (int z = 0; z < MSTnum.length; z++) 
			MSTnum[z] = Integer.MAX_VALUE;
            MSTnum[starter] = 0;
			for (int x = 0; x <minspan.length-1; x++) {
				int latest = mincheckprocess(MSTnum, MSTcheck);
				MSTcheck[latest] = true;
				for(int i=0;i<minspan.length;i++) {
				if (!MSTcheck[i] && minspan[latest][i] != 0 && MSTnum[i] > minspan[latest][i]) {
					MSTnum[i] = minspan[latest][i];
					parent[i] = latest;
				}
			}
	}
		return MSTnum;
	}

public static int mincheckprocess(int []MSTnum,boolean[]MSTcheck) {
	int min=Integer.MAX_VALUE;
	int current=-1;
	for(int z=0;z<MSTnum.length;z++) {
		if (MSTnum[z]<min&&!MSTcheck[z]) {
			min=MSTnum[z];
			current=z;
		}
	}
	return current;
}
	public static void main(String[] args) {
		int[][] minspan = {{0,0,0,0,0,0,0,0,0},
				{0,0,240,210,340,280,200,345,120},
				{0,240,0,265,175,215,180,185,155},
				{0,210,265,0,260,115,350,435,195},
				{0,340,175,260,0,160,330,295,230},
				{0,280,215,115,160,0,360,400,170},
				{0,200,180,350,330,360,0,175,205},
				{0,345,185,435,295,400,175,0,305},
				{0,120,155,195,230,170,205,305,0}};
                int[] MSTnum=MSTnum(minspan,1);
                System.out.println("Edge\tWeight");
                for(int z=2;z<MSTnum.length;z++) {
                	System.out.println(z+"-"+parent[z]+"\t"+MSTnum[z]);
                }
	}

}
