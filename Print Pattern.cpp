    
    #include <iostream>
    using namespace std;
    
    void printPattern(int n, int m, bool flag)
    {
      
        cout << m << " ";
         
        if (flag == false && n ==m)
            return;
         
    
        if (flag)
        {
    
        if (m-5 > 0)
            printPattern(n, m-5, true);
        else 
            printPattern(n, m-5, false);
        }
        else 
            printPattern(n, m+5, false);
    }
    
    int main()
    {
        int n ;
        cin>>n;
        printPattern(n, n, true);
       
        return 0;
    }