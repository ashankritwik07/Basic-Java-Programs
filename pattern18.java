/*
 * Question:-
 * 1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
 * 
 *Pattern:-
    
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
 */


package MyClass;
import java.util.Scanner;
public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int sp = 0;
	     int st = n;
	     for(int i=1 ;i<=n ; i++){
	         for(int j=1 ; j<=sp ; j++){
	           System.out.print("\t");  
	         }
	         for(int j=1; j<=st ; j++){
	             if(i>1 && i<=n/2 && j>1 && j<st){
	                 System.out.print("\t");
	             }else{
	             System.out.print("*\t");
	             }
	         }
	         if(i<=n/2){
	             st-=2;
	             sp++;
	         }
	         else{
	             sp--;
	             st+=2;
	         }
	         System.out.println();  
	         }
	}

}
