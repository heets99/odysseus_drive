#include <iostream>
using namespace std;

void min(int c)
{
    int coins[] = {2000,500,200,100,50,20,10};
    int i=0;
    while(c!=0)
    {
        if(coins[i]<=c)
        {
            c=c-coins[i];
            cout<<coins[i]<<" ";
       }
       else
            i++;
    }
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
