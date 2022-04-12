package step.recursive;
import java.util.*;
import java.io.*;


public class P2263 {
	
	static int [] inList;
	static int [] postList;
	static int [] preList;
	static int N;
	static int idx;
	public static void getPre(int inStart, int inEnd, int postStart, int postEnd) {
		if (inStart <= inEnd && postStart <= postEnd) {
			preList[idx++] = postList[postEnd];
			int pos = inStart;
			for (int i = inStart; i <= inEnd; i++) {
				if (inList[i] == postList[postEnd]) {
					pos = i;
					break;
				}
			}
			getPre(inStart, pos - 1, postStart, postStart + pos - inStart - 1);
			getPre(pos + 1, inEnd, postStart + pos - inStart, postEnd - 1);
		}
	}
	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		inList = new int[N];
		postList = new int[N];
		preList = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			inList[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			postList[i] = Integer.parseInt(st.nextToken());
		}
		getPre(0, N - 1,0 , N - 1);
		for (int x : preList) {
			System.out.print(x + " ");
		}
	}
}
