/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
        public static int partition (int a[], int start, int end)  
            {  
                int pivot = a[end]; 
                int i = (start - 1);  
              
                for (int j = start; j <= end - 1; j++)  
                {  
                     
                    if (a[j] < pivot)  
                    {  
                        i++;  
                        int t = a[i];  
                        a[i] = a[j];  
                        a[j] = t;  
                    }  
                }  
                int t = a[i+1];  
                a[i+1] = a[end];  
                a[end] = t;  
                return (i + 1);  
            } 
       public static void quick(int a[], int start, int end) 
            {  
                if (start < end)  
                {  
                    int p = partition(a, start, end);  
                    quick(a, start, p - 1);  
                    quick(a, p + 1, end);  
                }  
            } 
      public static void printArr(int a[], int n)  
            {  
                int i;  
                for (i = 0; i < n; i++)  
                    System.out.print(a[i] + " ");  
            }
        public static void main(String[] args) 
        {  
             int n; 
            Scanner sc = new Scanner(System.in); 
            n=sc.nextInt(); 
            int arr[]= new int[n]; 
            for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
              
            quick(arr, 0, n - 1);  
              
            printArr(arr, n);  
         
        }  
}
