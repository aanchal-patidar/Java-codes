package java_programs;

import java.util.Scanner;

public class NeonNo {
	
	public static void neon(int n) {
		int sum = 0;
		int sq = n * n;
		while(sq >0) {
			int digit = sq % 10;
			sum += digit;
			sq/=10;
		}
		if(sum == n) {
			System.out.println("Neon no.");
		}else {
			System.out.println("Not Neon");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		neon(n);

	}

}
