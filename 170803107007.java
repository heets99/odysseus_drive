/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author internet
 */
public class Test1 {
    static boolean avail = false,admavail = false;
    Scanner sc = new Scanner(System.in);
    
    int[] note = new int[]{2000,500,200,100,50,20,10}; 
    int[] count = new int[100]; 
    
//    public void login(String name , String pass)
//    {
//        if(name == "admin" && pass == "admin" )
//                {
//                    System.out.println("----------------------Admin Login----------------------");
//                    admavail = true;
//                }
//                if(name == "user" && pass == "user")
//                {
//                    System.out.println("----------------------User Login----------------------");
//                    avail = true;
//                }
//                else
//                {
//                    admavail = false;
//                    avail = false;
//                }
//    }
    
    public void work()
    {
        System.out.println("Please Enter Your Cash : ");
        int cash = sc.nextInt();
        int tempcash = cash;
        
        if(tempcash%10==0)
        {
            for (int i = 0; i < note.length; i++)
            {
                if (cash >= note[i])
                { 
                    count[i] = cash / note[i]; 
                    cash = cash - count[i] * note[i]; 
                } 
            } 
            for (int i = 0; i < note.length; i++) { 
                if (count[i] != 0)
                { 
                    System.out.print(count[i] + " note(s) of " + note[i] +" ");
                } 
            } 
        }
        else
        {
            System.out.println("Please Enter Round Figure.");
        }
    }
    
    public void admwork()
    {
        System.out.println("What do you want to do?\n1.Add\n2.Update\n3.Delete\n");
        int choice = sc.nextInt();
        
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
        switch(choice)
        {
            case 1:
                System.out.println("Enter Value : ");
                int lngth = note.length;
                lngth++;
                note[lngth] = sc.nextInt();
                System.out.println("Value Added.");
                break;
                
            case 2:
                System.out.println("Enter Value : ");
                System.out.println("Value Updated.");
                break;
                
            case 3:
                System.out.println("Value Deleted.");
                break;
                
            default:
                System.out.println("Value Added.");
                break;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name=scan.nextLine();
		System.out.println("Enter Your Password: ");
		String pass=scan.nextLine();
		
                Test1 ob1 = new Test1();
                
                //ob1.login(name,pass);
                
//		if(name == "user" && pass == "user")
//		{
                    Test1 ob2 = new Test1();
		    ob1.work();
		//}
//                else if(name == "admin" && pass == "admin" )
//                {
                    //Test1 ob3 = new Test1();
                    //ob1.admwork();
                //}
	}
}
