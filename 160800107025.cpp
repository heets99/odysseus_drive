#include <iostream>
//int minCoins(int coins[], int m, int V) ;
using namespace std;

int main() 
{ 
    int coins[] =  {2000, 500, 200, 100,50,20,10}; 
     int tt=0,fh=0,th=0,oh=0,fif=0,ten=0,tw=0;
    int v;
    cin>>v;
    if(v%10!=0)
    {
        cout<<"validation failed";
    }
    else
    {
    //cout << "Minimum coins required is ";
    while(coins[0]<=v)
    {
        tt++;
        v=v-coins[0];
    }
    while(coins[1]<=v)
    {
        fh++;
        v=v-coins[1];
    }
    while(coins[2]<=v)
    {
        th++;
        v=v-coins[2];
    }
    while(coins[3]<=v)
    {
        oh++;
        v=v-coins[3];
    }
    while(coins[4]<=v)
    {
        fif++;
        v=v-coins[4];
    }
    while(coins[5]<=v)
    {
        tw++;
        v=v-coins[5];
    }
    while(coins[6]<=v)
    {
        ten++;
        v=v-coins[6];
    }
    cout<<tt <<"notes of 2000  "<<fh <<"notes of 500  "<<th <<"notes of 200  "<<oh <<"notes of 100  "<<fif <<"notes of 50  "<<tw <<"notes of 20  "<<ten <<"notes of 10";
    }
    
    return 0; 
} 
