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
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int arr[] = new int[n];
    int[]result=new int[arr.length];
    for (int i = 0; i < n; i++)
      {
	arr[i] = sc.nextInt ();
      }
    int i = 0;
    int sum = 0;
    while (i < arr.length)
      {
	int temp = arr[i];
	result[i++] = sum;
	sum += temp;
      }
    i--;
    sum = 0;
    while (i >= 0)
      {
	int temp = arr[i];
	result[i--] += sum;
	sum += temp;
      }
    for (int j = 0; j < result.length; ++j)
      {
	System.out.print (result[j] + " ");
      }
  }
}
