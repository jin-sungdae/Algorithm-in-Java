package study.greedy;

import java.util.*;

public class P1541 {
	
	public static int solution(String[] signList, int [] num) {
		int result = 0, flag = 0, temp = 0;
		int i = 0;
		for (int x : num) {
			if (signList[i] == "-") {
				temp +=x;
			} else {
				result += temp;
			}
		}

		
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String temp = str;
		String temp2 = str;
		temp = temp.replace('+', ' ').replace('-', ' ');
		for (int i = 0; i <= 9; i++) {
			temp2 = temp2.replace((char)(i + 48), ' ');
		}
		temp2 = temp2.replaceAll(" ", "");
		System.out.println(temp2);
		String [] numList = temp.split(" ");
		String [] signList = temp2.split("");
		int [] num = new int[numList.length];

		for (int i = 0; i < numList.length; i++) {
			num[i] = Integer.parseInt(numList[i]);
		}

		for  (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}

		for  (int i = 0; i < signList.length; i++) {
			System.out.println(signList[i]);
			
		}
		solution(signList, num);
	}

}
