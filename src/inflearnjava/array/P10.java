package inflearnjava.array;

import java.util.*;

public class P10 {
	
	public static void solution(int [][] list) {
		int result = 0;
		int [] dx = {-1, 0, 1, 0};
		int [] dy = {0, 1, 0, -1};
		boolean flag =true;
		for (int i = 1; i <= list.length - 1; i++) {
			for (int j = 1; j <= list.length - 1; j++) {
				flag =true;
				for (int z = 0; z < 4; z++) {
					int nx = i + dx[z];
					int ny = j + dy[z];
					if (list[nx][ny] >= list[i][j]) {
						flag= false;
						break;
					}
				}
				if (flag == true)
					result++;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] list = new int[N + 2][N + 2];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		solution(list);
	}
}
