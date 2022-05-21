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
		
		for (int i=0;i<t ;i++ ) {
		    int a = sc.nextInt();
		    int b= sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
                
            if(a <= x && b<=y)
	            {
	             System.out.println("Possible");
	         }
	        else
	            {
	             System.out.println("Impossible");
	            }
	        
            		    

		}
	}
}
