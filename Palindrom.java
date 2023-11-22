package java_programs;
import java.util.Scanner;

public class Palindrom {
	
	public static boolean paliNo(int n) {

		int reverse = 0;
		int n1 = n;
		
		while(n>0) {
			int digit = n%10;
			reverse =reverse*10 + digit;
			n/=10;	
		}
		return reverse==n1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(paliNo(n)) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
	}

}
