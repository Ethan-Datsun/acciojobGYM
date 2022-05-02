import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int mat[][]=new int[n][n];

for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
          mat[i][j]=sc.nextInt();
      }
  }
   for(int i=0;i<n;i++)
  {
      if (i%2==0)
      {
          for(int j=0;j<n;j++)
            System.out.print(mat[i][j]+" ");
      }
      else{
          for(int j=n-1;j>=0;j--)
          System.out.print(mat[i][j]+" ");
          
      }
  }   
      
      
	}
}