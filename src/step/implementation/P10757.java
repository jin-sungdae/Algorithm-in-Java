package step.implementation;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P10757 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		a = a.add(b);
		System.out.println(a.toString());
	}

}
