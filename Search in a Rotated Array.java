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
	static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        
        if (arr[l] <= arr[mid]) {
            
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            
            return search(arr, mid + 1, h, key);
        }
 
       
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
 
        return search(arr, l, mid - 1, key);
    }
 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int key=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println(i);
        else
            System.out.println("-1");
    }
		
	
}
