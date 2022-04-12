package step.implementation;



import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String test;
        int strCheck = 0;
        int check = 0;
        for (int i = 0; i < num; i++){
            test = sc.next();
            char[] strLen = new char[test.length()];
            int count = 1;
            strLen[0] = test.charAt(0);
            if (test.length() != 1) {
                for (int j = 1; j < test.length(); j++) {
                    if (test.charAt(j) != test.charAt(j - 1)) {
                        strLen[count] = test.charAt(j);
                        count++;
                    }
                }
                for (int q = 0; q < count; q++) {
                    for (int w = q + 1; w < count; w++) {
                        if (strLen[q] == strLen[w]) {
                            strCheck++;
                            break;
                        }
                    }
                }
                if (strCheck > 0)
                    check++;
                strCheck = 0;
            }
        }
        System.out.println(num - check);

    }
}
