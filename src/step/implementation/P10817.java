package step.implementation;

import java.util.*;
import java.io.*;
public class P10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] intArr = new int[3];
		for (int i = 0; i < 3; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(intArr);
		System.out.println(intArr[1]);
	}

}
