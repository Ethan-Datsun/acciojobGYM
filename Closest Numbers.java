/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< N-1; i++){
            min = Math.min(min, a[i+1] - a[i]);
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < N-1; i++){
            if(a[i+1] - a[i] == min){
                sb.append(a[i] + " " + a[i+1] + " ");
            }
        }
        System.out.println(sb.toString());
     }
}