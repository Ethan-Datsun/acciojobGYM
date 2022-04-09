#include <algorithm>
#include <iostream>
using namespace std; 

bool areequal(int arr1[],int arr2[],int n)
{
  sort(arr1,arr1+n);
  sort(arr2,arr2+n);

  for(int i=0;i<n;i++)
    if(arr1[i]!=arr2[i])
      return false;

    return true;

}



int main() {
    // your code here
  int n;
  cin>>n;
  int a[n],b[n];
  for(int i=0;i<n;i++)
    cin>>a[i];

  for(int i=0;i<n;i++)
    cin>>b[i];

if(areequal(a,b,n))
  cout<<"1";
  else
  cout<<"0";
  
    return 0;
}