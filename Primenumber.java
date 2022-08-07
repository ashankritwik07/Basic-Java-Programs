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
