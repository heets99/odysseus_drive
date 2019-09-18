#include<stdio.h>

void main()
{
    int tam,amount=0,up,rs1,rs2,rs,i, a, set1 ,set2,ans1,ans2; 
    int note[10]={2000,500,100,50,20,10};
    int add,delete,update;
    printf("\nPlease Enter the Amount : ") ;
    scanf("%d", &rs1) ; 
    rs=rs1;
    printf("\nYour current Amount is : %d ",rs);
    if(rs%10==0)//Amount should be in muliple of 10 only
    {
        for(i=0;i<=5;i++)
        {
            switch(amount)
            {   case 0:
                    if(rs >= note[0])
                    {
                        set1=note[0];
                        a = rs / note[0] ;
                        amount=1;
                        printf("\n %d notes of 2000", a) ;
                        break ;
                    }
                   else if(rs >= note[1])
                    {
                        set1=note[1];
                        a = rs / note[1] ;
                        amount=1;
                        printf("\n %d notes of 500", a) ;
                        break ;
                    }
                    else if(rs >= note[2])
                    {
                        set1=note[2];
                        a = rs / note[2] ;
                        amount=1;
                        printf("\n %d notes of 100", a) ;
                        break ;
                    }
                    else if(rs >= note[3])
                    {
                        set1=note[3];
                        a = rs / note[3] ;
                        amount=1;
                        printf("\n %d notes of 50", a) ;
                        break ;
                    }
                    else if(rs >= note[4])
                    {
                        set1=note[4];
                        a = rs / note[4] ;
                        amount=1;
                        printf("\n %d notes of 20", a) ;
                        break ;
                    }
                    else if(rs >= note[5])
                    {
                        set1=note[5];
                        a = rs / note[5] ;
                        amount=1;
                        printf("\n %d notes of 10", a) ;
                        break ;
                    }
                break;
                case 1:
                    ans1=set1*a;
                    ans2=rs-ans1;
                   if(ans2>0)
                    {
                        
                        amount=0;ans1=0;set1=0;a=0;
                        rs=ans2;
                        ans2=0;
                    }
                    else {i=5;break;} 
                break;
            }
        }
    
        printf("\nAdd amount 1 :");
        printf("\nDelete amount 2 :");
        printf("\nUpdate amount 3 :");
        scanf("%d",&tam);
        rs2=rs1;
        switch(tam)
        {
            case 1:
                printf("\nPLease enter you addition amount : ");
                scanf("%d",&add); 
                rs1=rs2+add;          
            break;
            case 2:
                printf("\nPLease enter you Remove amount : ");
                scanf("%d",&delete); 
                rs1=rs2-delete;          
            break;
            default:exit(0);
            break;
            
        }
        printf("\nYour Amount is : %d ",rs1);
        printf("Like to Update 1/0 ");
        scanf("%d",&up);
        switch(up)
        {
            case 1:
                printf("\nYour Updated Amount is : %d ",rs1);          
            break;
            default:exit(0);break;
        }
        
        
    }
    else
    {
        printf("Amount should be in muliple of 10 only");
    }
}