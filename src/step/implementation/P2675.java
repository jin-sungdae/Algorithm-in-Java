package step.implementation;

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = 0;
        String str;
        String newStr = null;
        String result = null;
        for (int i = 0; i < T; i++){
            R = sc.nextInt();
            str = sc.next();
            result = "";
            for (int t = 0; t < str.length(); t++) {
                newStr = "";
                for (int j = 0; j < R; j++) {
                    newStr = newStr + str.charAt(t);
                }
                result = result + newStr;
            }
            System.out.println(result);
        }

    }
}
