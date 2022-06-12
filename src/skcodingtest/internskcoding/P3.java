package skcodingtest.internskcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class Point {
    String x;
    LinkedList<String> list;
    Point (String x, LinkedList<String> list){
        this.x = x;
        this.list = list;
    }
}

class Solution3 {
    public static int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = {};
        String info = "";
        String [] newPlans = new String[plans.length];

        LinkedList<LinkedList<String>> list = new LinkedList<>();
        for (int i = 0; i < plans.length; i++){
            String []temp = plans[i].split(" ");
            newPlans[i] = temp[0] + " ";
            String ex = "";
            for (int j = 1; j < temp.length; j++){
              //  if (j != temp.length - 1)
                    ex += temp[j] + " ";
              //  else
              //      ex += temp[j];
            }
            info += ex;
            newPlans[i] += info;
            System.out.println(newPlans[i]);
        }

        for (int i = 0; i < clients.length; i++){
            String []temp = clients[i].split(" ");
            String ex = "";
            for (int z = 1; z <temp.length; z++){
//                ex += temp[z] + " ";
                int ch = 0;
                for (int j = 0; j < newPlans.length; j++){
                    if (!newPlans[j].contains(temp[z])){
                        ch = 0;
                        break;
                    } else {
                        ch++;
                    }
                }

            }
            System.out.println("=======" + ex);
            for (int j = 0; j < newPlans.length; j++) {
                if (newPlans[j].contains(ex)) {
                    System.out.println(" +++++ " + ex);
                }
            }
        }
//        for (int i = 0; i < clients.length; i++){
//            String []temp = clients[i].split(" ");
//            String ex ="";
//            boolean ch = true;
//            for (int j = 1; j < temp.length;j++) {
//                for (int z = 0; z < newPlans.length; z++) {
//                    if (!newPlans[z].contains(temp[j])) {
//                        ch = false;
//                        break;
//                    }
//                }
//            }
//            if (ch == true){
//
//            }
//        }




        return answer;
    }
}

class Solution4 {
    public static int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = {};

        String []key1 = new String[plans.length];
        String info = "";
        String [] newPlans = new String[plans.length];
        for (int i = 0; i < plans.length; i++){
            String []temp = plans[i].split(" ");
            newPlans[i] = temp[0] + " ";
            key1[i] = temp[0];
            String ex = "";
            for (int j = 1; j < temp.length; j++){

                ex += temp[j] + " ";

            }
            info += ex;
            newPlans[i] += info;
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < newPlans.length; i++){
            String ex = "";
            String temp[] = newPlans[i].split(" ");
            String key = temp[0];
            ArrayList<String> arr = new ArrayList<>();
            for (int j = 1; j < temp.length; j++){
                arr.add(temp[j]);
            }
            map.put(key, arr);
        }
        for (String x : map.keySet()){
            System.out.println(x);
            for (String s : map.get(x)){
                System.out.println(s);
            }
        }

        HashMap<String, ArrayList<String>> clientMap = new HashMap<>();
        for (int i = 0; i < clients.length; i++){
            String temp[] = clients[i].split(" ");
            String key = Integer.toString(i);
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < temp.length; j++){
                list.add(temp[j]);
            }
            clientMap.put(key, list);

        }

        for (String x : clientMap.keySet()){
            System.out.println(x);
            clientMap.get(x).get(0);
            for (int i = 0; i < key1.length; i++){
                if (Integer.parseInt(clientMap.get(x).get(0)) <= Integer.parseInt(key1[i])){
                    for (String t : clientMap.get(x)) {
                        if (map.get(key1[i]).contains(t)) {
                            System.out.println("number");
                        }
                    }
                }
            }

            for (String s : clientMap.get(x)){
                System.out.println(" +++++ " + s);
            }
        }




        return answer;
    }
}


public class P3 {
    public static void main(String[] args) {
        String [] plans = {"100 1 3", "500 4", "2000 5"};
        String [] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
        for (int x : Solution4.solution(5, plans, clients)){
            System.out.println(x);
        }
    }
}
