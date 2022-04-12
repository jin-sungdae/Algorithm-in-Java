package inflearnjava.dfsbfs;

import java.security.cert.PolicyNode;
import java.util.*;

class Node{
    int x, y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class P12 {
    static int [][] board, dis;
    static int []dx = {-1, 0, 1, 0};
    static int []dy = {0, -1, 0, 1};
    static int n, m;
    static Queue<Node> Q = new LinkedList<>();

    public static void BFS(){
        while (!Q.isEmpty()){
            Node tmp = Q.poll();
            for (int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[nx][ny] ==0){
                    board[nx][ny] = 1;
                    Q.offer(new Node(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n + 1][m + 1];
        dis = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) Q.offer(new Node(i, j));
            }
        }
        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= m; j++){
                if (board[i][j] == 0) flag = false;
            }
        }
        if (flag){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= m ; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else
            System.out.println(-1);
    }
}
