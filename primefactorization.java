/*
 * Question:-
 * 1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
 */


package MyClass;

import java.util.Scanner;

public class primefactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  
		  for(int  div =2 ; div*div<=n ; div++)
		  {
		      while(n%div==0)
		      {
		          n =n/div;
		          System.out.print(div+ " ");
		      }
		  }
		  if(n!=1){
		      System.out.print(n);
		  }
		 }
		

	}
//in line number 20 we can use this also:-
//for(int div =2 ; div<n ; div++)

