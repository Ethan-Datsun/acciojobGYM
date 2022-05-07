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
		Scanner sc = new Scanner(System.in);
      String s=sc.next();
      int n= s.length();
      Stack<Character> stack = new Stack<Character>();
      int i=0,flag=0;
      while(i<n)
        {
          if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            stack.push(s.charAt(i));
          else
          {
            if(stack.isEmpty())
            {
              flag=1;
              break;
            }
            if(stack.peek()=='(' && s.charAt(i)==')' || stack.peek()=='{' && s.charAt(i)=='}'|| stack.peek()=='[' && s.charAt(i)==']')
            {
              stack.pop();
            }
            else
            {
              flag=1;
              break;
            }
          }
          i++;
        }
      if(flag==1 || !stack.isEmpty())
        System.out.print("0");
      else
        System.out.print("1");
	}
}