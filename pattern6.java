/*
 * Question:-
 * 1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format

Pattern:- 
   * * *  * * * 
   * *      * *
   *          *
   * *      * *
   * * *  * * *           
 */


package MyClass;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp =1;
		int st = n/2 + 1 ;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=st ; j++) {
				System.out.print("*\t");
			}
			for(int j=1 ; j<=sp ; j++) {
				System.out.print("\t");
			}
			for(int j=1 ; j<=st ; j++) {
				System.out.print("*\t");
			}
			if(i<= n/2) {
				sp+=2;
				st--;
			}
			else {
				sp-=2;
				st++;
			}
			System.out.println();
		}
		

	}

}
