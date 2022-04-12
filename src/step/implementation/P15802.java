package step.implementation;


import java.io.*;

public class P15802 {
	public static void main(String[]args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		if (str.equals("innovation"))
			System.out.println("1");
		else
			System.out.println("0");
	}
}
