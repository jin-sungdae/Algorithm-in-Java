package study;

import java.util.*;
public class P1068 {
    static int n, cut, count;
    static int[] parent;
    static boolean[] ch;

    public static void DFS(int v){
        parent[v] = -2;
        for (int i = 0; i < n; i++){
            if (parent[i] == v){
                DFS(i);
            }
        }
    }

    public static void countLeaf(int root){
        boolean isLeaf = true;
        ch[root] = true;
        if (parent[root] != -2){
            for (int i = 0; i < n; i++){
                if (parent[i] == root && ch[i] == false ){
                    countLeaf(i);
                    isLeaf = false;
                }
            }
            if (isLeaf) count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int root = 0;
        parent = new int[n];
        for (int i = 0; i < n; i++){
            parent[i] = sc.nextInt();
            if (parent[i] == -1) root = i;
        }
        cut = sc.nextInt();
        DFS(cut);
        count = 0;
        ch = new boolean[n];
        countLeaf(root);
        System.out.println(count);
    }
}