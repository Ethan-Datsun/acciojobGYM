import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	
    static void printPrevSmaller(int[] arr, int n)
    {
        
        System.out.print("-1 ");
        
        for (int i = 1; i < n; i++) {
            
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            
            if (j == -1)
                System.out.print("-1 ");
        }
    }
 
   
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
            int arr[] = new int[n];
            for(int i=0; i < n;i++){
                arr[i] = in.nextInt();
            }
        printPrevSmaller(arr, n);
    
  }
}