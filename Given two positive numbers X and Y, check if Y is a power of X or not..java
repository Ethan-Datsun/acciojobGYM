/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
		int x,y;
      Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
      y=sc.nextInt();
		System.out.println(isPower(x, y) ? 1 : 0);
	}
	
	public static boolean isPower(int x, int y)
	{
		
		if (x == 1)
			return (y == 1);

		
		int pow = 1;
		while (pow < y)
			pow = pow * x;

		
		return (pow == y);
	}
}


