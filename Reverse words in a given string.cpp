/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

#include <bits/stdc++.h>
using namespace std;


void reverseWords(string s)
{
	vector<string> tmp;
	string str = "";
	for (int i = 0; i < s.length(); i++)
	{
		
		if (s[i] == '.')
		{
			tmp.push_back(str);
			str = "";
		}

		else
			str += s[i];
	}


	tmp.push_back(str);
	int i;
	for (i = tmp.size() - 1; i > 0; i--)
		cout << tmp[i] << ".";

	cout << tmp[0] << endl;
}

int main()
{
	string s;
	cin>>s;
	reverseWords(s);
	return 0;
}
