package step.implementation;

import java.util.Scanner;

public class P2920 {
    static int[] asc = {1,2,3,4,5,6,7,8};
    static int[] des = {8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] test = new int[8];
        for (int i = 0; i < 8; i++){
            test[i] = sc.nextInt();
        }
        boolean ascCheck = true;
        boolean desCheck = true;
        for (int i = 0; i < 8; i++){
            if (test[i] != asc[i])
                ascCheck = false;
            if (test[i] != des[i])
                desCheck = false;
        }
        if (ascCheck == true)
            System.out.println("ascending");
        else if (desCheck == true)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
