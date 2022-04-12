package step.recursive;
import java.util.*;
import java.io.*;

class Node1{
	String data;
	Node1 lt;
	Node1 rt;
	Node1(String data){
		this.data = data;
		lt = rt = null;
	}
}

class TreeNode {
	public static void inputNode(Node1 node, String data) {
		if (Integer.parseInt(node.data) > Integer.parseInt(data)){
			if (node.lt == null) {
				node.lt = new Node1(data);
			}
			else inputNode(node.lt, data);
		} else if (Integer.parseInt(node.data) < Integer.parseInt(data)) {
			if (node.rt == null) {
				node.rt = new Node1(data);
			}
			else inputNode(node.rt, data);
		}
	}
	
	public static void DFS3(Node1 root) {
		if (root == null) return;
		else {
			DFS3(root.lt);
			DFS3(root.rt);
			System.out.println(root.data);
		}
	}
}

public class P5639 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeNode tree = new TreeNode();
		String rootN = br.readLine();
		Node1 root = new Node1(rootN);
		while (true) {
			String N = br.readLine();
			if (N == null || N.contentEquals(""))
				break;
			tree.inputNode(root, N);
		}
		tree.DFS3(root);
	}
}
