/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	     int a,b,c,d,e;
	     try
	     {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Your Amount");
	        int n=Integer.parseInt(br.readLine());
	
	a=n/2000;
	System.out.println("number of 2000 rupees notes: "+a);
	n=n%2000;
	
	b=n/500;
	System.out.println("number of 500 rupees notes: "+b);
	n=n%500;
	
	c=n/200;
	System.out.println("number of 200 rupees notes: "+c);
	n=n%200;
	
	d=n/100;
	System.out.println("number of 100 rupees notes: "+d);
	n=n%100;
	
	e=n/10;
	System.out.println("number of 10 rupees notes: "+e);
	n=n%10;
	
	System.out.println("number of 1 Rupee notes: "+n);
	}
 
	catch(IOException ie)
	{
		System.out.println(ie);
	}
 
}
}