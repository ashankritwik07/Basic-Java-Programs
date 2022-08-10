/*
 * Question:-
 * 1. You've to display the digits of a number.
   2. Take as input "n", the number for which digits have to be displayed.
   3. Print the digits of the number line-wise.
 */

package MyClass;

import java.util.Scanner;
public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	      int nod = 0;
	      // nod = number of digit;
	      //temp = temporary
	      int temp = n;
	      while(temp!=0){
	          temp = temp/10;
	          nod++;
	          
	      }
	      int div=(int)Math.pow(10,nod-1);
	      while(div!=0){
	          int q = n/div;
	          System.out.println(q);
	          
	          n = n%div;
	          div = div/10;
	      }

	}

}
