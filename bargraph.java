/*
 * Question:-
 * 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
 */


package MyClass;
import java.util.Scanner;
public class bargraph {

	public static void main(String[] args) {
		// TODO Auto-generated method 
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int[]arr = new int [n];
     
     for(int i=0 ; i<arr.length ; i++) {
    	 arr[i] = sc.nextInt();
     }
     int max = 0;
     for(int i=1 ; i<arr.length ; i++) {
    	 if(arr[i]>max) {
    		 max = arr[i];
    	 }
     }
     
     for(int floor = max ; floor>=1 ; floor--) {
    	 for(int i=0 ; i<arr.length ; i++) {
    		 if(arr[i]>=floor) {
    			 System.out.print("*\t");
    		 }
    		 else {
    			 System.out.print("\t");
    		 }
    		 
    	 }
    	 System.out.println();
     }

	}

}
