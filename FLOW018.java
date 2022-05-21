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
    	 try{
	        Scanner input=new Scanner (System.in);
	        int T,M,N;
	        T=input.nextInt();
	        
	        for(int i=1;i<=T;i++)
	        {
	            M = 1;
	            N=input.nextInt();
	            for (int j=1;j<=N;j++)
	            {
	                M=M*j;  
	            }
	            System.out.println(M);
	       }
	    }catch(Exception e){
	        return;
	    }
	}
}
