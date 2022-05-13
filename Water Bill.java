import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static int bill(int n)
  {
    if(n<=100){
       return n*15;
   }
   else if(n<=200){
       return (100*15)+(n-100)*14;
   }
   else if(n>200)
       return n*12;
    
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int unit = sc.nextInt();
      System.out.println(bill(unit));
	}
}