

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
public class GfG{ 
  
  // function to count and  
    // print currency notes 
    public static void countCurrency(int amount) 
    { 
        
        int rs;
        Scanner scan=new Scanner(system.in);
        rs=scan.nextInt();
        
        int[] notes = new int[]{2000,1000,500,100,50,20,10 }; 
        int[] noteCounter = new int[7]; 
       if((rs%10)==0)
      {
        for (int i = 0; i < 7; i++)
        { 
            if (rs >= notes[i]) 
            { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount%notes[i];
            } 
        } 
       
        // Print notes 
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 7; i++) 
        { 
            if (noteCounter[i] != 0)
            { 
                System.out.println(noteCounter[i] + "notes of" + notes[i]); 
            } 
        } 
      }
    } 
}
    
      
      
      
  
// Driver function 


	

