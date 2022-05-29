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
		
		for (int i=0;i<t ;i++ ){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int sum = a+b;
		    int count =0;
		    String a1 = String.valueOf(sum);
		    
		    for (int j=0;j<a1.length() ;j++ ){
		        if(a1.charAt(j)=='0' || a1.charAt(j)=='6' || a1.charAt(j)=='9'){
		            count+=6;
		        }else if(a1.charAt(j) == '1'){
		            count+=2;
		        }else if(a1.charAt(j) == '2' || a1.charAt(j) == '3' || a1.charAt(j) == '5'){
		            count+=5;
		        }else if(a1.charAt(j) == '4'){
		            count+=4;
		        }else if(a1.charAt(j) == '7'){
		            count+=3;
		        }else if(a1.charAt(j) == '8'){
		            count+=7;
		        }
		    }
		    System.out.println(count);
		} 
	}
}
