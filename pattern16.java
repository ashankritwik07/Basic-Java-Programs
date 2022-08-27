/*
 * Question:-
 * 1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
      
      Pattern:-
      1           1
      1 2       2 1
      1 2 3   3 2 1
      1 2 3 4 3 2 1
 */

package MyClass;
import java.util.Scanner;
public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int sp = 2 * n - 3;
   int st = 1;
   for(int i = 1 ; i<=n ; i++) {
	   int val = 1;
	   for(int j=1 ; j<=st ; j++) {
		   System.out.print(val + "\t");
		   val++;
	   }
	   for(int j=1 ; j<=sp ; j++) {
		  System.out.print("\t");
	   }
	   if(i==n) {
		   st--;
		   val--;
	   }
	   for(int j=1 ; j<=st ; j++) {
		   val--;
		   System.out.print(val + "\t");
		   
	   }
	   sp -= 2 ;
	   st++;
	   System.out.println();
	   
   }
   
	}

}
