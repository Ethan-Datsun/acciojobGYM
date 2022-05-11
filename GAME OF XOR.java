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
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      System.out.println(getTotalXorOfSubarrayXors(arr, n));
	}
  public static int getTotalXorOfSubarrayXors(int arr[], int n){
    int res=0;
    for(int i=0;i<n;i++)
      for(int j=i;j<n;j++)
        for(int k=i;k<=j;k++)
          res=res^arr[k];

    return res;
  }
}