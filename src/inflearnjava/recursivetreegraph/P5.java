package inflearnjava.recursivetreegraph;

import java.util.*;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class P5 {
	public static Node root;
	public static void DFS(Node root) {
		if (root == null) return;
		else {
			// System.out.print(root.data + " ");
			DFS(root.lt);
			// System.out.print(root.data + " ");
			DFS(root.rt);
			System.out.print(root.data + " ");
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
		DFS(root);
	}
}
