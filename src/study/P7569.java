package study;

import java.util.*;

class Node{
    int x, y, z;
    Node(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class P7569 {
    static int [][][] board, dis;
    static int []dx = {-1, 0, 1, 0, 0, 0};
    static int []dy = {0, 1, 0, -1, 0 ,0};
    static int []dz = {0, 0, 0, 0, 1 ,-1};
    static int n, m, h;
    static Queue<Node> Q = new LinkedList<>();

    public static void BFS(){
        while (!Q.isEmpty()){
            Node tmp = Q.poll();
            for (int i = 0; i < 6; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                int nh = tmp.z + dz[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && nh >= 1 && nh <= h && board[nh][nx][ny] ==0){
                    board[nh][nx][ny] = 1;
                    Q.offer(new Node(nx, ny, nh));
                    dis[nh][nx][ny] = dis[tmp.z][tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        board = new int[h + 1][n + 1][m + 1];
        dis = new int[h + 1][n + 1][m + 1];
        for (int z = 1; z <= h; z++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    board[z][i][j] = sc.nextInt();
                    if (board[z][i][j] == 1) Q.offer(new Node(i, j, z));
                }
            }
        }
        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int z = 1; z <= h; z++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (board[z][i][j] == 0) flag = false;
                }
            }
        }
        if (flag){
            for (int z= 1; z <= h; z++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        answer = Math.max(answer, dis[z][i][j]);
                    }
                }
            }
            System.out.println(answer);
        }
        else
            System.out.println(-1);
    }
}