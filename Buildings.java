/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int buildings =sc.nextInt();
		int a[]=new int[buildings ];
		for(int i=0;i<buildings ;i++){
			a[i]=sc.nextInt();
		}
		int count=1;
		int max=a[0];
		for(int i=1;i<buildings;i++){
			
				if(max<a[i]){
					count++;
					max=a[i];
				}
		}
       System.out.print(count);
	}
}
