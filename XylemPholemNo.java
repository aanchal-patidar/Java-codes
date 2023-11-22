package java_programs;

import java.util.Scanner;

public class XylemPholemNo {
	
	public static void xylem(int n) {
		int sumOfExt = n%10;
		n/=10;
		int sumOfMid = 0;
		while(n >9) {
			int rem = n%10;
			sumOfMid+=rem;
			n/=10;
		}
		sumOfExt += n;
		if(sumOfMid == sumOfExt) {
			System.out.println("Xylem no.");
		}else {
			System.out.println("Pholem no.");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		xylem(n);

	}

}
