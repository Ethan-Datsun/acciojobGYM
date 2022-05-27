/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static class List{
        int data;
        List next;
        
        List(int d){
            data = d;
        }
    }
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   List head = null;
	   int value=sc.nextInt();
	   for(int i=0;i<value;i++){
	       List n = new List(sc.nextInt());
	       if(head==null){
	           head=n;
	       }
	       else{
	           n.next = head;
	           head = n;
	       }
	   }
	   while(head!=null){
	       System.out.print(head.data+" ");
	       head=head.next;
	   }
	}
}
