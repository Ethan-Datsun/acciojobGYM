

#include <bits/stdc++.h>
using namespace std;



void partition(int arr[],int n) 
{
    vector<int> glist,llist;
    long long i=1, p = ar[0];
    while(i<ar.size())
    {
        if(ar[i]>p)
            glist.push_back(ar[i]);
        else
            llist.push_back(ar[i]);
        i++;
    }
    i=0;
    while(i<llist.size())
    {
        ar[i] = llist[i];
        cout<<llist[i]<<" ";
        i++;
    }
    ar[i]=p;
    cout<<p<<" ";
    i=0;
    while(i<glist.size())
    {
        ar[i+p] = glist[i];
        if(i==glist.size()-1)
            cout<<glist[i]<<endl;
        else
            cout<<glist[i]<<" ";
        i++;
    }
}

/* Tail starts here */

int main() {
   vector <int>  _ar;
   int _ar_size;
cin >> _ar_size;
for(int _ar_i=0; _ar_i<_ar_size; _ar_i++) {
   int _ar_tmp;
   cin >> _ar_tmp;
   _ar.push_back(_ar_tmp); 
}

partition(_ar);
   
   return 0;
}


