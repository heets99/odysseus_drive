#include <stdio.h> 
int  a[7]={2000,500,200,100,50,20,10};
 
void denomination(int amount);
int main() 
{
 
     int amount;
 
    printf("Enter the amount:");
 
    scanf("%d",&amount);
     
    
 
   denomination(amount);
return 0;
}
void denomination(int amount)
{
	int temp,i;
    temp=amount;
     for(i=0;i<7;i++)
    {
     printf("\n%d notes is:%d",a[i],temp/a[i]);
     temp=temp%a[i];
     	
    } 
}