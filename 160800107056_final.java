
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{   
    public static void countCurrency(int amount) 
    {   
        try
        {
            int[] notes = new int[]{ 2000 ,500, 200, 100, 50, 20, 10, 5, 1 }; 
        
            
           for (int i = 0; i < notes.length; i++)
        { 
            int noteCounter=0; 
            if (amount >= notes[i])
            { 
                noteCounter = amount / notes[i]; 
                amount = amount - noteCounter * notes[i]; 
            } 
             if (noteCounter != 0)
            { 
                System.out.println(notes[i] + " : "
                    + noteCounter); 
            } 
        } 
       

        }
         catch(Exception e)
         {
            System.out.println("Exception Occured");
             
         }
    } 

	public static void main (String[] args) 
	{  
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amount=scan.nextInt();
        countCurrency(amount); 
    } 
      
    
} 

