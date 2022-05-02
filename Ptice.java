import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    
	public static void main (String[] args) throws java.lang.Exception
	{ 
	    int n,i;
      Scanner s = new Scanner(System.in);
      char [] adrain = {'A','B','C'},
              bruno  = {'B','A','B','C'},
              goran  = {'C','C','A','A','B','B'};
        n = s.nextInt();
        char[] l = s.next().toCharArray();
        int count_a=0,count_b=0,count_g=0,max,temp;
        for(i=0;i<l.length;i++)
        {
            if(adrain[i%3]==l[i]) {count_a++;}
            if(bruno[i%4]==l[i])   {count_b++;}
            if(goran[i%6]==l[i])   {count_g++;}
        }
        
        temp=count_a>count_b?count_a:count_b;
        max=count_g>temp?count_g:temp;
        System.out.println(max);
        
        if(count_a==max)
            {System.out.println("Adrian");
               
            }
        if(count_b==max)
            {System.out.println("Bruno"); }
        if(count_g==max)
       { System.out.println("Goran"); }
	}
}