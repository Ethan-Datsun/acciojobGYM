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
        Scanner sc = new Scanner(System.in);
        long Q = sc.nextInt();

        int tag, k;
        String last, newString;
        Stack<String> stack = new Stack<>();

        while(Q-->0){
            tag = sc.nextInt();
            switch (tag){
                case 1:
                   
                    last = stack.size() > 0 ? stack.peek() : "";
                    newString = last + sc.next();
                   
                    stack.push(newString);
                    break;
                case 2:
                   
                    k = sc.nextInt();
                    last = stack.peek();
                    newString = last.substring(0, last.length()-k);
                
                    stack.push(newString);
                    break;
                case 3:
                    
                    k = sc.nextInt()-1;
                    if(stack.size() > 0) {
                        last = stack.peek();
                        String c = String.valueOf(last.charAt(k));
                       
                        System.out.println(c);
                    }
                    break;
                case 4:
                    
                    stack.pop();
                    break;
            }
        }
    }
}