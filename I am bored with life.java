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
		//your code here
      int a,b;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      int x=a;
      int ans=1;
      if(x>b) x=b;
      for(int i=1;i<=x;i++)
        ans*=i;
      System.out.println(ans);
	}
}