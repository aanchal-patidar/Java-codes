package java_programs;

import java.util.Scanner;

public class ArmstrongNo {
	public static void armNo(int n) {
		
		int sum = 0;
		int count = 0;
		int n1 = n;
		while(n>0) {
			n/=10;
			count++;	
		}
		
		while(n1 > 10) {
			int digit=n1%10;
			int product = 1;
			for(int i = 1; i <= count ; i++) {
				product *= digit;
			}
			sum += product;
			n1/=10;
			
		}
		int n2 = n;
		if(sum == n2) {
			System.out.println("Armstrong no.");
		}else {
			System.out.println("Not Armstrong");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		armNo(n);
	}

}
