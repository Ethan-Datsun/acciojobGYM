/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int t=sc.nextInt();
      int timeForBooks[]=new int[n];
      for(int i=0;i<n;i++){
        timeForBooks[i]=sc.nextInt();
      }
      int countOfBooks=0,k=0,sum=0;
      for(int i=0;i<n;i++){
        sum=sum+timeForBooks[i];
        if(sum<=t){
          countOfBooks++;
        }
        else{
          sum=sum-timeForBooks[k];
          k++;
        }
      }
      System.out.println(countOfBooks);
	}
}