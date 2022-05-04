import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int insertionSortCount(int ar[],int n){
      int count=0;
    for(int i=1;i<n;i++){
        int curr = ar[i];
        for(int j=i-1;j>=0;j--){
            if(ar[j]>curr){
                ar[j+1]=ar[j];
                count++;
                if(j==0)
                    ar[j]=curr;
            }
            else{
                ar[j+1]=curr;
                j=-1;
            }
        }
    }
    return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
      int n;
		Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println(insertionSortCount(arr,n));
	}
}