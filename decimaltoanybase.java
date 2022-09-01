/*
Question:-
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.
*/

package MyClass;
import java.util.Scanner;
public class decimaltoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int dn = decimaltoanybase(n , b);
		System.out.println(dn);

	}
	public static int decimaltoanybase(int n , int b) {
		int rv =0;
		int p = 1;
		while(n>0) {
			int dig= n % b;
			n = n/b;
			
			rv += dig *p;
			p = p*10;
		}
		
		
		
		
		return rv ;
	}

}
