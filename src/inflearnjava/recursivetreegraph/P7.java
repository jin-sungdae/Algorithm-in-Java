package inflearnjava.recursivetreegraph;

import java.util.*;

public class P7 {
	
	public static Node root;
	public static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node current = Q.poll();
				System.out.print(current.data + " ");
				if (current.lt != null){ Q.offer(current.lt);}
				if (current.rt != null){ Q.offer(current.rt);}
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		BFS(root);
	}
}
