# include <iostream>
using namespace std;
int main() {
    // your code here
  int n;
  long sum=0;
  cin>>n;
  
  for(int i=1;i<=n;i++)
    sum=sum+i;

  cout<<sum;
    return 0;
}