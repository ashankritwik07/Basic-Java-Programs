/*
Questin :-
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
   */


package MyClass;

import java.util.Scanner;

public class rotatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int temp = 0;
		int nod = 1;
		while(temp>0) {
			temp = temp /10;
			nod++;
		}
		k = k%nod;
		if(k<0) {
			k = k+nod;
		}
		 int div = 1;
		 int mult = 1;
		 for(int i=1 ; i<=nod ; i++) {
			 if(i<=k) {
				 div = div*10;
			 }
			 else{
				 mult = mult*10;
			 }
			 int q = n/div;
			 int r = n%div;
			 int rot = r*mult+q;
			 System.out.println(rot);
		 }

	}

}
