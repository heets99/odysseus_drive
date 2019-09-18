/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
//Codechef(int a)
   // {
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int twothousand,fivehundred,twohundred,hundred,fifty,twenty,ten;
       twothousand=fivehundred=twohundred=hundred=fifty=twenty=ten=0;	  
        while(a>0)
	   {
    	   if(a>=2000)
    	   {
    	       a=a-2000;
    	       twothousand++;
    	   }
	        else if(a>=500)
            {
	             a=a-500;
                 fivehundred++;
	        }
            else if(a>=200)
	         {
                a=a-200;
	             twohundred++;
	       
	            }
            else if(a>=100)
	        {
	            a=a-100;
	            hundred++;
	        }
	        else if(a>=50)
	        {
	            a=a-50;
	            fifty++;
	        }
	        else if(a>=20)
	        {
	            a=a-20;
	            twenty++;
	        }

	        else if(a>=10)
	        {
	            a=a-10;
	            ten++;
	        }
	        else
	        {
	            a=a-1;
	        }
	   }
	   System.out.println(twothousand+"notes of 2000");
	    System.out.println(fivehundred+"notes of 500");
	     System.out.println(twohundred+"notes of 200");
	       System.out.println(hundred+"notes of 100");
	        System.out.println(fifty+"notes of 50");
	         System.out.println(twenty+"notes of 20");
	          System.out.println(ten+"notes of 10");
    }
}
//class converter
//{
  //  public static void main(String args[])
   // {
       // converter ch=new converter(Integer parseInt(args[0]));
//}
