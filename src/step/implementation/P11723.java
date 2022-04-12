package step.implementation;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11723 {
	public static void main(String []args)throws IOException{
		HashSet<Integer> set = new HashSet<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(bf.readLine());
		String command;
		HashSet<Integer> allNum = new HashSet<Integer>();
		for (int i = 1; i <= 20; i++) {
			allNum.add(i);
		}
		StringBuilder sb = new StringBuilder();
		int num = 0; 
		for (int i = 0; i < M; i++) {
			String[] input = bf.readLine().split(" ");

			if (input[0].equals("add")) {
				num = Integer.parseInt(input[1]);
				set.add(num);
			} else if (input[0].equals("remove")) {
				num = Integer.parseInt(input[1]);
				set.remove(num);
			} else if (input[0].equals("check")) {
				num = Integer.parseInt(input[1]);
				if (set.contains(num)) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				
			} else if (input[0].equals("toggle")) {
				num = Integer.parseInt(input[1]);
				if (set.contains(num)) {
					set.remove(num);
				} else {
					set.add(num);
				}
				
			} else if (input[0].equals("all")) {
				set.addAll(allNum);
				
			} else if (input[0].equals("empty")) {
				set.clear();
			}
			
		}
		System.out.println(sb.toString());
		bf.close();
	}
}
