/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z') count++;
        }
        System.out.println(count);
    }
}