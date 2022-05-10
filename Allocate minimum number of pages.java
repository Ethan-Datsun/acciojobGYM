/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	static boolean isPossible(int arr[], int n, int m, int curr_min)
	{
		int studentsRequired = 1;
		int curr_sum = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] > curr_min)
				return false;
			if (curr_sum + arr[i] > curr_min)
			{
				studentsRequired++;
				curr_sum = arr[i];
				if (studentsRequired > m)
					return false;
			}
			else
				curr_sum += arr[i];
		}
		return true;
	}
	static int findPages(int arr[], int n, int m)
	{
		long sum = 0;
		if (n < m)
			return -1;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		int start = 0, end = (int) sum;
		int result = Integer.MAX_VALUE;
	
		while (start <= end)
		{
			int mid = (start + end) / 2;
			if (isPossible(arr, n, m, mid))
			{
				result = mid;
				end = mid - 1;
			}
	
			else
				start = mid + 1;
		}

		return result;
	}

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m= sc.nextInt();
	int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

      
		System.out.println(findPages(arr, n, m));
	}
}
