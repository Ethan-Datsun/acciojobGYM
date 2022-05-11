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
	public static void main(String[] args) 
  {
	Scanner sc= new Scanner(System.in);
	int row=sc.nextInt();
	int column=sc.nextInt();
	int arr[][]=new int[row][column];
	
	
	for(int i=0;i<row;i++)
	{
	    for(int j=0;j<column;j++)
	    {
	        arr[i][j]=sc.nextInt();
	    }
	}

  int t[][]=new int[column][row];
     for(int i = 0; i < column; i++){  
            for(int j = 0; j < row; j++){  
                
                t[i][j] = arr[j][i];  
            }  
        }
    
	for(int i = 0; i < column; i++){  
            for(int j = 0; j < row; j++){  
               System.out.print(t[i][j] + " ");  
            }  
            System.out.println();  
        } 
}
}
