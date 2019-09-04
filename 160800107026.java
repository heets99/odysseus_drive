 
// and count number of notes 
import java.util.*; 

public class GfG{ 

	// function to count and 
	// print currency notes 
	public static void countCurrency(int amount) 
	{ 
		int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10  }; 
		int[] noteCounter = new int[notes.length]; 
                 boolean flag=false;
	
		// count notes using Greedy approach 
                 System.out.println("number of notes as follow:-");
                 
		for (int i = 0; i < notes.length; i++) 
                { 
			if (amount >= notes[i]) 
                        { 
				noteCounter[i] = amount / notes[i]; 
				amount = amount - noteCounter[i] * notes[i]; 
                           
			}
                        
                        
                            if (noteCounter[i] != 0) 
                            { 
				System.out.println(notes[i] + " : "
					+ noteCounter[i]); 
                            }
                        }
		} 
	
		// Print notes 
		
	
	// driver function 
	public static void main(String argc[])
        { 
		int amount;
                 Scanner sc = new Scanner(System.in);
                 
                do
                    
                {System.out.println("enter amount");
               
                amount=sc.nextInt();
                
                }while(0!=amount%10);
                
                
                   
                    
                    
                        GfG.countCurrency(amount); 
                      
                   
                   
                 
                }
	} 
	
	/* This code is contributed by Sagar Shukla */
} 
