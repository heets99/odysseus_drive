#include <iostream>
using namespace std;

void countCurrency(int amount) 
{ 
    int notes[7] = { 2000, 500, 200, 100, 
                     50, 20, 10}; 
    int noteCounter[7] = { 0 }; 
      
    // count notes using Greedy approach 
    for (int i = 0; i < 7; i++)
    { 
        if (amount >= notes[i])
        { 
            noteCounter[i] = amount / notes[i]; 
            amount = amount - noteCounter[i] * notes[i]; 
        } 
    } 
      
    // Print notes 
    cout << "Currency Count ->" << endl; 
    for (int i = 0; i < 7; i++)
    { 
        if (noteCounter[i] != 0)
        { 
            cout << notes[i] << " : " 
                << noteCounter[i] << endl; 
        } 
    } 
} 
  
// Driver function 
int main() 
{ 
    int amount;
    cout<<"Enter Amount=";
    cin>>amount;
    countCurrency(amount); 
    
    return 0; 
} 


