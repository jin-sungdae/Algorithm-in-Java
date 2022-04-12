package step.implementation;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = sc.next();
        String []NumBer = new String[num];
        int result = 0;
        NumBer = number.split("");
        for (String s : NumBer){
            result += (int)s.charAt(0) - 48;
        }

        System.out.println(result);
    }
}
