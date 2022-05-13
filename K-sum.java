/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main{


static int findMinDivisor(int arr[], int n, int limit)
{
	

	int low = 0, high = 1000000000;
	
	while (low < high)
	{
		int mid = (low + high) / 2;
		int sum = 0;
	
		for(int i = 0; i < n; i++)
		{
		sum += Math.ceil((double) arr[i] /(double) mid);
		}
	
		if (sum <= limit)
			high = mid;
		else
		
			
			low = mid + 1;
	}

	return low;
}


public static void main(String args[])
    {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    	System.out.println(findMinDivisor(arr, n,k));
    }
}


