package inflearnjava.recursivetreegraph;

import java.util.*;

public class P10 {
	public static Node root;
	public static int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node curr = Q.poll();
				if (curr.lt == null && curr.rt == null) return L;
				if (curr.lt != null) Q.offer(curr.lt);
				if (curr.rt != null) Q.offer(curr.rt);
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String []args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		System.out.println(BFS(root));
	}
}
