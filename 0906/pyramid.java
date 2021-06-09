import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Creating instance of scanner to read input from console
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            //printing n-1,n-2,..,1 spcaces for each row
            for(int j=i;j<=n-1;j++) System.out.print(" ");
            //printing 1,2,3,..,n-1 starts for each row
            for(int j=i;j>=1;j--) System.out.print("* ");
            //printing new line after each row
            System.out.println();
        }
    }
}