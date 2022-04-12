package inflearnjava.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int index, priority;
    Person(int index, int priority){
        this.index = index;
        this.priority = priority;
    }
}

public class P8 {
    static Queue<Person>q;

    public static int solution(int M){
        int result = 1;

        while (!q.isEmpty()){
            Person tmp = q.poll();
            for (Person x : q){
                if (x.priority > tmp.priority){
                    q.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null){
                if (tmp.index == M) return result;
                else result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        q = new LinkedList<>();
        for (int i = 0; i < N; i++){
            q.add(new Person(i, sc.nextInt()));
        }
        System.out.println(solution(M));
    }
}
