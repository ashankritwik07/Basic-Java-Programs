/*
 * Question:-
 * 1. You are given a number n.
2. You've to create a pattern as shown in output format

   Pattern:-
   1
   1 1 
   1 2 1
   1 3 3 1
   1 4 6 4 1 
   1 5 10 10 5 1
 */


package MyClass;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int icj = 1;
			for(int j=0 ; j<=i ; j++) {
				System.out.print(icj + "\t");
				int icjp1 = icj * (i-j) / (j+1);
				icj = icjp1;
			}
			System.out.println();
		}

	}

}
