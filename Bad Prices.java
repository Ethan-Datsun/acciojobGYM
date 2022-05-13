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
	public static void main(String[] args) {
	int t;
	
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	while(t-->0){
	    int n;
	    n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int cnt=0;
	    int right_min=Integer.MAX_VALUE;
	    for(int i = n - 1; i >= 0; i --) 
        {
            if( arr [ i ] > right_min ) { 
                cnt ++;
            } 
            right_min = Math.min( arr [ i ], right_min);
        } 
        System.out.println(cnt);
	}
	}
}
