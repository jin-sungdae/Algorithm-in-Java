package step.implementation;

import java.util.*;
import java.io.*;

public class P3003 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int []list = new int[6];
		int [] resultList = {1, 1, 2, 2, 2, 8};
		int []result = new int[6];
		for (int i = 0; i < 6; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			result[i] = resultList[i] - list[i];
			System.out.print(result[i] + " ");
		}
	}
}
