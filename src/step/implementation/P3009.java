package step.implementation;

import java.util.*;
import java.io.*;

public class P3009 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int [] a = new int[2];
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		int [] b = new int[2];
		int [] c = new int[2];
		int [] d = new int[2];
		b[0] = Integer.parseInt(st1.nextToken());
		b[1] = Integer.parseInt(st1.nextToken());
		c[0] = Integer.parseInt(st2.nextToken());
		c[1] = Integer.parseInt(st2.nextToken());
		if (a[0] == b[0] && a[0] != c[0])
			d[0] = c[0];
		else if (b[0] == c[0] && b[0] != a[0])
			d[0] = a[0];
		else if (a[0] == c[0] && a[0] != b[0])
			d[0] = b[0];
		if (a[1] == b[1] && a[1] != c[1])
			d[1] = c[1];
		else if (b[1] == c[1] && b[1] != a[1])
			d[1] = a[1];
		else if (a[1] == c[1] && a[1] != b[1])
			d[1] = b[1];
		System.out.println(d[0] + " " + d[1]);
	}
}
