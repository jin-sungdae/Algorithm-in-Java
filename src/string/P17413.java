package string;
import java.io.*;
import java.util.*;

public class P17413 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringBuilder sb = new StringBuilder();

		boolean flag = false;

		Stack < Character > stack = new Stack < > ();


		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				flag = true;
			}
			else if (str.charAt(i) == '>') {
				flag = false;
				sb.append(str.charAt(i));
				continue;
			}

			if (flag == true) {
				sb.append(str.charAt(i));
			}
			else if (flag == false) {
				if (str.charAt(i) == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				} else {
					stack.push(str.charAt(i));
				}
			}
			if (i == str.length() - 1) {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
		}
		System.out.println(sb);
	}
}
