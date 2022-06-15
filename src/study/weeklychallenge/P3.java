package study.weeklychallenge;

class Solution3 {

    public static int solution(String word) {
    	String str = "AEIOU";
    	int [] x = {781, 156, 31, 6, 1};
    	int index, result = word.length();
    	for (int i = 0; i < word.length(); i++) {
    		index = str.indexOf(word.charAt(i));
    		result += x[i] * index;
    	}
        
        
        
        return result;
    }
}


public class P3 {
	public static void main(String []args) {
		System.out.println(Solution3.solution("AAAAE"));

	}

}
