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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i =0;i<t ;i++ ){
		    int c= sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int m = c-x;
		    
		    int count = m*y;
		    
		    System.out.println(count);
		} 
	}
}
