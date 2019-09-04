#include <bits/stdc++.h> 
using namespace std;

void countCurrency(int amount) 
{ 
	int notes[8] = { 2000, 500, 200, 100, 50, 20, 10, 5 }; 
	

	int noteCounter[8] = {0}; 
	
		for (int i = 0; i < 8 ; i++) 
	{ 

		if (amount >= notes[i]) { 
			noteCounter[i] = amount / notes[i]; 
			amount = amount - noteCounter[i] * notes[i];0		} 
	} 
	
	cout << "Currency" << endl; 
	
	for (int i = 0; i < 8 ; i++) { 
	    
		if (noteCounter[i] != 0) {
		    
			cout << notes[i] << " : "
				<< noteCounter[i] << endl; 
		} 
	} 
} 

    int main() 
    { 
    	int amount;
    	cout<<"Enter Amount ";
    	cin>>amount;
	    countCurrency(amount); 
    	return 0; 
} 