package string;

import java.util.*;
import java.io.*;
public class P4458 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String []str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
			str[i] = str[i].replace(str[i].charAt(0), Character.toUpperCase(str[i].charAt(0)));
		}
		for (String x : str) {
			System.out.println(x);
		}
	}
}
