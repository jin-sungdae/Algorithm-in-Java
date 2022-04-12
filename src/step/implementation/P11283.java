package step.implementation;

import java.io.*;

public class P11283 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char result = str.charAt(0);
		System.out.println(((int)result) - 44031);
	}
}
