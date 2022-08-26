/*
 * Question:-
 * 1. You are given a number n.
2. You've to write code to print it's multiplication table up to 10 in format given below.

pattern:-
x * 1 = x
x * 2 = 2x
..
x * 10 = 10x
 */

package MyClass;
import java.util.Scanner;
public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 1 ; i<=10 ; i++) {
			int val = x * i;
			System.out.println(x + " * " + i + " = " + val);
		}
		

	}

}
