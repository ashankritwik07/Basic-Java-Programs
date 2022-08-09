/*
 * Question :-
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers. 
 */

//Solution:-

package MyClass;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
/*
 *  0 1 1 2 3 5 8 13 21 34
 *  initially a= 0 and b=1 
 *  after that c = a+b; == 0+1=1
 *  than a= 1 and b=1
 *  after that repeat the same process.
 *  
 */

