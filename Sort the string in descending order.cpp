/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 100000;


void sortString(string& str)
{

	int charCount[MAX_CHAR] = { 0 };

	for (int i = 0; i < str.length(); i++)

		
		charCount[str[i] - 'a']++;

	for (int i = MAX_CHAR - 1; i >= 0; i--)
		for (int j = 0; j < charCount[i]; j++)
			cout << (char)('a' + i);
}

int main()
{
	string s ;
  cin>>s;
	sortString(s);
	return 0;
}
