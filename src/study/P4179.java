package study;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2{
    int x, y;
    Node2(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class P4179 {
    static char [][] board;
    static boolean [][] ch;
    static int n, m, answer;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static Queue<Node2> JQ = new LinkedList<>();
    static Queue<Node2> FQ = new LinkedList<>();

    public static void BFS(){

        while (true) {
            answer++;
            int jSize = JQ.size();
            int fSize = FQ.size();
            if (jSize == 0){
                System.out.println("IMPOSSIBLE");
                return ;
            }
            while (fSize-- != 0) {
                Node2 tmp = FQ.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[nx][ny] != 'F' && board[nx][ny] != '#') {
                        board[nx][ny] = 'F';
                        FQ.offer(new Node2(nx, ny));
                    }
                }
            }
            while (jSize-- != 0) {
                Node2 tmp = JQ.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (!(nx >= 1 && nx <= n && ny >= 1 && ny <= m)) {
                        System.out.println(answer);
                        return ;
                    }
                    if (ch[nx][ny] == false && board[nx][ny] != '#' && board[nx][ny] != 'F') {
                        ch[nx][ny] = true;
                        JQ.offer(new Node2(nx, ny));
                    }
                }
            }
        }
    }

    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[n + 1][m + 1];
        ch = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++){
            String s = sc.next();
            for (int j = 1; j <= m; j++){
                if (s.charAt(j - 1) == 'J'){
                    board[i][j] = 'J';
                    ch[i][j] = true;
                    JQ.offer(new Node2(i, j));
                }
                else if (s.charAt(j - 1) == 'F'){
                    board[i][j] = 'F';
                    FQ.offer(new Node2(i, j));
                }
                else{
                    board[i][j] = s.charAt(j - 1);
                }
            }
        }
        BFS();
    }
}
