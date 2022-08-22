/*
Question:-
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Pattern:=
       *
      *
     *
    *
   *
   */
    

package MyClass;
import java.util.Scanner;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	        
	        for(int i=1 ; i<=n ; i++){
	            for(int j = 1; j<=n ; j++){
	                if(i+j==n+1){
	                    System.out.print("*\t");
	                }
	                else{
	                    System.out.print("\t");
	                }
	                
	                }
	                System.out.println();
	            }

	}

}
