import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static int arraySum (int arr[], int ind)
  {
    if (ind < 0)
      return 0;

    return arr[ind] + arraySum (arr, ind - 1);
  }
  public static void main (String[]args) throws java.lang.Exception
  {
    Scanner sc = new Scanner (System.in);
    int t = sc.nextInt ();
    int c = 1;
    while (t-- > 0)
      {
	int n = sc.nextInt ();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++)
	    arr[i] = sc.nextInt ();

	  System.out.println ("Case " + c + ": " + arraySum (arr, n - 1));
	  c++;
      }



  }
}
