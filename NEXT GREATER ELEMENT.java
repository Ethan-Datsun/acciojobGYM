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
	 public static void findNextGreaterElements(int[] input)
    {
       
        if (input == null) {
            return;
        }
 
        
        for (int i = 0; i < input.length; i++)
        {
            
            int next = -1;
 
            
            for (int j = i + 1; j < input.length; j++)
            {
               
                if (input[j] > input[i])
                {
                    next = input[j];
                    break;
                }
            }
 
            System.out.print(next + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        findNextGreaterElements(arr);
    }
}
