/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main
{
  static void generateBinarynumber(int n){
    Queue<String> q=new LinkedList<String>();
    q.add("1");
    while(n-->0){
      String s1=q.peek();
      q.remove();
      System.out.print(s1+" ");
      String s2=s1;
      q.add(s1+"0");
      q.add(s1+"1");
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      generateBinarynumber(n);
	}
}