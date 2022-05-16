/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Arrays;

public class Main {
    static int toys(int[] a) {
        Arrays.sort(a);
        int containerCouter = 1, weightLimit = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > weightLimit + 4) {
                weightLimit = a[i];
                containerCouter++;
            }
        }
        return containerCouter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int result = toys(a);
        System.out.println(result);
     }
}