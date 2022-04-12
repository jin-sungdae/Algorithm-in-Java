package inflearnjava.dfsbfs;

import java.util.*;

class Node5{
    int x, y;
    Node5(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class P15 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int [] combi;
    static ArrayList<Node5> hList, pList;
    public static void DFS(int L, int s){
        if (L == m){
            int sum = 0;
            for (Node5 h : hList){
                int dis = Integer.MAX_VALUE;
                for (int i : combi){
                    dis = Math.min(dis, Math.abs(h.x - pList.get(i).x) + Math.abs(h.y - pList.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++){
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hList = new ArrayList<>();
        pList = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int tmp = sc.nextInt();
                if (tmp == 1) hList.add(new Node5(i, j));
                else if (tmp == 2) pList.add(new Node5(i, j));
            }
        }
        len = pList.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }
}
