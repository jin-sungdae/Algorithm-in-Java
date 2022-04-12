package step.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.indexOf("dz=") > -1) {
                str = str.replaceFirst("dz=", "0");
                count++;
            }

            else if (str.indexOf("c=") > -1) {
                str = str.replaceFirst("c=", "0");
                count++;
            }

            else if (str.indexOf("c-") > -1) {
                str = str.replaceFirst("c-", "0");
                count++;
            }

            else if (str.indexOf("d-") > -1) {
                str = str.replaceFirst("d-", "0");
                count++;
            }

            else if (str.indexOf("lj") > -1) {
                str = str.replaceFirst("lj", "0");
                count++;
            }

            else if (str.indexOf("nj") > -1) {
                str = str.replaceFirst("nj", "0");
                count++;
            }

            else if (str.indexOf("s=") > -1) {
                str = str.replaceFirst("s=", "0");
                count++;
            }

            else if (str.indexOf("z=") > -1) {
                str = str.replaceFirst("z=", "0");
                count++;
            }
        }

        System.out.println(count + str.length() - str.chars().filter(c -> c== '0').count());
    }
}
