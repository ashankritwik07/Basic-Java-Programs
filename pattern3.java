/*
 * Question:-
 * 1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
pattern:-
     *
    **
   ***
  ****
 *****
 */


package MyClass;

import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n-1;
		int st =1;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=sp ; j++) {
				System.out.print("\t");
			}
			for(int j=1 ; j<=st ; j++) {
				System.out.print("*\t");
			}
			sp--;
			st++;
			System.out.println();
		}

	}

}
// sp = space;
//st = stars;
