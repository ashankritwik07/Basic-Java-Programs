/*
 * Question:-
 * 1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
      Pattern;-
 *      *       *		*
		*		*	
*	*	*	*	*	
*		*			
*		*	*	*
 */


package MyClass;
import java.util.Scanner;
public class patten19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);
		     int n = sc.nextInt();
		    for(int i=1 ; i<=n ; i++){
		        for(int j=1 ; j<=n ; j++){
		            if(i==1){
		                if(j==n || j<= n / 2 + 1){
		                    System.out.print("*\t");
		                }
		                else{
		                    System.out.print("\t");
		                }
		            }
		            else if(i<=n/2){
		                 if(j==n || j== n/2 + 1){
		                    System.out.print("*\t");
		                }
		                else{
		                    System.out.print("\t");
		                }
		                
		            }
		            else if(i == n/2 + 1){
		                 System.out.print("*\t");
		                
		            }
		            else if(i<n){
		                  if(j==1 || j== n/2 + 1){
		                    System.out.print("*\t");
		                }
		                else{
		                    System.out.print("\t");
		                }
		                
		            }
		            else{
		                   if(j==1 || j>= n/2 + 1){
		                    System.out.print("*\t");
		                }
		                else{
		                    System.out.print("\t");
		                }
		                
		            }
		        }
		        System.out.println();
		    }

	}

}
