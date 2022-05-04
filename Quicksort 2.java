
import java.util.*;
public class Solution {
       
          static int partition(int[] ar, int start, int end ) {
              
              int pivot = ar[start];
              int laPos = 0, uaPos = 0;
              int[] lowerArr = new int[end - start + 1];
              int[] higherArr = new int[end - start + 1];
              
              for (int i = start + 1; i <= end; i++)
              {
                  if ( pivot > ar[i])
                      lowerArr[laPos++] = ar[i];
                  else 
                      higherArr[uaPos++] = ar[i];
              }
              
              for (int i = start; i <= end; i++)
              {
                  if ((i - start) < laPos)
                      ar[i] = lowerArr[i - start];
                  else if ( (i - start) == laPos)
                      ar[i] = pivot;
                  else 
                      ar[i] = higherArr[i-start-laPos-1];
              }
              
              return start + laPos;
       }   

    static void quickSort(int[] ar, int start, int end)
    {
        int pivotIndex = 0;
        if (start < end) 
        {
            pivotIndex = partition(ar, start, end);
            quickSort(ar, start, pivotIndex - 1);
            quickSort(ar, pivotIndex + 1, end);
        }
        if (end - start > 0)
        printArray(ar, start, end);
    }
        
    static void quickSort(int[] ar) {
        
        int start = 0, end = ar.length - 1;
        
        quickSort(ar, start, end);
    }   

 static void printArray(int[] ar, int start, int end) {
         for(int i = start; i <= end; i++){
            System.out.print(ar[i]+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
}