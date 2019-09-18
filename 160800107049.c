#include <stdio.h>

int main(void) 
{
	// your code goes here
	int input,select,val,update,dlt;
	int amt,temp,m;
	int n[10]={10,20,50,100,200,500,2000};
	
//	printf("Enter Amount:-");
//	scanf("%d",&input);
    printf("\nAre You? 1. Admin 2. ATM User");
	scanf("%d",&select);
	switch(select)
	{
	    case 1: printf("\nWhat you want to do? 1.Add 2.Update 3.Delete");
	            int change;
	            scanf("%d",&change);
	            switch(change)
	            {
	                case 1: printf("\nEnter the new Note:-");
	                        int notes;
	                        scanf("%d",&notes);
	                        for(int i=0;i<7;i++)
	                        {
	                            if(notes==n[i])
	                            {
	                                printf("Already in the array.");
	                                
	                            }
	                            else
	                            {
	                                printf("Please go for update.");
	                            }
	                            
	                        }
	                        break;
	                case 2: //int val,update;
	                        printf("\nEnter the value that is to be updated.");
	                        scanf("%d",&val);
	                        printf("\nEnter new value.");
	                        scanf("%d",&update);
	                        for(int i=0;i<7;i++)
	                        {
	                            if(val!=n[i])
	                            {
	                                n[i]=val;
	                                printf("\nupdated");
	                            }
	                            else
	                            {
	                                printf("\nError");
	                                
	                            }
	                        }
	                        break;
	                case 3: //int dlt;
	                        printf("\nEnter value to be delete:");
	                        scanf("%d",&dlt);
	                        for(int i=0;i<7;i++)
	                        {
	                            if(n[i]==dlt)
	                            {
	                                n[i]=n[i-1];
	                            }
	                            else
	                            {
	                                printf("\nEntred value not found.");
	                            }
	                        }
	                        break;
	               //default : printf("\nEnter Correct Value.");
	                         //   break;
	            }
	            break;
	       case 2: // int amt,temp,m;
	                printf("\nEnter your Amount:-");
	                scanf("%d",&amt);
	                
	                if((amt%100)!=0)
	                {
	                    printf("\nPlease Enter amount in multiple of 10.");
	                }
	                else
	                {
	                    temp=amt;
	                    for(int i=0;i<7;i++)
	                    {
	                         printf("\n%d notes is:%d",n[i],temp/n[i]);
                             temp=temp%n[i];
	                    }
	                }
	                break;
	       //default: printf("\nInvalid choice.");
	                //break;
	       }
	return 0;
}

