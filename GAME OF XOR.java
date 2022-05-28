import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
   static final int INT_BITS = 32;
 

static int leftRotate(int n, int d) {
     

    return (n << d) | (n >> (INT_BITS - d));
}

static int rightRotate(int n, int d) {
 
    return (n >> d) | (n << (INT_BITS - d));
}
 

public static void main(String arg[])
{
    Scanner sc =new Scanner(System.in);
    
    int n =sc.nextInt();
    int d = sc.nextInt();;
   
    System.out.print(leftRotate(n, d)+" "+rightRotate(n, d));
     
 
}
}