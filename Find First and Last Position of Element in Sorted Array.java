/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static void findFirstAndLast(int arr[],int n, int x){
        int first = -1, last=-1;
        for(int i=0;i<n;i++){
            if(x!=arr[i])
                continue;
            if(first==-1)
                first=i;
            last =i;
        }
        if (first != -1)
		System.out.print(first + " " + last);
	else
		System.out.print(first + " " + last);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		findFirstAndLast(arr,n,x);
		
	}
}
