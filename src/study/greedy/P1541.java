package study.greedy;

import java.util.*;

public class P1541 {

	public static int solution (String str){
		int result = 0, temp = 0, flag = 0, ch = 0, intNum = 0;
		String num = "0";
		String fristNum = "";
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == '-' || str.charAt(i) == '+') break;
			fristNum += str.charAt(i);
			flag++;
		}
		result += Integer.parseInt(fristNum);
		for (int i = flag; i < str.length(); i++){
			if (!(str.charAt(i) == '+' || str.charAt(i) == '-')) num += str.charAt(i);
			if (str.charAt(i) == '+' || str.charAt(i) == '-'){
				intNum = Integer.parseInt(num);
				num = "";
				if (ch == 1)temp += intNum;
				else result += intNum;
				if (str.charAt(i) == '-') ch = 1;
			}
		}
		intNum = Integer.parseInt(num);
		if (ch == 1) temp += intNum;
		else result += intNum;

		return result = result - temp;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char []str2 = new char[str.length() + 1];
		for (int i = 0; i < str.length(); i++)
			str2[i] = str.charAt(i);
		System.out.println(solution(str));
	}
}
