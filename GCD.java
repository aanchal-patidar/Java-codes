package java_programs;

import java.util.Scanner;

public class GCD {
	public static int findGCD(int a , int b) {
		while(b != 0) {
			int temp = b;
			b= a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println( findGCD(n1,n2));
	}

}
