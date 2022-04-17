package study.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class employee implements Comparable<employee>{
    int doc, interview;
    employee(int doc, int interview){
        this.doc = doc;
        this.interview = interview;
    }
    @Override
    public int compareTo(employee e){
        return this.doc - e.doc;
    }
}

public class P1946 {
    static  ArrayList<employee> arrayList;

    public static int solution(int N){
        int result = 0;
        Collections.sort(arrayList);
        int max = Integer.MAX_VALUE;
        for (employee e : arrayList){
            if (e.interview < max) {
                max = e.interview;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int N = sc.nextInt();
            arrayList = new ArrayList<>();
            for (int j = 0; j < N; j++){
                int doc = sc.nextInt();
                int interview = sc.nextInt();
                arrayList.add(new employee(doc, interview));
            }
            System.out.println(solution(N));
        }
    }
}
