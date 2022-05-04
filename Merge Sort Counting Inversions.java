/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main {

    public static long countInversions(int[] arr){
        return Sort(arr, 0, arr.length-1);   
    }
    
    public static long Sort(int[] arr, int lo, int hi) {
        if(lo < hi) {
            int mid = (lo + hi)/2;
            return Sort(arr, lo, mid) + Sort(arr, mid+1, hi) + Merge(arr, lo, mid, hi);
        }
        else {
            return 0;
        }
    }
    
    public static long Merge(int[] arr, int lo, int mid, int hi) {
        long count = 0;
        int n1 = mid - lo + 1;
        int n2 = hi - mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        int i, j;
        
        for(i = 0; i < n1; i++) {
            a1[i] = arr[lo+i];
        }
        for(j = 0; j < n2; j++) {
            a2[j] = arr[mid+1+j];
        }
        
        i = 0;
        j = 0;
        int k = lo;
        while(i < n1 && j < n2) {
            if(a1[i] <= a2[j]) {
                arr[k] = a1[i];
                i++;
                k++;
            }
            else {
                arr[k] = a2[j];
                j++;
                k++;
                count = count + (n1 - i);
            }
        }
        
        while(i < n1) {
            arr[k] = a1[i];
            i++;
            k++;
        }
        
        while(j < n2) {
            arr[k] = a2[j];
            j++;
            k++;
        }
        
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
    
    
}