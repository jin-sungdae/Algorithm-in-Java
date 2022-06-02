package study.SummerWinterCoding2019;

import java.util.*;

class Node{
	int idx;
	int cost;
	Node(int idx, int cost){
		this.idx = idx;
		this.cost = cost;
	}
}

class Solution2 {
    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        ArrayList<ArrayList<Node>> board = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < N + 1; i++) 
        	board.add(new ArrayList<>());
        for (int i = 0; i < road.length; i++) {
        	board.get(road[i][0]).add(new Node(road[i][1], road[i][2]));
        	board.get(road[i][1]).add(new Node(road[i][0], road[i][2]));
        }

        boolean[] visited = new boolean[N + 1];
        int[] dist = new int[N + 1];
        for (int i = 0; i < N + 1; i++) 
            dist[i] = Integer.MAX_VALUE;
        	
        dist[1] = 0;
        for (int i = 0; i < N; i++) {
        	int nodeValue = Integer.MAX_VALUE;
        	int nodeIdx = 0;
        	for (int j = 1; j < N + 1; j++) {
        		if (!visited[j] && dist[j] < nodeValue) {
        			nodeValue = dist[j];
        			nodeIdx = j;
        		}
        	}
        		
        	visited[nodeIdx] = true;
        	for (int j = 0; j < board.get(nodeIdx).size(); j++) {
        		Node adjNode = board.get(nodeIdx).get(j);
        		if (dist[adjNode.idx] > dist[nodeIdx] + adjNode.cost)
        			dist[adjNode.idx] = dist[nodeIdx] + adjNode.cost;
        	}
        }
      
        for (int t = 1; t < N + 1; t++) {
        	if (dist[t] <= K)
        		answer++;
        }

		return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		int [][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		int [][] road2 = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
		System.out.println(Solution2.solution(5, road, 3));
		//System.out.println(Solution2.solution(6, road2, 4));
	}
}
