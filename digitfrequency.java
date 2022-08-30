/*
 * QUESTION:-
 * 1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
 */

package MyClass;
import java.util.Scanner;
public class digitfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int f = getDigitFrequency(n ,d);
		System.out.println(f);

	}
	public static int getDigitFrequency(int n , int d) {
	 int rv = 0;
	 while(n>0) {
		 int dig = n % 10;
		 n = n / 10;
		 if(n==d) {
			 rv++;
		 }
	 }
	 return rv;
	}

}
