package programmers.devmatching;

import java.util.Scanner;

public class P1 {

    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static char [][]board;
    public static void DFS(int x, int y, int L){
        if (x == L && y == L){
            for (int i = 1; i <= L; i++){
                for (int j = 1; j <= L; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return;
        } else {
            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= L && ny >= 1 && ny <= L && board[nx][ny] == '?') {

                    board[nx][ny] = 'a';
                    DFS(nx, ny, L);
                    board[nx][ny] = '?';
                }
            }
        }
    }

    public static int solution(String []grid){
        board = new char[grid.length + 1][grid[0].length() + 1];
        int L = grid.length;;
        for (int i = 1; i <= grid.length; i++){
            for (int j = 1; j <= grid[0].length(); j++){
                board[i][j] = grid[i - 1].charAt(j - 1);
            }
        }
        DFS(1,1, L);
        return 0;
    }

    public static void main(String[] args) {
        String [] grid = {"??b", "abc", "cc?"};
        System.out.println(solution(grid));
    }
}
