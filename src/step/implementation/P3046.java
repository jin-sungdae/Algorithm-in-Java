package step.implementation;

import java.io.*;
import java.util.StringTokenizer;


public class P3046 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int result = num2 * 2 - num1;
		System.out.println(result);
	}
}
