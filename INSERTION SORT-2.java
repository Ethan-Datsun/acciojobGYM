
import java.util.*;
public class Solution {
       
    public static void insertIntoSortedArray(int[] ar, int i)
    {
        
        int n= ar[i];
        i--;
        while(i>=0 && ar[i]>n){            
            ar[i+1]=ar[i]; //shift right            
            i--;
            
            }
        ar[i+1]= n;
        printArray(ar);
    }
    
          static void insertionSort(int[] ar) {
              for(int i=1;i<ar.length;i++){
            insertIntoSortedArray(ar, i);            
            }    
              
                    
           }   
/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
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
           insertionSort(ar);
       }    
   }