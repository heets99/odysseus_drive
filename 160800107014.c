#include <stdio.h>
int main(void)
{
    int a,b,h=5,f;
    scanf("%d",&a);
    printf("Enter amount=%d",a);
    if(a%10==0)
    {
        if(a>15000)
        {
            printf("ATM cash limit exceed!!");
        }
        else
        {
            if(a<500)
            {
                b=a/100;
                printf("\nHundreds=%d",b);
            }
            else
            {
                f=(a-500)/500;
                h += ((a-500)%500)/100;
                if(h>5)
                {
                    f=f+1;
                    h=h-5;
                }
                printf("\nHundreds=%d",h);
                printf("\nFive Hundreds=%d",f);
            }
        }
    }
    else
    {
        printf("Invalid amount");
    }
	return 0;
}



