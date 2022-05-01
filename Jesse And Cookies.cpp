/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <bits/stdc++.h>

using namespace std;
void display(vector<int> &v){
    for(auto ele:v){
        cout<<ele<<" ";
    }
    cout<<endl;
}
int main()
{
    int n,k;
   // cout<<"enter nu of cookies";
    cin>>n>>k;
   // cout<<"sweetnerss req";
    //cin>>k;
   // cout<<"enter sweetness of cookies";
    vector<int> v(n);
    for(int i=0;i<n;i++){
        cin>>v[i];
    }
    //display(v);
     sort(v.begin(), v.end());
    int c=0;
       
     while(v.size()>=2 && v[0]<k){
         c++;
         int x=v[0];
         int y=v[1];
         v.erase(v.begin());
         v.erase(v.begin());
         
        
         int newcookie=1*x+2*y;
         auto it=v.begin();
         while(it!=v.end()){
             if(*it<newcookie){
                 it++;
                 continue;
             }
             break;
         }
         v.insert(it,newcookie);
        // display(v);
         //getchar();
     }
  if(v.size()<2)
    cout<<"-1"<<endl;
    else
      cout<<c<<endl;

    return 0;
}
