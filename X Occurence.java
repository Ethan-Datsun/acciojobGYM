import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
      public static int cell(int n,int x){
        int ans=0;
        for(int i=1;i<=n;i++)
          if(x%i==0 && x/i <=n) ans++;


        return ans;
      }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
         int n,x;
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      x=sc.nextInt();
      System.out.println(cell(n,x));
	}
}