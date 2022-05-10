/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
# include <bits/stdc++.h>
using namespace std;
class Solution {
  public:
    int isGoodorBad(string S) {
      int vowel = 0 ;
      int cons = 0 ;
      for( int i = 0 ; i < S.length() ; i++ )
       {
          if( vowel > 5 || cons > 3 )
           {
             return 0;
           }
          if( S[i] == 'a' || S[i] == 'e' || S[i] == 'i' || S[i] == 'o' || S[i] == 'u' )
           {
              vowel++ ;
              cons = 0 ;
           }
          else if( S[i] == '?') 
            {
              cons++;
              vowel++;
            }
           else 
            {
             vowel = 0;
              cons++;
            }
          
      }
        
          return 1;
    }
};

int main() {
    // int t;
    // cin>>t;
    // while(t--){
      
    // }
  string S;
  cin>>S;
  Solution ob;
  cout<<ob.isGoodorBad(S)<<endl;
  
    return 0;
}