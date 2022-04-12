package step.sort;

import java.io.*;
import java.util.*;

public class P10989 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] list = new int[n];
		for (int i = 0; i < n; i++) 
			list[i] = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(list);
		for(int x : list) 
			sb.append(x).append("\n");
		
		System.out.println(sb);
	}
}
