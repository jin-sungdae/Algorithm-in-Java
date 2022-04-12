package step.recursive;

import java.math.BigInteger;
import java.util.*;



public class P2407 {

    static BigInteger [][] dy;

    public static BigInteger DFS(int n, int r) {
        if (dy[n][r].compareTo(BigInteger.ZERO) != 0) return dy[n][r];
        else if (n == r || r == 0) return dy[n][r] = new BigInteger("1");
        else return dy[n][r] = DFS(n - 1, r - 1).add(DFS(n - 1, r));
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        dy = new BigInteger[102][102];
        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 102; j++) {
                dy[i][j] = new BigInteger("0");
            }
        }
        System.out.println(DFS(n, m));
    }
}
