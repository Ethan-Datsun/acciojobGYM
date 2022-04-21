#include<bits/stdc++.h>
using namespace std;

int fib(int n)
{

    int f[n + 2];
    int i;

    f[1] = 0;
    f[2] = 1;
 
    for(i = 3; i <= n; i++)
    {

       f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
    }
 

int main ()
{
   
    int n;
  cin>>n;
     
    cout << fib(n);
    return 0;
}