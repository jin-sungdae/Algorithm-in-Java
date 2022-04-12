package step.backtracking;

import java.util.*;
import java.io.*;
public class P15651 {
	
	static int N, M;
	static int L = 0;
	static int [] ch;
	static Stack<Integer> q = new Stack<>();
	static StringBuilder sb;
	public static void DFS(int v) {
		if (L == M) {

			
			for (int i : q) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return ;
		}
		else {
			for (int i = 1; i <= N; i++) {
					L++;
					q.push(i);
					DFS(i);
					q.pop();
					L--;
			}
		}
	}
	
	
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sb = new StringBuilder();
		ch = new int [N + 1];
		DFS(1);
		System.out.print(sb);
		
	}
}
