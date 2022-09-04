package MyClass;
import java.util.Scanner;
public class anybasesubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int f = getsubs(b , n1 , n2);
		System.out.println(f);
	}
	public static int getsubs(int b , int n1 , int n2 ) {
		int rv =0;
		int c= 0;
		int p =1 ;
		while(n2>0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d2 = n2 % 10;
			n2 = n2 / 10;
			
			int d = 0;
			d2 = d2 + c;
			if(d2 >= d1) {
				c =0;
				d = d2 - d1 ;
			}
			else {
				c = -1;
				d = d2+8 - d1;
				p = p*10;
			}
			rv = rv+d * p;
			p = p*10;
		}	
		return rv;
	}

}
