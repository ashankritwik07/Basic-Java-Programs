Question:-

/*
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
Solution:-

package MyClass;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1 ; i<=t ; i++)
		{  
			int n = sc.nextInt();
			boolean flag = false;
			for(int j=2 ; j<=n-1 ; j++)
			{
				if(j%n==0) {
					System.out.println("not prime");
					flag = true;
					break;
				}
			
				}
			if(flag==false){
				System.out.println("prime");
					 
				}
			
		
		}

	}

}
/*
 in the 15th line we can change the meathod to check weather a number is "prime" or" not prime"
 for(int j=2 ; j*j<=n ; j++)
 we can check it by applying square roots;
 */
