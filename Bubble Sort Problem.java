import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{

    public static void sorting(int a[],int n){
       int temp,count=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n-1;j++){
               if(a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   count++;
               }
           }
       }
      System.out.println("Array is sorted in " +count+  " swaps.");
      System.out.println("First Element: " +  a[0]);
      System.out.println("Last Element: " + a[n-1]);
      
    }





  
	public static void main (String[] args) throws java.lang.Exception
	{ 
        int n;
		Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      sorting(arr,n);
      
	}
}