/*
 * Question:-
 * 1. You are given a number n.
2. You've to create a pattern as shown in output format.

Pattern :-
 1
 2 3
 4 5 6
 7 8 9 10 
 11 12 13 14 15
 */

package MyClass;
import java.util.Scanner;
public class patten11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 1;
		for(int i=1 ;i<=n ; i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
		}

	}

}
