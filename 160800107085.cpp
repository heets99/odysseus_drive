#include <iostream>
using namespace std;

void countCurrency(int amount) 
{ 
    int notes[7] = { 2000, 500, 200, 100, 
                     50, 20, 10}; 
    int noteCounter[7] = { 0 }; 
      
    // count notes using Greedy approach 
    for (int i = 0; i < 7; i++) { 
        if (amount >= notes[i]) { 
            noteCounter[i] = amount / notes[i]; 
            amount = amount - noteCounter[i] * notes[i]; 
        } 
    } 
      
    // Print notes 
    cout << "Currency Count ->" << endl; 
    for (int i = 0; i < 7; i++) { 
        if (noteCounter[i] != 0) { 
            if(noteCounter[i] == 1)
            cout << noteCounter[i] << " note of " << notes[i] << endl;
            else
            cout << noteCounter[i] << " notes of " << notes[i] << endl;
        } 
    } 
} 
  
// Driver function 
int main() 
{ 
    bool choice;
    int ind;
    cout << "Default notes are of 2000,500,200,100,50,20,10" << endl;
    int notes[7] = { 2000, 500, 200, 100, 
                     50, 20, 10};
    cout << "if you want to change the notes enter index...if not enter 7" << endl;
    cin >> ind;
    switch(ind)
    {
      case 0: cout << "enter new value" << endl;
      cin >> notes[0];break;
      case 1: cout << "enter new value" << endl;
      cin >> notes[1];break;
      case 2: cout << "enter new value" << endl;
      cin >> notes[2];break;
      case 3: cout << "enter new value" << endl;
      cin >> notes[3];break;
      case 4: cout << "enter new value" << endl;
      cin >> notes[4];break;
      case 5: cout << "enter new value" << endl;
      cin >> notes[5];break;
      case 6: cout << "enter new value" << endl;
      cin >> notes[6];break;
      case 7: 
    int amount;
    cin >> amount;
    if(amount%10==0)
    {
    countCurrency(amount);
    }
    else
    {
        cout << "Amount should be in multiple of 10 only";
    }
    break;
    }
    return 0; 
} 
