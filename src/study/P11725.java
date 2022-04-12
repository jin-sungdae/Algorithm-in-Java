package study;

import java.util.*;

public class P11725 {

    static int n;
    static List<Integer>[] list;
    static boolean [] visit;
    static int [] parents;

    public static void DFS(int v) {
        visit[v] = true;
        for (int i : list[v]) {
            if(!visit[i]) {
                parents[i] = v;
                DFS(i);
            }
        }
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        parents = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            list[t1].add(t2);
            list[t2].add(t1);
        }
        DFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}