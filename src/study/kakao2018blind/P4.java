package study.kakao2018blind;

class Solution4 {
    public static String change(String s){
        s = s.replaceAll("C#", "Z");
        s = s.replaceAll("D#", "Y");
        s = s.replaceAll("F#", "O");
        s = s.replaceAll("G#", "P");
        s = s.replaceAll("A#", "Q");
        String newStr = s;
        return newStr;
    }
    public static String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxMusicTime = -1;
        m = change(m);
        for (int i = 0; i < musicinfos.length; i++){
            String temp[] = musicinfos[i].split(",");
            temp[3] = change(temp[3]);
            String [] timeInfo = temp[0].split(":");
            int start = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);
            int end = 0;

            timeInfo = temp[1].split(":");
            end = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);
            int play = end - start;
//            if (play > temp[3].length()){
//                String melody = "";
//                for (int t = 0; t < play / temp[3].length(); t++)
//                    melody += temp[3];
//                melody += temp[3].substring(0, play % temp[3].length());
//
//                temp[3] = melody;
//            } else {
//                temp[3] = temp[3].substring(0, play);
//            }
            String melody = "";
            for (int t = 0; t < play / temp[3].length(); t++)
                melody += temp[3];
            for (int t = 0; t < play % temp[3].length(); t++)
                melody +=temp[3].charAt(t);


            temp[3] = melody;
            if (temp[3].contains(m) && play > maxMusicTime){
                answer = temp[2];
                maxMusicTime = play;

            }
        }

        return maxMusicTime != -1 ? answer : "(None)";
    }
}

public class P4 {
    public static void main(String[] args) {
        String [] ex = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(Solution4.solution("ABC",ex));
    }
}
