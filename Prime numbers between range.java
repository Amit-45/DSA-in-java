/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt(); 
		int high=sc.nextInt(); 
		
		for (int n=low;n<=high ;n++)
		{
		    
		    //prime logic
		    int count=0;
		    	for (int j=2;j*j<=n ;j++)
		    	{
		    	    if(n%j==0)
		    	    {
		    	        count++;
		    	        break;
		    	    }
		    	}
		    
		    //prime logic
		    
		    if(count==0)
		    {
		    System.out.println(n);
		    }
		} 
	}
}
