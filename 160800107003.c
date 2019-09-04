#include <stdio.h>

int main()
{
   int am=500,am1;
   int notes[7] = { 2000, 500, 200, 100,50, 20,10 };
                 
    int noteCounter[7] = { 0 }; 
      
   
  
   printf("\n deposite case");  
   printf("\n enter amount");
   scanf("%d",&am1);
   if(am1%10==0)
   {
       printf("\n you can go forther transaction");
       am=am+am1;
       printf("\n balance is %d",am);
        for (int i = 0; i < 7; i++)
        { 
            if (am>= notes[i])
            { 
                noteCounter[i] = am / notes[i]; 
                am = am- noteCounter[i] * notes[i]; 
            } 
              //  printf("\n%d %d",notes[i],notecounter[i]);
                
                printf("\n%d",noteCounter[i] );
               //printf("\n %d",notes[i]);
                
         } 
   }

      


    /*for (int i = 0; i < 7; i++) 
    { 
        if (noteCounter[i] != 0)
        { 
            printf("\n%d", notes[i]); 
            printf("\n%d",noteCounter[i] );
        } 
    } */
   
   else
   {
       printf("\n please enter amount that is multiple of 10 only");
   }
   
   
   
   return 0;
   
}
