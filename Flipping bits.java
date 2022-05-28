import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int T = sc.nextInt();
      long m=(1L<<32)-1;
      for(int i=0;i<T;i++){
        long n = sc.nextLong();
        System.out.println(n^m);
      }
	}
}