import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int swapBits(int x)
    {
        for (int i = 0; i < 32; i += 2) {
            int i_bit = (x >> i) & 1; 
            int i_1_bit= (x >> (i + 1)) & 1; 
 
            x = x - (i_bit << i)- (i_1_bit << (i + 1)) + (i_bit<< (i + 1))+ (i_1_bit<< i); 
        }
        return x;
    }
 
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt(); 
      
        System.out.print(swapBits(x));
    }
}