/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int amount;
		int  n2000, n500, n200, n100, n50, n20 , n10 ,n5=0;
		
		Scanner sc=new Scanner(System.in);
	    
	    amount=sc.nextInt();
	    sc.close();
	    
	    while(amount >=2000)
	    {
	        n2000=amount/2000;
	        amount=amount-(n2000*2000);
	        System.out.println(+n2000+" note/s of 2000");
	        break;
	    }
	     while(amount >=500)
	    {
	        n500=amount/500;
	        amount=amount-(n500*500);
	        System.out.println(+n500+" note/s of 500");
	        break;
	    }
	     while(amount >=200)
	    {
	        n200=amount/200;
	        amount=amount-(n200*200);
	        System.out.println(+n200+" note/s of 200");
	        break;
	    }
	     while(amount >=100)
	    {
	        n100=amount/100;
	        amount=amount-(n100*100);
	        System.out.println(+n100+" note/s of 100");
	        break;
	    }
	     while(amount >=50)
	    {
	        n50=amount/50;
	        amount=amount-(n50*50);
	        System.out.println(+n50+" note/s of 50");
	        break;
	    }
	     while(amount >=20)
	    {
	        n20=amount/20;
	        amount=amount-(n20*20);
	        System.out.println(+n20+" note/s of 20");
	        break;
	    }
	     while(amount >=10)
	    {
	        n10=amount/10;
	        amount=amount-(n10*10);
	        System.out.println(+n10+" note/s of 10");
	        break;
	    }
	     while(amount >=5)
	    {
	        n5=amount/5;
	        amount=amount-(n5*5);
	        System.out.println(+n5+" note/s of 5");
	        break;
	    }
	    
	    
	}
}
