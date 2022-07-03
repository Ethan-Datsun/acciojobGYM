/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

	static boolean isTriangular(int num)
	{
		if (num < 0)
			return false;
	
		int c = (-2 * num);
		int b = 1, a = 1;
		int d = (b * b) - (4 * a * c);
	
		if (d < 0)
			return false;
	
		float root1 = ( -b +(float)Math.sqrt(d)) / (2 * a);
			
		float root2 = ( -b -(float)Math.sqrt(d)) / (2 * a);
	
		if (root1 > 0 && Math.floor(root1)
								== root1)
			return true;
	
		
		if (root2 > 0 && Math.floor(root2)
								== root2)
			return true;
	
		return false;
	}
	

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isTriangular(num))
			System.out.println("1");
		else
			System.out.println ("0");
	}
}

