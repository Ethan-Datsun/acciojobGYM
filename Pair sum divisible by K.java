import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static int countKdivPairs(int A[], int n, int K)
    {
        int freq[] = new int[K];
  
        for (int i = 0; i < n; i++)
            ++freq[A[i] % K];
  
      
        int sum = freq[0] * (freq[0] - 1) / 2;
  
       
        for (int i = 1; i <= K / 2 && i != (K - i); i++)
            sum += freq[i] * freq[K - i];
       
        if (K % 2 == 0)
            sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
        return sum;
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
		System.out.print(countKdivPairs(arr, n, k));
	}
}