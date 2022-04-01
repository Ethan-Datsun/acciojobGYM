#include<iostream>
using namespace std;

int countbuilding(int ar[],int n)
{
    int lmax=ar[0];
    int count=1;
    for(int i=1;i<n;i++){
        if(ar[i]>lmax){
            count++;
            lmax=ar[i];
        }
    }
    return count;
}

int main(){
    int n; cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
    cin>>ar[i];

    cout<<countbuilding(ar,n);

    return 0;   

}