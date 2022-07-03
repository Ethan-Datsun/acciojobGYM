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
    static int findMin(int arr[],int low ,int high){
        if(high<low) return 0;
        if(high==low) return arr[low];
        int mid = low + (high - low)/2;
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(findMin(arr,0,n-1));
		
	}
}
