

#include <stdio.h>
//#include<conio.h>

        int  a[7]={2000,500,200,100,50,20,10};
 
   int denomi(int m);

       int main() 
       {
         int m;
         printf("Enter AMOUNT:");
         scanf("%d",&m);
         denomi(m);
       }

  int denomi(int m)
   {
	int temp,i;
    temp=m;
     
     for(i=0;i<7;i++)
       {
        printf("%d notes of:%d\n",a[i],temp/a[i]);
        temp=temp%a[i];
        
        
    
       }
       return 0;
   }
   