// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc =new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for (int i=0;i<t ;i++ ){
	        String a = sc.next();
	        
	        int count =0;
	        
	        for (int j=0;j<a.length() ;j++ ){
	            if(a.charAt(j) == '4'){
	                count++;
	                
	            }
	            
	        } 
	    System.out.println(count);
	    } 
	}
}


