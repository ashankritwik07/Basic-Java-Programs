/*
 * Question:-
 * 1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.
 */


package MyClass;
import java.util.Scanner;
public class anybasetodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int f = getAnybasetoDecimal(n , b);
		System.out.println(f);

	}
	public static int getAnybasetoDecimal(int n , int b ) {
		int rv = 0;
		int p = 1;
		while(n>0) {
			int dig = n % 10;
			n = n / 10;
			rv += dig * p;
			p = p* b;
		}
		return rv;
	}

}
