/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		 int counter=0;
		 while(n!=0)
		 {
		     n=n/10;
		     counter++;
		 }
		 System.out.println(counter);
	}
}

