package study.weeklychallenge;

import java.util.*;

class Solution4 {
	static int [][] arr;
	
	public static int bfs(int n , int start) {
		
		int cnt = 1;
		boolean []visited = new boolean[n + 1];
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		while(!q.isEmpty()) {
			int point = q.poll();
			visited[point] = true;
			for (int i = 1; i <= n; i++) {
				if (visited[i] == true) continue;
				if (arr[point][i] == 1) {
					q.offer(i);
					cnt++;
				}
			}
		}
		
		return (int)Math.abs(n - 2 * cnt);
	}
	
    public static int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n + 1][n + 1];
        
        for (int i = 0; i < wires.length; i++) {
        	arr[wires[i][0]][wires[i][1]] = 1;
        	arr[wires[i][1]][wires[i][0]] = 1;
        }
        
		int a, b;
		for (int i = 0; i < wires.length; i++) {
			a = wires[i][0];
			b = wires[i][1];
			
			arr[a][b] = 0;
			arr[b][a] = 0;
			
			answer = Math.min(answer, bfs(n, a));
			
			arr[a][b] = 1;
			arr[b][a] = 1;
			
		}
		return answer;
		
    }
}

public class P4 {
	public static void main(String []args) {
		int n = 9;
		int [][]wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		
		System.out.println(Solution4.solution(n, wires));
	}
}
