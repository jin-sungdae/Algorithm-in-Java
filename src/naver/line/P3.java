package naver.line;

import java.util.*;

public class P3 {
	
	
	public static int[] solution(int num_teams, String[] remote_tasks, 
			String[] office_tasks, String[] employees) {
		int [] employIndex = new int[employees.length + 1];
		ArrayList<ArrayList<String>> employList = new ArrayList<ArrayList<String>>();

		for (int i = 0; i <= employees.length; i++) {
			employList.add(new ArrayList<String>());
		}
		for (int i = 1; i <= employees.length; i++) {
			String []temp = employees[i - 1].split(" ");
			for (int j = 0; j < temp.length; j++) {
				employList.get(i).add(temp[j]);
			}
		}
		for (int i = 1; i <= employees.length; i++) {
			for (String x : employList.get(i)) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		int [][] result = new int[employees.length + 1][3];
		int [][]teamList = new int[num_teams + 1][2];
		for (int i = 1; i <= employees.length; i++) {
			result[i][0] = i;
			result[i][1] = Integer.parseInt(employList.get(i).get(0));
			for (String x : employList.get(i)) {
				for (int j = 0; j < office_tasks.length; j++) {
					if (x.equals(office_tasks[j])) {
						result[i][2] = 1;
						teamList[result[i][1]][0] = 1;
					}
				}
			}
			
		}
	

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= employees.length; i++) {

			if (result[i][2] == 0 && teamList[result[i][1]][0] == 1) {
				list.add(result[i][0]);
			} else if (result[i][2] == 0 && teamList[result[i][1]][0] == 0 && teamList[result[i][1]][1] == 0){
				//System.out.println(result[i][0]);
				result[i][2] = 1;
				teamList[result[i][1]][0] = 1;
				teamList[result[i][1]][1] = 1;
			}
			System.out.println();
		}
		int [] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num = 3;
		String[] remote = {"development","marketing","hometask"};
		String[] office = {"recruitment","education","officetask"};
		String[] employe = {"1 development hometask","1 recruitment marketing","2 hometask","2 development marketing hometask","3 marketing","3 officetask","3 development"};
		int test = 2;
		String[] remote1 = {"design"};
		String[] office1 = {"building","supervise"};
		String[] employe1 = {"2 design","1 supervise building design","1 design","2 design"};
		solution(test, remote1, office1, employe1);
		
	}
}
