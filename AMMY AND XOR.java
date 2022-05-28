import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    static int getTotalXorOfSubarrayXors( int arr[], int N)
    {
         
        
        int res = 0;
         
        
        for (int i = 0; i < N; i++)
         
            
            for (int j = i; j < N; j++)
         
          
            for (int k = i; k <= j; k++)
                res = res ^ arr[k];
     
        return res;
    }
     
    // Driver code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( getTotalXorOfSubarrayXors(arr, N));
    }
}