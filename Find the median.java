/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static int findMedian(int a[], int n)
	{
		
		Arrays.sort(a);

		
		if (n % 2 != 0)
			return (int)a[n / 2];

		return (int)(a[(n - 1) / 2] + a[n / 2]) / 2;
	}

	public static void main(String args[])
	{
	      int n;
		Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
		
		System.out.println(findMedian(arr, n));
	}
}
