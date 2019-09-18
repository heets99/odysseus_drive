#include <iostream>
using namespace std;

void min(int c)
{
    int coins[] = {1000,500,200,100,50,20,10};
    int i=0,ct1=0,ct2=0,ct3=0,ct4=0,ct5=0,ct6=0,ct7=0;
    while(c!=0)
    {
        if(coins[i]<=c)
        {
            c=c-coins[i];
            //cout<<coins[i]<<" ";
            if(coins[i]==2000) ct1++;
            if(coins[i]==500) ct2++;
            if(coins[i]==200) ct3++;
            if(coins[i]==100) ct4++;
            if(coins[i]==50) ct5++;
            if(coins[i]==20) ct6++;
            if(coins[i]==10) ct7++;
            
        }
       else
            i++;
    }
    
    if(ct1>0) cout<<ct1<<" notes of "<<2000<<" ";
    if(ct2>0) cout<<ct2<<" notes of "<<500<<" ";
    if(ct3>0) cout<<ct3<<" notes of "<<200<<" ";
    if(ct4>0) cout<<ct4<<" notes of "<<100<<" ";
    if(ct5>0) cout<<ct5<<" notes of "<<50<<" ";
    if(ct6>0) cout<<ct6<<" notes of "<<20<<" ";
    if(ct7>0) cout<<ct7<<" notes of "<<10<<" ";
}


int main() {

    int c=0;
    cin>>c;
    if(c%10!=0)
        cout<<"Please enter amount in the multiple of 10";
    else
        min(c);
    return 0; 
}
