/*
 * Chef has an array AA of length NN.

In one operation, Chef can remove any one element from the array.

Determine the minimum number of operations required to make all the elements same.
input                         output
4                             
3
3 3 3                           0
6
1 3 2 1 2 2                     3
4
1 2 1 2                         2
5
1 3 2 4 5                       4
 */


package MyClass;
import java.util.Scanner;
public class removebadelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
			    Scanner sc = new Scanner(System.in);
			    int n = sc.nextInt();
			    for(int i=1 ; i<=n ; i++){
			        int len = sc.nextInt();
				    int[] arr = new int[len];
				for(int j=0 ; j<len ; j++){
				    arr[j] = sc.nextInt();
				    
				}
				int[] c = new int[len+1];
				for(int j=0 ; j<len ; j++){
				    int val = arr[j];
				    c[val]++;
				}
				int max = 0;
				for(int j =0 ; j<len+1 ; j++){
				    if(c[j]>max){
				        max = c[j];
				    }
				}
				    int ans = len - max ;
				    System.out.println(ans);
				}
	}

	}
}
