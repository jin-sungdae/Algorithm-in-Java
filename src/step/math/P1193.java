package step.math;

import java.util.*;

public class P1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 1;
        int sun = 1;
        int parent = 1;
        int allSum = 2;
        while (count != num){
            if ((sun + parent) % 2 == 0){
                if (allSum - 1 == parent){
                    parent++;
                } else {
                    sun--;
                    parent++;
                }
            } else {
                if (allSum - 1 == sun){
                    sun++;
                } else {
                    sun++;
                    parent--;
                }
            }
            count++;
            allSum = parent + sun;
        }
        System.out.println(sun + "/" + parent);
    }
}
