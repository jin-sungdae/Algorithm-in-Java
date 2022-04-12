package step.implementation;

import java.io.*;

public class P5554 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result += Integer.parseInt(br.readLine());
		}
		System.out.println(result / 60);
		System.out.println(result % 60);
	}
}
