package step.implementation;


import java.util.Scanner;

public class P10809 {
    static int []alpa = {-1, -1, -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++){
            if (alpa[(int)str.charAt(i) - 'a'] == -1)
                alpa[(int)str.charAt(i) - 97] = i;
        }

        for (int i : alpa){
            System.out.print(i + " ");
        }

    }
}
