package java_programs;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n1+" "+n2+ " ");
		for(int i = 1 ; i <= n ; i++) {
			int nextNum = n1+n2;
			System.out.print(nextNum+" ");
			n1=n2;
			n2=nextNum;
		}

	}

}
