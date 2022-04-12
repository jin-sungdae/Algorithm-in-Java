package step.implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P23629 {

    public static String test(String s){
        LinkedList<Long> numList = new LinkedList<>();
        LinkedList<Character> opList = new LinkedList<Character>();
        String num = "";
        boolean check = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    if (num == "")
                        check = false;
                    else if (num != "")
                        numList.add(Long.parseLong(num));
                    opList.add(ch);
                    num = "";
                    continue;
                }

                num += ch;
            }


            if (!num.isEmpty() )
                numList.add(Long.parseLong(num));
            else {
                System.out.println("Madness!");
                return "";
            }

        while(!opList.isEmpty() && check == true) {
            long prevNum = numList.poll();
            long nextNum = numList.poll();
            char op = opList.poll();

            if(op == '+') {
                numList.addFirst(prevNum + nextNum);
            } else if(op == '-') {
                numList.addFirst(prevNum - nextNum);
            } else if(op == '*') {
                numList.addFirst(prevNum * nextNum);
            } else if(op == '/') {
                numList.addFirst(prevNum / nextNum);
            }
        }

        String res = "";

        if (check == true) {
            s = s.replace("*", "x");
            System.out.println(s+"=");

            res = String.valueOf(numList.poll());
        }
        else if (check == false){
            res = "Madness!";
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.replaceAll("ONE", "1").replaceAll("TWO", "2")
                .replaceAll("THREE", "3").replaceAll("FOUR", "4")
                .replaceAll("FIVE", "5").replaceAll("SIX", "6")
                .replaceAll("SEVEN", "7").replaceAll("EIGHT", "8")
                .replaceAll("NINE", "9").replaceAll("ZERO", "0");


        str = str.replace("=", "");

        if ((str.contains("A") || str.contains("B") || str.contains("C") || str.contains("D") ||
                str.contains("E") || str.contains("F") || str.contains("G") || str.contains("H") ||
                str.contains("I") || str.contains("J") || str.contains("K") || str.contains("L") ||
                str.contains("M") || str.contains("N") || str.contains("O") || str.contains("P") ||
                str.contains("Q") || str.contains("R") || str.contains("S") || str.contains("T") ||
                str.contains("U") || str.contains("V") || str.contains("W") || str.contains("X") ||
                str.contains("Y") || str.contains("Z") )){
            System.out.println("Madness!");
        }
        else {

            str = str.replaceAll("x", "*");
            String result = test(str);
            result = result.replaceAll("1", "ONE").replaceAll("2", "TWO")
                        .replaceAll("3", "THREE").replaceAll("4", "FOUR")
                        .replaceAll("5", "FIVE").replaceAll("6", "SIX")
                        .replaceAll("7", "SEVEN").replaceAll("8", "EIGHT")
                        .replaceAll("9", "NINE").replaceAll("0", "ZERO");
            System.out.println(result);
            }
        }
    }

