import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	
	static void calculateSpan(int price[], int n, int S[])
	{

		S[0] = 1;

		for (int i = 1; i < n; i++) {
			S[i] = 1; 
			for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
				S[i]++;
		}
	}

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int n = sc. nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
      int S[]=new int[n];

		calculateSpan(arr, n, S);
      for(int i=0;i<n;i++)
        System.out.print(S[i]+" ");
	}
}

