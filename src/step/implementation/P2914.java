package step.implementation;

import java.util.*;
import java.io.*;

public class P2914 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		System.out.println(num1 * (num2 -1) + 1);
	}

}
