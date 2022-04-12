package step.implementation;

import java.util.*;
import java.io.*;

public class P2845 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int []list = new int[5];
		int result = L * P;
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(st1.nextToken());
			System.out.print(list[i] - result + " ");
		}
	}
}
