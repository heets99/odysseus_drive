/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int rs;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("your amount should in multiple of 10");
		rs=scan.nextInt();
		
            if((rs%10)==0)
            {
                int a,b,c,d,e,f,s;
                while(rs>=2000)
                {
                    a=rs/2000;
                    System.out.println(a+ "notes of 2000");
                    rs=rs%2000;
                }
                while(rs>=1000)
                {
                    s=rs/1000;
                    System.out.println(s+ "notes of 1000");
                    rs=rs%1000;
                }
                while(rs>=500)
                {
                    b=rs/500;
                    System.out.println(b+ "notes of 500");
                    rs=rs%500;
                }
                while(rs>=100)
                {
                    c=rs/100;
                    System.out.println(c+ "notes of 100");
                     rs=rs%100;
                }
                while(rs>=50)
                {
                    d=rs/50;
                    System.out.println(d+ "notes of 50");
                     rs=rs%50;
                }
                while(rs>=20)
                {
                    e=rs/20;
                    System.out.println(e+ "notes of 20");
                    rs=rs%20;
                }
                while(rs>=10)
                {
                    f=rs/10;
                    System.out.println(f+ "notes of 10");
                }
            }
            else
            {
             System.out.println("amount should not in multiple of 10");
            }
	}
}
