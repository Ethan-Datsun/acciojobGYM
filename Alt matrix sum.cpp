/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
   int i,j,n;
   int black=0,white=0;
   cin>>n;
   int a[n][n];
   for(i=0;i<n;i++){
       for(j=0;j<n;j++){
           cin>>a[i][j];
       }
   }
   
   
   for(i=0;i<n;i++){
       for(j=0;j<n;j++){
           
           if((i+j)%2==0)
           black+=a[i][j];
           else
           white+=a[i][j];
           
       
           
       }
       
   }
   
   cout<<black<<endl;
   cout<<white<<endl;
//cout<<c<<endl;

    return 0;
}
