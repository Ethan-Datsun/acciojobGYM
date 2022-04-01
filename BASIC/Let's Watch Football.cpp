#include<iostream>

using namespace std;

int n,m,p;

int main()
{
	cin>>n>>m>>p;
	
		int cnt=n*p;
		int ant=m*p;
		int a=cnt-ant;
		if(a%m)
		{
			cout<<a/m+1<<endl;
		}
		else cout<<a/m<<endl;
	
}