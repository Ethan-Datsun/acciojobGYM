/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner(System.in);
      String[] in = sc.nextLine().split("-");
      int n=in.length;
      for(int i=0;i<n;i++)
        System.out.print(in[i].charAt(0));
      System.out.println();
	}
}