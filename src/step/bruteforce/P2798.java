package step.bruteforce;

import java.util.*;
import java.io.*;

public class P2798 {
	public static void main(String []args) throws IOException{
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sb.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(sb.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int []list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(list);
		int minus = 1000000;
		for (int i = 0; i < N - 2; i++) {
			for (int j = 1; j < N - 1; j++) {
				for (int x = 2; x < N; x++) {
					if (list[i] + list[j] + list[x] <= M) {
						if (minus > (M - (list[i] + list[j] + list[x])) && list[i] != list[j] && list[j] !=list[x] && list[i] != list[x]) {
							minus = (M - (list[i] + list[j] + list[x]));
						}	
					}
				}
			} 
		}
		System.out.println(M - minus);
	}
}
