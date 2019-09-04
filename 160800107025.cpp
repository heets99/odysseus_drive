#include <iostream>
//int minCoins(int coins[], int m, int V) ;
using namespace std;

int main() 
{ 
    int coins[] =  {2000, 500, 200, 100,50,20,10,0}; 
     int i=0, tt=0,fh=0,th=0,oh=0,fif=0,ten=0,tw=0;
    int v;
    cin>>v;
    while(coins[i]!=0)
    {
        oh++;
        i++;
    }
    i=0;
    if(v%10!=0)
    {
        cout<<"validation failed";
    }
    else
    {
    //cout << "Minimum coins required is ";
    for(i=0;i<oh;i++)
    {
        while(coins[i]<=v)
       {   //if(coin[i]==2000)
          tt++;
          v=v-coins[i];
       }
    cout<<tt <<"notes of "<<coins[i]<<" ";
    tt=0;
    }
   // cout<<oh ;
    }
    
    return 0; 
} 
