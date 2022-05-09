/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Stack;

public class Main
{
	static int Prec(char ch)
	{
		switch (ch)
		{
		case '+':
		case '-':
			return 1;
	
		case '*':
		case '/':
			return 2;
	
		case '^':
			return 3;
		}
		return -1;
	}
	
	static String infixToPostfix(String exp)
	{
		
		String result = new String("");
	
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i);
		
			if (Character.isLetterOrDigit(c))
				result += c;
			
			
			else if (c == '(')
				stack.push(c);
			
		
			else if (c == ')')
			{
				while (!stack.isEmpty() &&
						stack.peek() != '(')
					result += stack.pop();
				
					stack.pop();
			}
			else 
			{
				while (!stack.isEmpty() && Prec(c)
						<= Prec(stack.peek())){
				
					result += stack.pop();
			}
				stack.push(c);
			}
	
		}
	
		
		while (!stack.isEmpty()){
			if(stack.peek() == '(')
				return "Invalid Expression";
			result += stack.pop();
		}
		return result;
	}

	
	public static void main(String[] args)
  	{
        Scanner sc=new Scanner(System.in);
      
		String exp = sc.nextLine();
		System.out.println(infixToPostfix(exp));
	}
}
