/*
 * Question:-
 * 1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value
 */

package MyClass;
import java.util.Scanner;
public class getproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int b = scn.nextInt();
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();

	    int d = getProduct(b, n1, n2);
	    System.out.println(d);
	 }

	 public static int getProduct(int b, int n1, int n2){
	     // write your code here
	     int rv = 0;
	     int p = 1;
	     while(n2>0){
	         int d2 = n2 % 10 ;
	         n2  = n2 / 10;
	         int sprd = getproductwithsingaldigit(b , n1 , d2);
	         rv = getsum(b , rv , sprd * p);
	         p = p*10;
	     }
	     return rv ;
	 }
	  public static int getproductwithsingaldigit(int b, int n1, int d2){
	  int rv = 0;
	  int c = 0;
	  int p = 1;
	  while(n1>0 || c>0){
	      int d1 = n1 % 10 ;
	      n1 = n1/10;
	      int d = d1 * d2 + c;
	      c = d/b;
	      d = d % b;
	      rv = rv + d*p;
	      p = p * 10;
	  }
	  return rv ;
	  }
	  	public static int getsum(int b , int n1 , int n2) {
			int rv =0;
			int c = 0;
			int p = 1;
			while(n1>0 || n2>0 || c>0) {
				int d1 = n1%10;
				int d2 = n2%10;
				n1 = n1 / 10;
				n2 = n2 / 10;
				
				int d = d1 + d2 + c;
				c = d / b;
				d = d % b;
				
				rv += d *p;
				p = p * 10;
			}
			return rv;
		}
	}


