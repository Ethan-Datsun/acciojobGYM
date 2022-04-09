#include <bits/stdc++.h>
using namespace std;

void checkTypeOfTriangle(int a,
				int b, int c){
	int sqa = pow(a, 2);
	int sqb = pow(b, 2);
	int sqc = pow(c, 2);
	
	if (sqa == sqb + sqc ||
		sqb == sqc + sqa ||
		sqc == sqa + sqb){
		cout << "2";
	}
	else if(sqa > sqc + sqb ||
			sqb > sqa + sqc ||
			sqc > sqa + sqb){
		cout << "3";
	}
	else{
		cout << "1";
	}
}

// Driver Code
int main()
{
	int a, b, c;
	cin>>a>>b>>c;
	
	// Function Call
	checkTypeOfTriangle(a, b, c);
	return 0;
}
