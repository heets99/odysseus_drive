
import java.util.Scanner;


class ATM implements Runnable{

    protected static final int[] currDenom = { 2000, 500,200, 100, 50 ,20, 10 };
    
 /*List<Integer> currDenom = new ArrayList<Integer>(); 
          currDenom.add(0, 2000);  
        currDenom.add(1, 500);   
          currDenom.add(2, 200);
          currDenom.add(3, 100);
          currDenom.add(4, 50);
          currDenom.add(5, 20);
          currDenom.add(6, 10);*/

    protected static int[] currNo = {10,40,40,20,20,100,100};

    protected  int[] count = { 0, 0, 0, 0, 0, 0 ,0};

  
    protected static int totalCorpus = 0;

    protected  int amount=0;

    public ATM(int amount){
        this.amount=amount;
    }


    public static void calcTotalCorpus(){       
        for(int i = 0; i < currDenom.length; i++){
            totalCorpus=totalCorpus+currDenom[i]*currNo[i];
        }
    }

    public  synchronized  void  withdrawCash(){
        if(amount<=totalCorpus){
            for (int i = 0; i < currDenom.length; i++) {
                if (currDenom[i] <= amount) {
                    
                    int noteCount = amount / currDenom[i];
                    if(currNo[i]>0){
                        count[i] = noteCount>=currNo[i]?currNo[i]:noteCount;
                        currNo[i] =  noteCount>=currNo[i]?0:currNo[i]- noteCount;
                        totalCorpus=totalCorpus-(count[i]*currDenom[i]);
                        amount = amount -(count[i]*currDenom[i]);
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
                System.out.println(currDenom[i] + " * " + count[i] + " = "+ (currDenom[i] * count[i]));
            }
        }
    }

    private void displayLeftNotes(){
        for(int i = 0; i < currDenom.length; i++){
           // System.out.println("Notes of "+currDenom[i]+" left are "+currNo[i]);
        }

    }
}

public class Main
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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