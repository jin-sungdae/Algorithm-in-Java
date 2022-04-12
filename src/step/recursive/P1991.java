package step.recursive;

import java.util.*;
import java.io.*;

class Node{
	char data;
	Node lt;
	Node rt;
	Node(char data){
		this.data = data;
		lt = rt = null;
	}
}

public class P1991 {
	public static Node root;
	public static void TreeRoot(char P, char L, char R) {
		if (root == null) {
			root = new Node(P);
			if (L != '.') 
				root.lt = new Node(L);
			if (R != '.')
				root.rt = new Node(R);
		} else {
			Tree(P, L, R, root);
		}
	}

	
	public static void Tree(char P, char L, char R, Node node) {
		if (node == null) return;
		else if (node.data == P) {
			if (L != '.')
				node.lt = new Node(L);
			if (R != '.')
				node.rt = new Node(R);
		} else {
			Tree(P, L, R, node.lt);
			Tree(P, L, R, node.rt);
		}
	}
	
	public static void DFS1(Node root) {
		if (root == null) return;
		else {
			System.out.print(root.data);
			DFS1(root.lt);
			DFS1(root.rt);
		}
	}
	public static void DFS2(Node root) {
		if (root == null) return;
		else {
			DFS2(root.lt);
			System.out.print(root.data);
			DFS2(root.rt);
		}
	}
	public static void DFS3(Node root) {
		if (root == null) return;
		else {
			
			DFS3(root.lt);
			DFS3(root.rt);
			System.out.print(root.data);
		}
	}
	
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		char [] list = new char[3];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 3; j++) {
				list[j] = st.nextToken().charAt(0);
			}
			
			TreeRoot(list[0], list[1], list[2]);
		}
		DFS1(root);
		System.out.println();
		DFS2(root);
		System.out.println();
		DFS3(root);
	}
}

