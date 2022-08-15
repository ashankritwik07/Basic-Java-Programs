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
