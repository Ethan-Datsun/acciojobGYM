# include <iostream>
using namespace std;
int move(int n, char source, char destination, char spare)
{ int count = 1;
if (n==1){
   count;
}
else{
    count += move(n-1, source, spare, destination);
             move(1, source, destination, spare);
    count += move(n-1, spare, destination, source);
}
return count;
}

int main()
{
int n, steps;
char A, B, C;
cin>>n;
steps = move(n, 'A', 'B', 'C');
cout<<steps;
return 0;
}