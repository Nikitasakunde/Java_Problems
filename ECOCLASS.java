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
		int i, t=sc.nextInt();
		for(i=0;i<t;i++)
		{
		    int j, sum=0;
		    int n = sc.nextInt();
		    int[] a = new int[1000];
		    int[] b = new int[1000];
		    for(j=0;j<n;j++)
		    {
		        a[j]= sc.nextInt();
		    }
		    for(j=0;j<n;j++)
		    {
		        b[j]= sc.nextInt();
		         if(a[j]==b[j])
		           sum++;
		    }
		    System.out.println(sum);
		}
	}
}
