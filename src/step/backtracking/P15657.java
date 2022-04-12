package step.backtracking;

import java.util.*;
import java.io.*;
public class P15657{
	
	static int N, M;
	static int L = 0;
	static int [] ch;
	static int [] arr;
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
			for (int i = v; i <= N; i++) {


					L++;
					q.push(arr[i]);
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
		st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		sb = new StringBuilder();
		ch = new int [N + 1];
		DFS(1);
		System.out.print(sb);
		
	}
}