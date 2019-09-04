/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    
  
    public static void countCurrency(int amount) 
    {   
        try {
            
    
        
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[9]; 
       
           for (int i = 0; i < 9; i++)
        { 
            if (amount >= notes[i])
            { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        
        System.out.println("Currency Count :"); 
        for (int i = 0; i < 9; i++) 
        { 
            if (noteCounter[i] != 0)
            { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
        }//try
         catch(Exception e)
         {
            System.out.println("Exception Occured");
             
         }
    } 

	public static void main (String[] args) //throws java.lang.Exception
	{  
        //int amount = 868; 
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amount=scan.nextInt();
        countCurrency(amount); 
    } 
      
    
} 

