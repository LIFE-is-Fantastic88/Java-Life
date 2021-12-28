import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class tester {

	public static void main(String[] args) throws Exception {
		String a="12/9";
		StringTokenizer token=new StringTokenizer(a,"/");
		int[] check= {0,31,59,90,120,151,181,212,243,273,304,334,365};
		System.out.println(check[4]);
		
	}
}