package step.recursive;

import java.util.*;
import java.io.*;

public class P1629 {
	
	public static long C;
	public static long solution(long A, long B) {
	
		if(B == 1) return A % C;
		
		long temp = solution(A, B / 2);

		if(B % 2 == 1) return (temp * temp % C) * A % C;
		return temp * temp % C;
	}
	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		System.out.println(solution(A, B));
	}
}
