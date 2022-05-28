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
		    int x = sc.nextInt();
		    int y= sc.nextInt();
		    
		    int count1 = x*10;
		    int count2 = y*90;
		    
		    int sum = count1+count2;
		    System.out.println(sum);
		}
	}
}
