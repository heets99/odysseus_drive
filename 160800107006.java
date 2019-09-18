
import java.util.*;


class ATM implements Runnable{

    protected static final int[] notes = { 2000,1000, 500, 100, 50,20 , 10 };

   
   
    protected static int[] currNo = {1,2,2,4,2,2,10};

    protected  int[] count = { 0, 0, 0, 0 ,0,0,0};

    /** The total corpus. */
    protected static int totalCorpus = 0;

    /** The amount. */
    protected  int amount=0;


    public ATM(int amount){
        this.amount=amount;
    }

    public static void calcTotalCorpus(){       
        for(int i = 0; i < notes.length; i++){
            totalCorpus=totalCorpus+notes[i]*currNo[i];
        }
    }

    /**
     * Withdraw cash.
     */
    public  synchronized  void  withdrawCash(){
        if(amount<=totalCorpus){
            for (int i = 0; i < notes.length; i++) {
                if (notes[i] <= amount) {//If the amount is less than the notes[i] then that particular denomination cannot be dispensed
                    int noteCount = amount / notes[i];
                    if(currNo[i]>0){//To check whether the ATM Vault is left with the currency denomination under iteration
                        //If the Note Count is greater than the number of notes in ATM vault for that particular denomination then utilize all of them 
                        count[i] = noteCount>=currNo[i]?currNo[i]:noteCount;
                        currNo[i] =  noteCount>=currNo[i]?0:currNo[i]- noteCount;
                        totalCorpus=totalCorpus-(count[i]*notes[i]);
                        amount = amount -(count[i]*notes[i]);
                    }                
                }
            }
            displayNotes();
            displayLeftNotes();

        }
        else{
            System.out.println("Unable to dispense cash at this moment for this big amount");
        }

    }

    public void run()
    {
        withdrawCash();

    }


    private void displayNotes(){
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " * " + count[i] + " = "+ (notes[i] * count[i]));
            }
        }
    }

  
    private void displayLeftNotes(){
        for(int i = 0; i < notes.length; i++){
           // System.out.println("Notes of "+notes[i]+" left are "+currNo[i]);
        }

    }
}




public class Main
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount to be withdrawn: ");
        int amount = input.nextInt();
        if(amount%10!=0){
            System.out.println("Please enter the amount in multiples of 10");
        }
        else{
            ATM atm = new  ATM(amount);
            ATM.calcTotalCorpus();
            Thread t1 = new Thread(atm);
            t1.start();
            
        }

    }
}

