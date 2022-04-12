package step.implementation;

import java.io.*;

public class P1550 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int decimal = Integer.parseInt(str, 16);
		System.out.println(decimal);
	}

}
