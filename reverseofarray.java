/*
 * Question:-
 * 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.
 */


package MyClass;
import java.util.Scanner;
public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
Scanner sc = new Scanner(System.in);
public class Main{
	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void reverse(int[] a){
	    // write your code here
	    int i = 0;
	    int j = a.length - 1;
	    while(i<j){
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp ;
	        i++;
	        j--;
	    }
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    display(a);

	}

}
	}
}
