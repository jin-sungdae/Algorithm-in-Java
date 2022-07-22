package study.monthcodechallengeseason2LV3;

import java.util.*;

class Solution2 {
    public static long [] alist;
    public static int n;
    public static long answer = 0;
    public static ArrayList<Integer>[] map;
    public static int[] indegree;

    public static void bfs() {
        Queue<Integer> list = new LinkedList<>();
        for (int i = 1; i < alist.length; i++){
            if (map[i].size() == 1)
                list.add(i);
        }
        while (!(list.isEmpty())) {
            int tmp = list.poll();
            answer += Math.abs(alist[tmp]);
            indegree[tmp]--;
            for (int i = 0; i < map[tmp].size(); i++) {
                int next = map[tmp].get(i);
                if (indegree[next] == 0) continue;
                indegree[next]--;
                alist[next] += alist[tmp];
                if (indegree[next] == 1) {
                    if (next == 0) continue;
                    list.add(next);
                }
            }
        }

    }

    public static long solution(int[] a, int[][] edges) {

        alist = new long[a.length];
        indegree = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            alist[i] = a[i];
            answer += a[i];
        }
        if (answer != 0)
            return -1;
        if (a.length == 2) return Math.abs(alist[0]);
        map = new ArrayList[a.length];
        for (int i = 0; i < a.length; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            map[edges[i][0]].add(edges[i][1]);
            map[edges[i][1]].add(edges[i][0]);
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
        }
        bfs();
        return answer;
    }
}

public class P2 {
    public static void main(String []args) {
        int [] a = {-5,0,2,1,2};
        int [][] edges = {{0,1},{3,4},{2,3},{0,3}};

        System.out.println(Solution2.solution(a, edges));
    }
}

