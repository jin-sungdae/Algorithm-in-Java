package step.implementation;

import java.util.Scanner;

public class P3053 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		double R = in.nextDouble();
		in.close();
		
		System.out.println(R * R * Math.PI);
		System.out.println(2 * R * R);		
	}
}
