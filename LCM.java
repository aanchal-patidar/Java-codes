package java_programs;

import java.util.Scanner;

public class LCM {
	public static void lcmNo(int a , int b) {
		int max = a >b ? a: b;
		int sq = a*b;
		for(int i = max ; i <= sq ; i+=max) {
			if(i%a == 0 && i%b == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		lcmNo(n1,n2);

	}

}
