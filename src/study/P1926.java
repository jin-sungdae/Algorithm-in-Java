package study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1{
    int x, y;
    Node1(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class P1926 {
    static int n, m, max;
    static int [][]board;
    static boolean [][] ch;
    static int []dx = {-1, 0, 1, 0};
    static int []dy = {0, -1, 0, 1};
    static Queue<Node1> Q = new LinkedList<>();

    public static int BFS(int x, int y){
        Q.offer(new Node1(x, y));
        ch[x][y] = true;
        int result = 1;
        while (!Q.isEmpty()){
            Node1 tmp = Q.poll();
            for (int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && ch[nx][ny] == false && board[nx][ny] == 1){
                    result++;
                    ch[nx][ny] = true;
                    Q.offer(new Node1(nx, ny));
                }
            }
        }
        return result;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n + 1][m + 1];
        ch = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                board[i][j] = sc.nextInt();
            }
        }


        int size =0 ;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){

                if (board[i][j] == 1 && ch[i][j]== false){
                    max = Math.max(max, BFS(i, j));
                    size++;
                }
            }

        }
        System.out.println(size);
        System.out.println(max);

    }
}
