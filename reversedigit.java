/*
 * Question:-
 
 * 1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.
 */

package MyClass;

import java.util.Scanner;

public class reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0) {
			int dig = n % 10;
			n = n / 10 ;
			System.out.println(dig);
		}

	}

}
