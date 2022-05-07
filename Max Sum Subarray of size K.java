/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int maxSum(int arr[], int n, int k)
    {
       
        if (n < k)
        {
           System.out.println("Invalid");
           return -1;
        }
      
        
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
      
        
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }



  
	public static void main (String[] args) throws java.lang.Exception
	{
      int n,k;
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k =sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
      System.out.println(maxSum(arr,n,k));
	}
}