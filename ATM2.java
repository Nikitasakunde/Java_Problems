/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		int ans, i;
		
		while(t-- >0 ){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int arr[] = new int[n];
		    for (i =0;i<n ;i++ ){
		        arr[i] = sc.nextInt();
		        
		    } 
		    for (i =0;i<n ;i++ ){
		        if(m-arr[i] >= 0){
		            m = m-arr[i];
		            ans = 1;
		        }else{
		            ans = 0;
		        }
		        System.out.print(ans);
		    } 
		    System.out.println();
		} 
	}
}
