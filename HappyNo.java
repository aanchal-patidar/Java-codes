package java_programs;

import java.util.Scanner;

public class HappyNo {
	
	public static void happy(int n) {
		do {
			int sum = 0;
			while(n > 0) {
				int digit = n%10;
				sum += digit *digit;
				n /= 10;
			}
			n = sum;
		}while(n > 9);
		if(n == 1 || n == 7) {
			System.out.println("Happy No.");
		}else {
			System.out.println("Not happy No.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		happy(n);
	}

}
