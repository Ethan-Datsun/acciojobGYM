#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
  int a[n];
    int sum = 0;
    
    cin >> sum;
    for (int i = 0; i < n; i++)
        cin >> a[i];

    for (int i = 0; i < n-1; i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]+a[j]==sum)
            cout<<i<<" "<<j;
        }
    }
  }