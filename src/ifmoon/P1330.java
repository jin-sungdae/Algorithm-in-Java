package ifmoon;

import java.util.*;

public class P1330 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n > m) System.out.println(">");
		if (n < m) System.out.println("<");
		if (n == m) System.out.println("==");
	}
}
