
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	
static int countOnes(int arr[], int n)
{
	int ans;
	int low = 0, high = n - 1;
	while (low <= high) { 
		int mid = (low + high) / 2;

		
		if (arr[mid] < 1)
			high = mid - 1;
	
		
		else if (arr[mid] > 1)
			low = mid + 1;
		else
		
		
		{
			if (mid == n - 1 || arr[mid + 1] != 1)
				return mid + 1;
			else
				low = mid + 1;
		}
	}
	return 0;
}
	

	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr  = new int[n];
         for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
         }
      	System.out.println(countOnes(arr, n));
	}
}