/*
 * Question:-
 * 
 * 1. You are given a number n.
2. You've to write code to print the pattern given in output format below.
 * 
 * 
 * 
   		*	
		*	*	
*	*	*	*	*	
		*	*	
		*
 */


package MyClass;
import java.util.Scanner;
public class pattenr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=sp ; j++) {
				if(i==n/2 + 1) {
					System.out.print("*\t");
				}else {
				System.out.print("\t");
				}
			}
			for(int j=1 ; j<=st ; j++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				st++;
			}
			else {
				st--;
			}
			System.out.println();
		}

	}

}
