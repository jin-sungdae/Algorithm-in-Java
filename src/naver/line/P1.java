package naver.line;

import java.util.*;
import java.io.*;
public class P1 {
	
	static int solution(String [] log) {
		int answer = 0;
		boolean check = true;
		for (int i = 0; i < log.length; i++) {
			check = true;
			int nullCnt = 0;
			if (log[i].contains("team_name : ") && log[i].contains(" application_name : ")
					&& log[i].contains(" error_level : ") && log[i].contains(" message : ")) {
				if (log[i].length() > 100) {
					answer++;
					check =false;
				}
				log[i] = log[i].replace("team_name : ","").replace(" application_name : ", " ")
				.replace(" error_level : ", " ").replace(" message : ", " ");
			

				for (int j = 0; j < log[i].length(); j++) {
					char tmpchar = log[i].charAt(j);
					if (tmpchar == ' ') {
						nullCnt++;
					}
				}
				if (nullCnt != 3 && check == true) {
					answer++;
					check = false;
				}

				String [] temp = log[i].split(" ");
				
				if (temp.length != 4 && check == true) {
					answer++;
					check = false;
				}
				int j = 0;
			
				if ((log[i].contains("0") ||log[i].contains("1") || log[i].contains("2")
						|| log[i].contains("3")|| log[i].contains("4") || log[i].contains("5")
						|| log[i].contains("6") || log[i].contains("7") || log[i].contains("8")
						|| log[i].contains("9")) && check == true) {
					answer++;
					check = false;
				}
				
				
				if ((log[i].contains("!") || log[i].contains("@") || log[i].contains("#")
						|| log[i].contains("$") || log[i].contains("%") || log[i].contains("^")
						|| log[i].contains("&") || log[i].contains("*") || log[i].contains("(") || log[i].contains(")")
						|| log[i].contains(",") || log[i].contains(".") || log[i].contains("?") || log[i].contains("\\") ||
						log[i].contains("\"") || log[i].contains(":") || log[i].contains("{") || log[i].contains("}") || log[i].contains("|")
						|| log[i].contains("<") || log[i].contains(">") || log[i].contains("[") || log[i].contains("]"))&& check == true) {
					answer++;
				}

			}
			else
				answer++;
		}
		return answer;
	}
	
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] log = new String[1];
		
		for (int i = 0; i< 1; i++) {
			String temp = br.readLine();
			temp = temp.substring(1, temp.length() - 1);
			log[i] = temp;
			
		}
		System.out.println(solution(log));
	}
}
