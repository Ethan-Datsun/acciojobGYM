import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }
 
   
    public static void main(String[] args)
    {
        int n,k;
      Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k =sc.nextInt();
        System.out.println(josephus(n, k));
    }
}