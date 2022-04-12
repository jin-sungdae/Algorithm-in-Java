package study;

import java.util.ArrayList;
import java.util.Scanner;

public class P1240 {
    static int n, m;
    static ArrayList<Integer>[] list;
    static int [] parent;
    static boolean [] ch;

    public static void DFS(int v){
        ch[v] = true;
        for (int i : list[v]){
            if (!ch[i]){
                parent[i] = v;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        list = new ArrayList[n + 1];
        parent = new int[n + 1];
        ch = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++){
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int len = sc.nextInt();
            list[n1].add(n2);
          //  list[n1].add(len);
            list[n2].add(n1);
          //  list[n2].add(len);
        }
        DFS(1);
        for (int x : parent){
            System.out.print(x + " ");
        }
    }
}
