/*
 * Question:-
 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM
 */

package MyClass;

import java.util.Scanner;

public class gcdandlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int on1 = n1;
		int on2 = n2;
		while(n1 % n2 != 0);
		{
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
		}
		int gcd = n2;
		
		int lcm = (on1*on2)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		

	}

}
