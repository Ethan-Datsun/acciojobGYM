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
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	pritpattern(n,n,true);
	}
	
	public static void pritpattern(int n,int m,boolean flag){
	    System.out.print(m+" ");
	    
	    if(flag==false && n==m)
	    return;
	    
	    if(flag){
	        if(m-5>0)
	            pritpattern(n,m-5,true);
	       else
	        pritpattern(n,m-5,false);
	    }
	    else{
	        pritpattern(n,m+5,false);
	    }
	}
}
