package skcodingtest.internskcoding;

import java.util.LinkedList;
import java.util.Queue;

class pointx{
    int x;
    int y;
    pointx(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution5 {
    static int []dx = {-1, 1, 0, 0};
    static int []dy = {0, 0, -1, 1};
    static int [][]board;
    static int [][] dis;
    static Queue<pointx> q;
    static int ch;
    public static void BFS(int x, int y){
        q = new LinkedList<>();
        board[x][y] = 2;
        dis = new int[board.length][board[0].length];
        q.add(new pointx(x, y));
        while (!q.isEmpty()){
            pointx temp = q.poll();
            for (int i = 0; i < 4; i++){
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] != 2){

                    q.add(new pointx(nx, ny));

                    if (board[nx][ny] == 1 && (dis[temp.x][temp.y] + 1) % ch == 0)
                        dis[nx][ny] = dis[temp.x][temp.y] + 2;

                    else
                        dis[nx][ny] = dis[temp.x][temp.y] + 1;

                    board[nx][ny] = 2;
                }
            }
        }
    }
    public static int solution(String[] grid, int k) {
        int answer = -1;
        board = new int[grid.length][grid[0].length()];
        for (int j = 0; j < grid.length; j++) {
            for (int i = 0; i < grid[0].length(); i++) {
                if (grid[j].charAt(i) == '.')
                    board[j][i] = 0;
                else if (grid[j].charAt(i) == 'F')
                    board[j][i] = 1;
                else if (grid[j].charAt(i) == '#')
                    board[j][i] = 2;

            }
        }
        ch = k;
        BFS(0, 0);


        System.out.println();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j<board[i].length;j++){
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }

        if (dis[board.length - 1][board[0].length - 1] % k == 0)
            answer = dis[board.length - 1][board[0].length - 1] / k - 1;
        else
            answer = dis[board.length - 1][board[0].length - 1] / k;

        return answer;
    }
}

public class P4 {
    public static void main(String[] args) {
        String [] grid = {".F.FFFFF.F", ".########.", ".########F", "...######F", "##.######F", "...######F", ".########F", ".########.", ".#...####F", "...#......"};
        System.out.println(Solution5.solution(grid, 6));
    }
}
