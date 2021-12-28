import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

public class ADVANCE1 {
    
	public static long getData(ArrayList<String>arList) {
		String str="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int num=0;
		long total=0;
		for(int z=1;z<arList.size();z++) {
			int sum=0;
			num++;
			for(int x=0;x<arList.get(z).toString().length();x++) {
				for(int y=0;y<str.length();y++) {
					if(arList.get(z).toString().charAt(x)==str.charAt(y)) {
						sum+=y;
						break;
					}
				}
			}
			total=total+(sum*num);
		}
		return total;
	}
	
	
	public static void main(String[] args) throws IOException {
          BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sam png\\Desktop\\p022_names.txt"));
          StringTokenizer str=new StringTokenizer(br.readLine(),"\",\"");
          ArrayList<String> arList=new ArrayList<String>();
        arList.add("");
          while(str.hasMoreTokens()) {
        	  arList.add(str.nextToken());
          }
          br.close();
          Collections.sort(arList);
          System.out.print(getData(arList));
	}

}
