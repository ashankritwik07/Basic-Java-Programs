/*
Question:-
You are required to display the prime factorization of a number.
Take as input a number n.
Print all its prime factors from smallest to largest.
*/

package MyClass;

import java.util.Scanner;

public class pythagoreantriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		if(b>= max) {
			 max = b;
		}
		if(c>=max) {
			max=c;
		}
		
		if(max == a) {
			boolean flag = ((b*b + c*c) == (a*a));
			System.out.println(flag);
		}
		else if(max == b) {
			boolean flag = ((a*a + c*c) == (b*b));
			System.out.println(flag);
			
		}
		else {
			boolean flag = ((a*a + b*b) == (c*c));
			System.out.println(flag);
			
		}

	}

}
