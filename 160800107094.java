import java.util.*; 
import java.lang.*;
import java.util.Scanner.*;
  
public class Main{ 
  
    // function to count and  
    // print currency notes 
    public static void countCurrency(int amount) 
    { 
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10}; 
        int[] noteCounter = new int[7]; 
       
        // count notes using Greedy approach 
        for (int i = 0; i < 7; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        // Print notes 
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 7; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
    } 
      
    // driver function  
    public static void main(String argc[]){ 
        Scanner sc=new Scanner(System.in);
        
        int amount = sc.nextInt();
        if(amount%10==0)
        {
            countCurrency(amount);
        }
        else
        {
            System.out.println("amount should be in multiple of 10 only");
        }
     }
    
      
} 
