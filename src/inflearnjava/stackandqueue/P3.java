package inflearnjava.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class P3 {
    static int n, nList;
    static int [][] board;
    static int [] list;
    public static int solution(){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : list){
            for (int i = 0; i < n; i++){
                if (board[i][pos - 1] != 0){
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        nList = sc.nextInt();
        list = new int[nList];
        for (int i = 0; i < nList; i++){
            list[i] = sc.nextInt();
        }
        System.out.println(solution());
    }
}
